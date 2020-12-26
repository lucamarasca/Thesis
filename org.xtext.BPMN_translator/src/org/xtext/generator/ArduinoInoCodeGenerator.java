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
	int tabulations;
	ArrayList <String> result;
	ArrayList <String> ids;
	String temp;
	String temp1;
	String temp2;
	String temp3;
	String temp4;
	String temp5;
	String includes;
	String intestation;
	String variables;
	String sens_variables;
	String loop_code;
	String setup_code;
	ArrayList <String> opened_conditions;
	int else_number;
	ArduinoInoCodeGenerator(String device, String network_protocol, String wifi_sensor, String sensor){
		this.device = device.toLowerCase().replaceAll("\\s+","");
		this.network_protocol = network_protocol.toLowerCase().replaceAll("\\s+","");
		this.wifi_sensor = wifi_sensor.toLowerCase().replaceAll("\\s+","");
		this.sensor = sensor.toLowerCase().replaceAll("\\s+","");
		ino_code = "";
	}
	ArduinoInoCodeGenerator(){
		else_number = 0;
		ids = new ArrayList<String>();
		opened_conditions = new ArrayList<String>();
		temp = "";
		temp1 = "";
		temp2 = "";
		temp3 = "";
		temp4 = "";
		temp5 = "";
		ino_code = "";
		variables = "";
		setup_code = "";
		loop_code = "";
		includes = "";
		intestation = "";
		sens_variables = "";
		tabulations = 0;
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
					
					if (!temp1.contains("\"" +app.getDatas().getBroker()+ "\";"))
						temp1 += "char* broker"+n +"= \""+app.getDatas().getBroker()+"\";\n"; 
					if (!temp2.contains("\"" +app.getDatas().getBroker_user()+ "\";"))
						temp2 += "char* broker_user"+n +"= \""+app.getDatas().getBroker_user()+"\";\n"; 
					if (!temp3.contains("\"" +app.getDatas().getBroker_password()+ "\";"))
						temp3 += "char* broker_password"+n +"= \""+app.getDatas().getBroker_password()+"\";\n"; 
					for(int j = 0; j < app.getDatas().getPubTopics().size();j++)
					{
						if (!temp4.contains("\"" + app.getDatas().getPubTopics().get(j) + "\";"))
							temp4 += "char* pubtopic"+n+j+"= \""+app.getDatas().getPubTopics().get(j)+"\";\n"; 
						if (!temp4.contains("\"" + app.getDatas().getPublish_data().get(j) + "\";"))
							temp4 += "char* pubtopicdata"+n+j+"= \""+app.getDatas().getPublish_data().get(j)+"\";\n"; 
						
					}
					for(int j = 0; j < app.getDatas().getSubTopics().size();j++)
					{
						if (!temp5.contains("\"" + app.getDatas().getSubTopics().get(j) + "\";"))
							temp5 += "char* subtopic"+n+j+"= \""+app.getDatas().getSubTopics().get(j)+"\";\n"; 
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
		variables += temp1;
		variables += temp2;
		variables += temp3;
		variables += temp4;
		variables += temp5;
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
		temp = "";
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
					temp+=("\tmy_lib.InitNetwork("+getVariableName(app.getDatas().getBroker())+");\n");
					if(!loop_code.contains("my_lib.reconnect(\"device id\", "+getVariableName(app.getDatas().getBroker_user())+", "+getVariableName(app.getDatas().getBroker_password())+", "+getVariableName(app.getDatas().getBroker())+");\n"))
						temp += "\tmy_lib.reconnect(\"device id\", "+getVariableName(app.getDatas().getBroker_user())+", "+getVariableName(app.getDatas().getBroker_password())+", "+getVariableName(app.getDatas().getBroker())+");\n";							
					int k = 0;
					for(String pubtopic : app.getDatas().getPubTopics())
					{
						String str = app.getDatas().getPublish_data().get(k);
						temp += ("\tmy_lib.sendInPubTopic("+getVariableName(pubtopic)+", "+getVariableName(str)+");\n"); 
						k++;
					}
					for (k = 0; k < tabulations;k++)
					{
						temp = temp.replaceAll("(?m)^", "\t");
					}
					loop_code+= temp;
					temp = "";
				}
				if (elements.get(n).getType().equals("exclusive_condition"))
				{
					Condition con = (Condition) elements.get(n);
					if (!con.isElse && !con.isEnd)
					{
						opened_conditions.add(elements.get(n).getType());
						Condition cond = (Condition) elements.get(n);
						temp += "\tif("+cond.getMapped_condition() + ")\n\t{\n";
						for (int k = 0; k < tabulations;k++)
						{
							temp = temp.replaceAll("(?m)^", "\t");
						}
						loop_code+= temp;
						temp = "";
						tabulations++;
					}
					else if(con.isElse)
					{
						temp += "\n}\nelse ";
						Condition cond = (Condition) elements.get(n);
						temp += "if("+cond.getMapped_condition() + ")\n";
						temp += "{\n";
						for (int k = 0; k < tabulations;k++)
						{
							temp = temp.replaceAll("(?m)^", "\t");
						}
						loop_code+= temp;
						temp = "";
					}
				}
				if( elements.get(n).getType().equals("end_condition"))
				{
					Condition cond = (Condition) elements.get(n);
					if (cond.isEnd)
					{
						temp+= "}\n";
					}
					for (int k = 0; k < tabulations;k++)
					{
						temp = temp.replaceAll("(?m)^", "\t");
					}
					loop_code+= temp;
					temp = "";
					tabulations --;
				}
				if( elements.get(n).getType().equals("inclusive_condition"))
				{
					Condition con = (Condition) elements.get(n);
					if (!con.isElse && !con.isEnd)
					{
						opened_conditions.add(elements.get(n).getType());
						Condition cond = (Condition) elements.get(n);
						temp += "\tif("+cond.getMapped_condition() + ")\n\t{\n";
						for (int k = 0; k < tabulations;k++)
						{
							temp = temp.replaceAll("(?m)^", "\t");
						}
						loop_code+= temp;
						temp = "";
						tabulations++;
					}
					else if(con.isElse)
					{
						Condition cond = (Condition) elements.get(n);
						temp += "if("+cond.getMapped_condition() + ")\n{\n";
						for (int k = 0; k < tabulations;k++)
						{
							temp = temp.replaceAll("(?m)^", "\t");
						}
						loop_code+= temp;
						temp = "";
					}
				}
				
				
				if (elements.get(n).getType().equals("dht22"))
				{
					TemperatureSensor app = (TemperatureSensor) elements.get(n);
					temp+= "\tdelay(2000);\r\n"
							+ "\t//Read data and store it to variables\r\n"
							+ "\thum"+app.getSensorId()+"= dht.readHumidity();\r\n"
							+ "\ttemp"+app.getSensorId()+"= dht.readTemperature();\n";
					for (int k = 0; k < tabulations;k++)
					{
						temp = temp.replaceAll("(?m)^", "\t");
					}
					loop_code+= temp;
					temp = "";
				}
			}
			
		}
		for (int k = 0; k < else_number; k++)
		{
			temp += "\t}\n";
		}
		for (int k = 0; k < tabulations;k++)
		{
			temp = temp.replaceAll("(?m)^", "\t");
		}
		loop_code+= temp;
		temp = "";
		tabulations = 0;
		
		else_number = 0;
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
