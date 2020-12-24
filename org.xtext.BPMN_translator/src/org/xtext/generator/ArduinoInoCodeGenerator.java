package org.xtext.generator;

import java.util.ArrayList;

import elements.Condition;
import elements.Elements;
import network.protocols.MQTT;
import sensor.devices.TemperatureSensor;


public class ArduinoInoCodeGenerator {
	String device;
	String network_protocol;
	String wifi_sensor;
	String sensor;
	String ino_code;
	String device_ID;
	Object o;
	int inclusive_conditions;
	int exclusive_conditions;
	ArrayList <String> result;
	ArrayList <String> ids;
	String temp;
	String includes;
	String intestation;
	String variables;
	String sens_variables;
	String loop_code;
	String setup_code;
	
	
	ArduinoInoCodeGenerator(String device, String network_protocol, String wifi_sensor, String sensor){
		this.device = device.toLowerCase().replaceAll("\\s+","");
		this.network_protocol = network_protocol.toLowerCase().replaceAll("\\s+","");
		this.wifi_sensor = wifi_sensor.toLowerCase().replaceAll("\\s+","");
		this.sensor = sensor.toLowerCase().replaceAll("\\s+","");
		ino_code = "";
	}
	ArduinoInoCodeGenerator(){
		
		ids = new ArrayList<String>();
		temp = "";
		ino_code = "";
		variables = "";
		setup_code = "";
		loop_code = "";
		includes = "";
		intestation = "";
		sens_variables = "";
		inclusive_conditions = 0;
		exclusive_conditions = 0;
		result = new ArrayList<String>();
	}
	
