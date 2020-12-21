package org.xtext.generator;

import java.util.ArrayList;

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
	ArrayList <String> result;
	ArrayList <String> ids;
	String temp;
	String includes;
	String intestation;
	String variables;
	String code;
	String setup;
	
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
		setup = "";
		code = "";
		includes = "";
		intestation = "";
		result = new ArrayList<String>();
	}
	
	public ArrayList<String> Generation(ArrayList<Elements> elements) {
		includes+="#include<GeneratedLib.ino>\n\nGeneratedLib my_lib\n\n";
		intestation+= "void setup()\n{";
		intestation+= setup;
		intestation+= "\n}\n\n";
		intestation+="void loop()\n{\n";
		for (int i = 0; i < elements.size();i++)
		{
			if (!ids.contains(elements.get(i).getId()))
			{
				
				
				
				
				GenerateVariables(elements,i);
				
				GenerateCode(elements,i);
				code+="\n}\n";
				ids.add(elements.get(i).getId());
				result.add(includes+variables+intestation+code);
				temp = "";
				variables = "";
				code = "";
			}
		}
		return result;
		
	}
	//This method is used for generate the variables to use in the ino file
	private void GenerateVariables(ArrayList<Elements> elements, int i) 
	{
		if (elements.get(i).getType().equals("mqtt"))
		{
			for (int n = 0; n < elements.size(); n++)
			{
				//if they are in the same family
				if (elements.get(n).getId().equals(elements.get(i).getId()))
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
					variables += temp;
				}
			}
		}
		if (elements.get(i).getType().equals("dht22"))
		{
			for (int n = 0; n < elements.size(); n++)
			{
				//if they are in the same family
				if (elements.get(n).getId().equals(elements.get(i).getId()))
				{
					TemperatureSensor app = (TemperatureSensor) elements.get(n);
					
					variables += "float hum;  //Stores humidity value\r\n"
							  + "float temp; //Stores temperature value\n";
					
					for(int j = 0; j < app.getPins().size();j++)
					{
						if (!temp.contains(app.getPins().get(j)))
							temp += "int DHTpin" + j + "= " + app.getPins().get(j);
					}
					variables += temp;
				}
			}
		}		
	}
	
	//This method is used for generate the method of the ino file
	private void GenerateCode(ArrayList<Elements> elements, int i) 
	{
		if (elements.get(i).getType().equals("mqtt"))
		{
			for (int n = 0; n < elements.size(); n++)
			{
				if (elements.get(n).getId().equals(elements.get(i).getId()))
				{
					MQTT app = (MQTT) elements.get(n);
					if (!code.contains("my_lib.InitNetwork("+getVariableName(app.getDatas().getBroker())+");\n"));
						code+=("\tmy_lib.InitNetwork("+getVariableName(app.getDatas().getBroker())+");\n");
					if(!code.contains("my_lib.reconnect(\"device id\", "+getVariableName(app.getDatas().getBroker_user())+", "+getVariableName(app.getDatas().getBroker_password())+", "+getVariableName(app.getDatas().getBroker())+");\n"))
						code += "\tmy_lib.reconnect(\"device id\", "+getVariableName(app.getDatas().getBroker_user())+", "+getVariableName(app.getDatas().getBroker_password())+", "+getVariableName(app.getDatas().getBroker())+");\n";							
					for(String pubtopic : app.getDatas().getPubTopics())
					{
						code += ("\tmy_lib.sendInPubTopic("+getVariableName(pubtopic)+");\n"); 
					}
				}
			}
		}
	}
	public String getVariableName(String value) {
		String [] values = variables.split("= "+"\""+value+"\"");
		String [] values1 = values[0].split(" ");
		return values1[values1.length-1];
	}
	public void GenerateSetup() {
		
	}
}
