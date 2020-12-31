package org.xtext.generator;

import java.util.ArrayList;

import elements.Condition;
import elements.Elements;
import elements.Parallel;
import network.protocols.MQTT;
import sensor.devices.TemperatureSensor;


public class ArduinoInoCodeGenerator {
	String device;
	String network_protocol;
	String wifi_sensor;
	String sensor;
	String ino_code;
	String device_ID;
	Boolean schedule;
	Object o;
	int tabulations;
	ArrayList <Parallel> closed_threads;
	ArrayList <Parallel> opened_threads;
	ArrayList <String> result;
	ArrayList <String> ids;
	String temp;
	String temp1;
	String temp2;
	String temp3;
	String temp4;
	String temp5;
	String threads_code;
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
		result = new ArrayList<String>();
		ids = new ArrayList<String>();
		Initialize();
		
	}
	
	public ArrayList<String> Generation(ArrayList<Elements> elements) {
		
		for (int i = 0; i < elements.size();i++)
		{
			
			
			if (!ids.contains(elements.get(i).getId()) && elements.get(i).getId() != "global_id")
			{			
				GenerateVariables(elements,i);
				GenerateSetupCode(elements,i);
				GenerateLoopCode(elements,i);
				includes+="#include<GeneratedLib.h>\n\nGeneratedLib my_lib;\n\n";
				intestation+= "void setup()\n{\n\n";
				intestation+= setup_code;
				intestation+= "\n}\n\n";
				intestation+="void loop()\n{\n";
				loop_code+="\n}\n";
				if (!elements.get(i).getId().equals("global_id"))
					ids.add(elements.get(i).getId());
				for (int j = 0; j < closed_threads.size();j++)
				{
					
					threads_code += "void task" + closed_threads.get(j).getNumber()+ "(void *pvParameters)\n"
							+ "{\n"
							+ closed_threads.get(j).getBody()
							+ "}\n";
				}
				result.add(includes+variables+threads_code+intestation+loop_code);
				Initialize();
				
				
				
			}
		}
		return result;
		
	}
	private void Initialize() {
		else_number = 0;
		opened_conditions = new ArrayList<String>();
		temp = "";
		temp1 = "";
		temp2 = "";
		temp3 = "";
		temp4 = "";
		temp5 = "";
		schedule = false;
		ino_code = "";
		variables = "";
		setup_code = "";
		loop_code = "";
		includes = "";
		intestation = "";
		sens_variables = "";
		threads_code = "";
		tabulations = 0;
		closed_threads = new ArrayList<Parallel>();
		opened_threads = new ArrayList<Parallel>();
		
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
			if (elements.get(n).getId().equals(elements.get(i).getId()) || elements.get(n).getId().equals("global_id"))
			{
				
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
					k=0;
					for(String subtopic : app.getDatas().getSubTopics())
					{
						temp += ("\tmy_lib.Subscribe("+getVariableName(subtopic)+");\n"); 
						k++;
					}
					for (k = 0; k < tabulations;k++)
					{
						temp = temp.replaceAll("(?m)^", "\t");
					}
					if (opened_threads.size() > 0)
						opened_threads.get(opened_threads.size()-1).addBody(temp);
					else
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
						if (opened_threads.size() > 0)
							opened_threads.get(opened_threads.size()-1).addBody(temp);
						else
							loop_code+= temp;
						temp = "";
						tabulations++;
					}
					else if(con.isElse)
					{
						tabulations++;
						temp += "\nelse ";
						Condition cond = (Condition) elements.get(n);
						temp += "if("+cond.getMapped_condition() + ")\n";
						temp += "{\n";
						for (int k = 0; k < tabulations;k++)
						{
							temp = temp.replaceAll("(?m)^", "\t");
						}
						if (opened_threads.size() > 0)
							opened_threads.get(opened_threads.size()-1).addBody(temp);
						else
							loop_code+= temp;
						temp = "";
					}
				}
				if( elements.get(n).getType().equals("end_condition") || elements.get(n).getType().equals("end_condition_end"))
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
					if (opened_threads.size() > 0)
						opened_threads.get(opened_threads.size()-1).addBody(temp);
					else
						loop_code+= temp;
					temp = "";
					if (tabulations > 0 )
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
						if (opened_threads.size() > 0)
							opened_threads.get(opened_threads.size()-1).addBody(temp);
						else
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
						if (opened_threads.size() > 0)
							opened_threads.get(opened_threads.size()-1).addBody(temp);
						else
							loop_code+= temp;
						temp = "";
						tabulations++;
					}
				}
				if( elements.get(n).getType().equals("loop_condition"))
				{
					Condition con = (Condition) elements.get(n);
					if (!con.isElse && !con.isEnd)
					{
						opened_conditions.add(elements.get(n).getType());
						Condition cond = (Condition) elements.get(n);
						temp += "\twhile("+cond.getMapped_condition() + ")\n\t{\n";
						for (int k = 0; k < tabulations;k++)
						{
							temp = temp.replaceAll("(?m)^", "\t");
						}
						if (opened_threads.size() > 0)
							opened_threads.get(opened_threads.size()-1).addBody(temp);
						else
							loop_code+= temp;
						temp = "";
						tabulations++;
					}
					else if(con.isElse)
					{
						Condition cond = (Condition) elements.get(n);
						temp += "while("+cond.getMapped_condition() + ")\n{\n";
						for (int k = 0; k < tabulations;k++)
						{
							temp = temp.replaceAll("(?m)^", "\t");
						}
						if (opened_threads.size() > 0)
							opened_threads.get(opened_threads.size()-1).addBody(temp);
						else
							loop_code+= temp;
						temp = "";
						tabulations++;
					}
				}
				if( elements.get(n).getType().equals("thread"))
				{
					
					schedule = true;
					if (opened_threads.size() == 0)
					{
						
						opened_threads.add((Parallel) elements.get(n));
						temp = "\txTaskCreate(task"+opened_threads.get(opened_threads.size()-1).getNumber()+", \"task"+opened_threads.get(opened_threads.size()-1).getNumber()+"\", 128, NULL, 1, NULL);\n";
						for (int k = 0; k < tabulations;k++)
						{
							temp = temp.replaceAll("(?m)^", "\t");
						}
						if (!loop_code.contains("xTaskCreate") || loop_code.lastIndexOf("if(") > loop_code.lastIndexOf("128, NULL, 1, NULL);")+20 || loop_code.lastIndexOf("while(") > loop_code.lastIndexOf("128, NULL, 1, NULL);")+20)
							loop_code += temp;
						else
						{
						
							
							String str = new StringBuilder(loop_code).insert(loop_code.lastIndexOf("128, NULL, 1, NULL);")+20,"\n"+temp).toString();
							loop_code = str;
						}
					}
					else if (opened_threads.size() > 0)
					{
						opened_threads.add((Parallel) elements.get(n));
						temp = "\txTaskCreate(task"+opened_threads.get(opened_threads.size()-1).getNumber()+", \"task"+opened_threads.get(opened_threads.size()-1).getNumber()+"\", 128, NULL, 1, NULL);\n";
						for (int k = 0; k < tabulations;k++)
						{
							temp = temp.replaceAll("(?m)^", "\t");
						}
						if (!loop_code.contains("xTaskCreate") || loop_code.lastIndexOf("if(") > loop_code.lastIndexOf("128, NULL, 1, NULL);")+20 || loop_code.lastIndexOf("while(") > loop_code.lastIndexOf("128, NULL, 1, NULL);")+20)

						if (!opened_threads.get(opened_threads.size()-2).getBody().contains("xTaskCreate") || opened_threads.get(opened_threads.size()-2).getBody().lastIndexOf("if(") > loop_code.lastIndexOf("128, NULL, 1, NULL);")+20 || opened_threads.get(opened_threads.size()-2).getBody().lastIndexOf("while(") > loop_code.lastIndexOf("128, NULL, 1, NULL);")+20 )
							opened_threads.get(opened_threads.size()-2).addBody(temp);
						else
						{
							
							String str = new StringBuilder(opened_threads.get(opened_threads.size()-2).getBody()).insert(opened_threads.get(opened_threads.size()-2).getBody().indexOf("\txTaskCreate"),temp).toString();
							opened_threads.get(opened_threads.size()-2).addBody(str);
						}
						
					}
					temp = "";
				}
				if( elements.get(n).getType().equals("end_thread") && opened_threads.size() > 0)
				{
					closed_threads.add(opened_threads.get(opened_threads.size()-1));
					opened_threads.remove(opened_threads.size()-1);
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
					if (opened_threads.size() > 0)
						opened_threads.get(opened_threads.size()-1).addBody(temp);
					else
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
		if (opened_threads.size() > 0)
			opened_threads.get(opened_threads.size()-1).addBody(temp);
		else
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