	public ArrayList<String> Generation(ArrayList<Elements> elements) {
		
		for (int i = 0; i < elements.size();i++)
		{
			
			
			if (!ids.contains(elements.get(i).getId()))
			{			
				GenerateVariables(elements,i);
				GenerateSetupCode(elements,i);
				GenerateLoopCode(elements,i);
				includes+="#include<GeneratedLib.ino>\n\nGeneratedLib my_lib;\n\n";
				intestation+= "void setup()\n{\n\n";
				intestation+= setup_code;
				intestation+= "\n}\n\n";
				intestation+="void loop()\n{\n";
				loop_code+="\n}\n";
				
				ids.add(elements.get(i).getId());
				
				result.add(includes+variables+intestation+loop_code);
				temp = "";
				variables = "";
				sens_variables = "";
				loop_code = "";
				
				
			}
		}
		return result;
		
	}
	//This method is used for generate the variables to use in the ino file
	private void GenerateVariables(ArrayList<Elements> elements, int i) 
	{
		
		for (int n = 0; n < elements.size(); n++)
		{
			//if they are in the same family
			if (elements.get(n).getId().equals(elements.get(i).getId()))
			{
				if (elements.get(n).getType().equals("mqtt"))
				{
				
					MQTT app = (MQTT) elements.get(n);
					
					if (!variables.contains(app.getDatas().getBroker()))
						variables += "char* broker"+n +"= \""+app.getDatas().getBroker()+"\";\n"; 
					if (!variables.contains(app.getDatas().getBroker_user()))
						variables += "char* broker_user"+n +"= \""+app.getDatas().getBroker_user()+"\";\n"; 
					if (!variables.contains(app.getDatas().getBroker_password()))
						variables += "char* broker_password"+n +"= \""+app.getDatas().getBroker_password()+"\";\n"; 
					for(int j = 0; j < app.getDatas().getPubTopics().size();j++)
					{
						if (!variables.contains(app.getDatas().getPubTopics().get(j)))
							variables += "char* pubtopic"+n+j+"= \""+app.getDatas().getPubTopics().get(j)+"\";\n"; 
						
					}
					for(int j = 0; j < app.getDatas().getSubTopics().size();j++)
					{
						if (!temp.contains(app.getDatas().getSubTopics().get(j)))
							temp += "char* subtopic"+n+j+"= \""+app.getDatas().getSubTopics().get(j)+"\";\n"; 
					}
					
				}
			
				
				if (elements.get(n).getType().equals("dht22"))
				{
					TemperatureSensor app = (TemperatureSensor) elements.get(n);
					
					if (!sens_variables.contains("float hum"+ app.getSensorId()))
						sens_variables += "float hum"+app.getSensorId()+"; //Stores humidity value\r\n";
					if (!sens_variables.contains("float temp"+ app.getSensorId()))
						sens_variables += "float temp"+app.getSensorId()+"; //Stores temperature value value\r\n";
						
					
					
					
					if (!sens_variables.contains("int pin"+ app.getSensorId()))
						sens_variables += "int pin"+ app.getSensorId()  + "= " + app.getPins().get(0)+"\n";
					
				}
			}
		}	
		variables += temp;
		variables += sens_variables;
	}
	private void GenerateSetupCode(ArrayList<Elements> elements, int i) {
		for (int n = 0; n < elements.size(); n++)
		{
			if (elements.get(n).getType().equals("dht22"))
			{
				if (elements.get(n).getId().equals(elements.get(i).getId()))
				{
					TemperatureSensor app = (TemperatureSensor) elements.get(n);
					
					if (!setup_code.contains("Serial.begin(9600);"))
						setup_code+="\tSerial.begin(9600);\n";
					if (!setup_code.contains("InitDHT22("))
						setup_code+="\tInitDHT22("+getIntVariableName(app.getPins().get(0))+");\n";
				
					
				}
			}
		}
	}
	//This method is used for generate the method of the ino file
	private void GenerateLoopCode(ArrayList<Elements> elements, int i) 
	{
		for (int n = 0; n < elements.size(); n++)
		{
			if (elements.get(n).getId().equals(elements.get(i).getId()))
			{
				System.out.println("n id: " + elements.get(n).getId()
						+ "i id: " + elements.get(i).getId());
				if (elements.get(n).getType().equals("mqtt"))
				{
					MQTT app = (MQTT) elements.get(n);
					if (!loop_code.contains("my_lib.InitNetwork("+getVariableName(app.getDatas().getBroker())+");\n"));
					loop_code+=("\tmy_lib.InitNetwork("+getVariableName(app.getDatas().getBroker())+");\n");
					if(!loop_code.contains("my_lib.reconnect(\"device id\", "+getVariableName(app.getDatas().getBroker_user())+", "+getVariableName(app.getDatas().getBroker_password())+", "+getVariableName(app.getDatas().getBroker())+");\n"))
						loop_code += "\tmy_lib.reconnect(\"device id\", "+getVariableName(app.getDatas().getBroker_user())+", "+getVariableName(app.getDatas().getBroker_password())+", "+getVariableName(app.getDatas().getBroker())+");\n";							
					for(String pubtopic : app.getDatas().getPubTopics())
					{
						loop_code += ("\tmy_lib.sendInPubTopic("+getVariableName(pubtopic)+");\n"); 
					}
				}
				if (elements.get(n).getType().equals("exclusive_condition") || elements.get(n).getType().equals("inclusive_condition"))
				{
					
					Condition cond = (Condition) elements.get(n);
					loop_code += "if("+cond.getMapped_condition() + ")\n{\n";
					inclusive_conditions++;
					
				}
				if (elements.get(n).getType().equals("exclusive_condition_end"))
				{
					loop_code += "}\nelse";
					if (n+1 < elements.size())
					{
						if (!elements.get(n+1).equals("exclusive_condition"))
						{
							loop_code += "{\n";
						}
					}
				}
				if (elements.get(n).getType().equals("inclusive_condition_end"))
				{
					loop_code+= "}\n";
				}
				if (elements.get(n).getType().equals("dht22"))
				{
					TemperatureSensor app = (TemperatureSensor) elements.get(n);
					loop_code+= "\tdelay(2000);\r\n"
							+ "\t//Read data and store it to variables\r\n"
							+ "\thum"+app.getSensorId()+"= dht.readHumidity();\r\n"
							+ "\ttemp"+app.getSensorId()+"= dht.readTemperature();\n";
					
				}
			}
			
		}
		inclusive_conditions = 0;
		exclusive_conditions = 0;
	}
	public String getVariableName(String value) {
		String [] values = variables.split("= "+"\""+value+"\"");
		String [] values1 = values[0].split(" ");
		return values1[values1.length-1];
	}
	public String getIntVariableName( String value) {
		String [] values = variables.split("= "+value);
		String [] values1 = values[0].split(" ");
		return values1[values1.length-1];
	}
	
}
