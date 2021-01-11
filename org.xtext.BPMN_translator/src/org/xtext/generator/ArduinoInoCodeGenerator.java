package org.xtext.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import elements.Condition;
import elements.Elements;
import elements.Parallel;
import network.protocols.HTTP;
import network.protocols.MQTT;
import sensor.devices.DistanceSensor;
import sensor.devices.GasSensor;
import sensor.devices.Led;
import sensor.devices.LightSensor;
import sensor.devices.TemperatureSensor;


public class ArduinoInoCodeGenerator {
	String device;
	String network_protocol;
	String wifi_sensor;
	String sensor;
	String ino_code;
	String device_ID;
	Boolean schedule;
	Map<String, String> variables_dictionary;
	Object o;
	int tabulations;
	ArrayList <Parallel> closed_threads;
	ArrayList <Parallel> opened_threads;
	ArrayList <String> result;
	ArrayList <String> ids;
	String temp;
	String ssid;
	String wifi_password;
	String brokers;
	String broker_users;
	String broker_passwords;
	String server_ip;
	String header;
	String content_type;
	String datas;
	String pub_topics;
	String pub_datas;
	String sub_topics;
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
				mapVariables();
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
		ssid = "";
		wifi_password = "";
		brokers = "";
		broker_users = "";
		broker_passwords = "";
		pub_topics = "";
		pub_datas = "";
		sub_topics = "";
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
		server_ip = "";
		header = "";
		content_type = "";
		datas = "";
		variables_dictionary = new HashMap<String, String>();
		variables_dictionary.put("TEMPERATURE", "temp");
		variables_dictionary.put("HUMIDITY", "hum");
		variables_dictionary.put("DISTANCE", "distance");
		variables_dictionary.put("LIGHT", "light");
		variables_dictionary.put("GAS", "gas");
		opened_threads.clear();
		closed_threads.clear();
		
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
					if (!ssid.contains("\"" +app.getDatas().getWifi_ssid().get(0)+ "\";"))
						ssid += "char* ssid"+n +"= \""+app.getDatas().getWifi_ssid().get(0)+"\";\n";
					if (!wifi_password.contains("\"" +app.getDatas().getWifi_pass().get(0)+ "\";"))
						wifi_password += "char* wifi_password"+n +"= \""+app.getDatas().getWifi_pass().get(0)+"\";\n"; 
					if (!brokers.contains("\"" +app.getDatas().getBroker()+ "\";"))
						brokers += "char* broker"+n +"= \""+app.getDatas().getBroker()+"\";\n"; 
					if (!broker_users.contains("\"" +app.getDatas().getBroker_user()+ "\";"))
						broker_users += "char* broker_user"+n +"= \""+app.getDatas().getBroker_user()+"\";\n"; 
					if (!broker_passwords.contains("\"" +app.getDatas().getBroker_password()+ "\";"))
						broker_passwords += "char* broker_password"+n +"= \""+app.getDatas().getBroker_password()+"\";\n"; 
					for(int j = 0; j < app.getDatas().getPubTopics().size();j++)
					{
						if (!pub_topics.contains("\"" + app.getDatas().getPubTopics().get(j) + "\";"))
							pub_topics += "char* pubtopic"+n+j+"= \""+app.getDatas().getPubTopics().get(j)+"\";\n"; 
						if (!pub_datas.contains("\"" + app.getDatas().getPublish_data().get(j) + "\";"))
							pub_datas += "char* pubtopicdata"+n+j+"= \""+app.getDatas().getPublish_data().get(j)+"\";\n"; 
						
					}
					for(int j = 0; j < app.getDatas().getSubTopics().size();j++)
					{
						if (!sub_topics.contains("\"" + app.getDatas().getSubTopics().get(j) + "\";"))
							sub_topics += "char* subtopic"+n+j+"= \""+app.getDatas().getSubTopics().get(j)+"\";\n"; 
					}
					
				}
				if (elements.get(n).getType().equals("http-get"))
				{
				
					HTTP app = (HTTP) elements.get(n);
					if (!ssid.contains("\"" +app.getDatas().getWifi_ssid().get(0)+ "\";"))
						ssid += "char* ssid"+n +"= \""+app.getDatas().getWifi_ssid().get(0)+"\";\n";
					if (!wifi_password.contains("\"" +app.getDatas().getWifi_pass().get(0)+ "\";"))
						wifi_password += "char* wifi_password"+n +"= \""+app.getDatas().getWifi_pass().get(0)+"\";\n"; 
					if (!server_ip.contains("\"" +app.getDatas().getServer_ip()+ "\";"))
						server_ip += "char* server_ip"+n +"= \""+app.getDatas().getServer_ip()+"\";\n"; 
				}
				if (elements.get(n).getType().equals("http-post"))
				{
				
					HTTP app = (HTTP) elements.get(n);
					if (!ssid.contains("\"" +app.getDatas().getWifi_ssid().get(0)+ "\";"))
						ssid += "char* ssid"+n +"= \""+app.getDatas().getWifi_ssid().get(0)+"\";\n";
					if (!wifi_password.contains("\"" +app.getDatas().getWifi_pass().get(0)+ "\";"))
						wifi_password += "char* wifi_password"+n +"= \""+app.getDatas().getWifi_pass().get(0)+"\";\n"; 
					if (!server_ip.contains("\"" +app.getDatas().getServer_ip()+ "\";"))
						server_ip += "char* server_ip"+n +"= \""+app.getDatas().getServer_ip()+"\";\n"; 
					if (!header.contains("\"" +app.getDatas().getHeader()+ "\";"))
						header += "char* header"+n +"= \""+app.getDatas().getHeader()+"\";\n"; 
					if (!content_type.contains("\"" +app.getDatas().getContent_type()+ "\";"))
						content_type += "char* content_type"+n +"= \""+app.getDatas().getContent_type()+"\";\n"; 
					
					for(int j = 0; j < app.getDatas().getDatas().size();j++)
					{
						if (!datas.contains("\"" + app.getDatas().getDatas().get(j) + "\";"))
							datas += "char* send_data"+n+j+"= \""+app.getDatas().getDatas().get(j)+"\";\n"; 
						
					}	
				}
				if (elements.get(n).getType().equals("dht22") || elements.get(n).getType().equals("dht11"))
				{
					TemperatureSensor app = (TemperatureSensor) elements.get(n);
					if (elements.get(n).getType().equals("dht11"))
					{
						if (!sens_variables.contains("dht DHT"+ app.getSensorId()))
							sens_variables += "dht DHT"+app.getSensorId()+"; //used for work with the sensor\r\n";
					}
					if (!sens_variables.contains("float hum"+ app.getSensorId()))
						sens_variables += "float hum"+app.getSensorId()+"; //Stores humidity value\r\n";
					if (!sens_variables.contains("float temp"+ app.getSensorId()))
						sens_variables += "float temp"+app.getSensorId()+"; //Stores temperature value value\r\n";
					if (!sens_variables.contains("int pin"+ app.getSensorId() + "= "+ app.getPins().get(0)))
						sens_variables += "int pin"+ app.getSensorId()  + "= " + app.getPins().get(0)+";\n";
				}
				if (elements.get(n).getType().equals("tmp36"))
				{
					TemperatureSensor app = (TemperatureSensor) elements.get(n);
					if (!sens_variables.contains("val_adc"+app.getSensorId()))
						sens_variables += "int val_adc"+app.getSensorId()+"; //adc value readed\n";
					if (!sens_variables.contains("voltage"+app.getSensorId()))
						sens_variables += "float voltage"+app.getSensorId() + "; //Voltage value\n";
					if (!sens_variables.contains("float temp"+ app.getSensorId()))
						sens_variables += "float temp"+app.getSensorId()+"; //Stores temperature value value\r\n";
					if (!sens_variables.contains("int pin"+ app.getSensorId() + "= "+ app.getPins().get(0)))
						sens_variables += "int pin"+ app.getSensorId()  + "= " + app.getPins().get(0)+";\n";
				}
				if (elements.get(n).getType().equals("led"))
				{
					Led app = (Led) elements.get(n);
					if (!sens_variables.contains("int led_pin"+ app.getSensorId() + "= "+ app.getPins().get(0)))
						sens_variables += "int led_pin"+ app.getSensorId()  + "= " + app.getPins().get(0)+";\n";
				}
				if (elements.get(n).getType().equals("hc-sr04") || elements.get(n).getType().equals("hy-srf05"))
				{
					DistanceSensor app = (DistanceSensor) elements.get(n);
					
					if (!sens_variables.contains("int distance"+ app.getSensorId()))
						sens_variables += "int distance"+app.getSensorId()+"; //Stores distance value\r\n";
					for (int y = 0; y < app.getPins().size() ; y++)
					{
						if (!sens_variables.contains("int pin"+ app.getSensorId() + "= " + app.getPins().get(y)))
							sens_variables += "int pin"+ app.getSensorId() + app.getPins().get(y)  + "= " + app.getPins().get(y)+";\n";
					}
					
				}
				if (elements.get(n).getType().equals("mq9"))
				{
					GasSensor app = (GasSensor) elements.get(n);
					
					if (!sens_variables.contains("float gas"+ app.getSensorId()))
						sens_variables += "float gas"+app.getSensorId()+"; //Stores value\r\n";
					for (int y = 0; y < app.getPins().size() ; y++)
					{
						if (!sens_variables.contains("int pin"+ app.getSensorId() + "= " + app.getPins().get(y)))
							sens_variables += "int pin"+ app.getSensorId() + app.getPins().get(y)  + "= " + app.getPins().get(y)+";\n";
					}
					
				}
				if (elements.get(n).getType().equals("lm358"))
				{
					LightSensor app = (LightSensor) elements.get(n);
					
					if (!sens_variables.contains("float light"+ app.getSensorId()))
						sens_variables += "float light"+app.getSensorId()+"; //Stores value\r\n";
					for (int y = 0; y < app.getPins().size() ; y++)
					{
						if (!sens_variables.contains("int pin"+ app.getSensorId() + "= " + app.getPins().get(y)))
							sens_variables += "int pin"+ app.getSensorId() + app.getPins().get(y)  + "= " + app.getPins().get(y)+";\n";
					}
					
				}
			}
		}	
		variables += ssid;
		variables += wifi_password;
		variables += brokers;
		variables += broker_users;
		variables += broker_passwords;
		variables += pub_topics;
		variables += pub_datas;
		variables += sub_topics;
		variables += server_ip;
		variables += header;
		variables += content_type;
		variables += datas;
		sens_variables += variables ;
		variables = sens_variables;
		
	}
	private void GenerateSetupCode(ArrayList<Elements> elements, int i) {
		
		for (int n = 0; n < elements.size(); n++)
		{
			if (elements.get(n).getType().equals("dht22"))
			{
				if (elements.get(n).getId().equals(elements.get(i).getId()))
				{
					TemperatureSensor app = (TemperatureSensor) elements.get(n);
					setup_code+="\tSerial.begin(9600);\n";
					setup_code+="\tInitDHT22("+getIntVariableName(app.getPins().get(0))+");\n";	
				}
			}
			if (elements.get(n).getType().equals("led"))
			{
				if (elements.get(n).getId().equals(elements.get(i).getId()))
				{
					Led app = (Led) elements.get(n);
					if (!setup_code.contains("pinMode(" + getIntVariableName(app.getPins().get(0)) + ", OUTPUT);"))
						setup_code+="\tpinMode(" + getIntVariableName(app.getPins().get(0)) + ", OUTPUT);\n";
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
					int k = 0;
					if(app.getWifi_module().equals("w5100"))
					{
						temp+=("\tmy_lib.InitMQTTConnectionW5100("+getVariableName(app.getDatas().getBroker())+", \"your mac address\");\n");
						for(String pubtopic : app.getDatas().getPubTopics())
						{
							String str = app.getDatas().getPublish_data().get(k);
							if (str.contains("["))
							{
								temp += ("\tdtostrf("+getMappedVariable(str)+", 6, 2, "+getVariableName(str)+");\n");
							}
							temp += ("\tmy_lib.sendInPubTopicW5100("+getVariableName(pubtopic)+", "+getVariableName(str)+");\n"); 
							k++;
						}
						k=0;
						
						for(String subtopic : app.getDatas().getSubTopics())
						{
							temp += ("\tmy_lib.SubscribeW5100("+getVariableName(subtopic)+");\n"); 
							k++;
						}
					}
					else {
					
						temp+=("\tmy_lib.InitNetwork("+getVariableName(app.getDatas().getBroker())+"," + getVariableName(app.getDatas().getWifi_ssid().get(0)) + "," + getVariableName(app.getDatas().getWifi_pass().get(0))+");\n");
						temp += "\tmy_lib.reconnect(\"device id\", "+getVariableName(app.getDatas().getBroker_user())+", "+getVariableName(app.getDatas().getBroker_password())+", "+getVariableName(app.getDatas().getBroker())+");\n";							
						
						
						for(String pubtopic : app.getDatas().getPubTopics())
						{
							String str = app.getDatas().getPublish_data().get(k);
							if (str.contains("["))
							{
								temp += ("\tdtostrf("+getMappedVariable(str)+", 6, 2, "+getVariableName(str)+");\n");
							}
							temp += ("\tmy_lib.sendInPubTopic("+getVariableName(pubtopic)+", "+getVariableName(str)+");\n"); 
							k++;
						}
						k=0;
						
						for(String subtopic : app.getDatas().getSubTopics())
						{
							
							temp += ("\tmy_lib.Subscribe("+getVariableName(subtopic)+");\n"); 
							k++;
						}
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
				if (elements.get(n).getType().equals("http-get"))
				{
					HTTP app = (HTTP) elements.get(n);
					if(app.getWifi_module().equals("w5100"))
					{
						temp+=("\tmy_lib.initConnectionW5100({ 0x00, 0xAB, 0xBC, 0xCC, 0xDE, 0x01 },"+app.getDatas().getServer_ip()+", \"your mac address\", \"your dns\");\n");
						temp += "\tmy_lib.sendGetRequestW5100();\n";	
					 
					}
					else 
					{
						temp+=("\tmy_lib.setupWiFiHTTP("+getVariableName(app.getDatas().getWifi_ssid().get(0))+"," + getVariableName(app.getDatas().getWifi_pass().get(0))+");\n");
						temp += "\tmy_lib.sendGetRequest("+getVariableName(app.getDatas().getServer_ip())+");\n";	
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
				}
				if (elements.get(n).getType().equals("http-post"))
				{
					HTTP app = (HTTP) elements.get(n);
					if(app.getWifi_module().equals("w5100"))
					{
						temp+=("\tmy_lib.initConnectionW5100({ 0x00, 0xAB, 0xBC, 0xCC, 0xDE, 0x01 },"+app.getDatas().getServer_ip()+", \"your mac address\", \"your dns\");\n");
						for (int k = 0; k < app.getDatas().getDatas().size();k++)
						{
							if (app.getDatas().getDatas().get(k).contains("["))
								temp += ("\tdtostrf("+getMappedVariable(app.getDatas().getDatas().get(k))+", 6, 2, "+getVariableName(app.getDatas().getDatas().get(k))+");\n");
							temp += "\tmy_lib.sendPostRequestW5100("+getVariableName(app.getDatas().getServer_ip())+","+getVariableName(app.getDatas().getContent_type())+","+getVariableName(app.getDatas().getHeader())+","+getVariableName(app.getDatas().getDatas().get(k))+");\n";
						}
					}
					else 
					{
						temp+=("\tmy_lib.setupWiFiHTTP("+getVariableName(app.getDatas().getWifi_ssid().get(0))+"," + getVariableName(app.getDatas().getWifi_pass().get(0))+");\n");
						for (int k = 0; k < app.getDatas().getDatas().size();k++)
						{
							if (app.getDatas().getDatas().get(k).contains("["))
								temp += ("\tdtostrf("+getMappedVariable(app.getDatas().getDatas().get(k))+", 6, 2, "+getVariableName(app.getDatas().getDatas().get(k))+");\n");
							temp += "\tmy_lib.sendPost("+getVariableName(app.getDatas().getServer_ip())+","+getVariableName(app.getDatas().getContent_type())+","+getVariableName(app.getDatas().getHeader())+","+getVariableName(app.getDatas().getDatas().get(k))+");\n";
					
						}
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
						
						Condition cond = (Condition) elements.get(n);
						temp += "\telse if("+cond.getMapped_condition() + ")\n";
						temp += "\t{\n";
						for (int k = 0; k < tabulations;k++)
						{
							temp = temp.replaceAll("(?m)^", "\t");
						}
						if (opened_threads.size() > 0)
							opened_threads.get(opened_threads.size()-1).addBody(temp);
						else
							loop_code+= temp;
						tabulations++;
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
						temp = "";
						
						opened_threads.add((Parallel) elements.get(n));
						opened_threads.get((opened_threads.size()-1)).setBody("");
						
					}
					else if (opened_threads.size() > 0)
					{
						temp = "";
						opened_threads.add((Parallel) elements.get(n));
						opened_threads.get((opened_threads.size()-1)).setBody("");
						
					}
					temp = "";
				}
				if( elements.get(n).getType().equals("end_thread") && opened_threads.size() > 0)
				{
					
					if (opened_threads.size() == 1)
					{
						
						if (!opened_threads.get(opened_threads.size()-1).getBody().equals(""))
						{
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
							closed_threads.add(opened_threads.get(opened_threads.size()-1));
						}
					}
					else
					{
						temp = "\txTaskCreate(task"+opened_threads.get(opened_threads.size()-1).getNumber()+", \"task"+opened_threads.get(opened_threads.size()-1).getNumber()+"\", 128, NULL, 1, NULL);\n";
						for (int k = 0; k < tabulations;k++)
						{
							temp = temp.replaceAll("(?m)^", "\t");
						}

						if (!opened_threads.get(opened_threads.size()-2).getBody().contains("xTaskCreate") || opened_threads.get(opened_threads.size()-2).getBody().lastIndexOf("if(") > loop_code.lastIndexOf("128, NULL, 1, NULL);")+20 || opened_threads.get(opened_threads.size()-2).getBody().lastIndexOf("while(") > loop_code.lastIndexOf("128, NULL, 1, NULL);")+20 )
							opened_threads.get(opened_threads.size()-2).addBody(temp);
						else
						{
							
							String str = new StringBuilder(opened_threads.get(opened_threads.size()-2).getBody()).insert(opened_threads.get(opened_threads.size()-2).getBody().indexOf("\txTaskCreate"),temp).toString();
							opened_threads.get(opened_threads.size()-2).setBody(str);
						}
					}
					temp = "";
					opened_threads.remove(opened_threads.size()-1);
				}
				if (elements.get(n).getType().equals("led"))
				{
					Led app = (Led) elements.get(n);
					if (app.getOn_off())
					temp+=  "\t//Turn on the led\r\n"
						+	"\tdigitalWrite("+getIntVariableName(app.getPins().get(0))+", HIGH);\n";
					if (!app.getOn_off())
						temp+=  "\t//Turn off the led\r\n"
							+	"\tdigitalWrite("+getIntVariableName(app.getPins().get(0))+", LOW);\n";
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
				if (elements.get(n).getType().equals("tmp36"))
				{
					TemperatureSensor app = (TemperatureSensor) elements.get(n);
					temp+= "\t//Read data and store it to variables\r\n"
						+  "\tval_adc"+app.getSensorId()+"= analogRead("+ getIntVariableName(app.getPins().get(0)) + ");\n"
						+  "\tvoltage"+app.getSensorId()+"= ("+ "\tval_adc"+app.getSensorId() + "/ 1024.0) * 5.0;\n"
						+  "\ttemp"+app.getSensorId()+"= (voltage" +app.getSensorId() + "- .5) * 1000;\n";

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
				if (elements.get(n).getType().equals("dht11"))
				{
					TemperatureSensor app = (TemperatureSensor) elements.get(n);
					temp+= "\tdelay(2000);\r\n"
							+ "\t//Read data and store it to variables\r\n"
							+ "\tDHT"+ app.getSensorId()+".read11(pin"+app.getSensorId()+");\n"
							+ "\thum"+app.getSensorId()+"= DHT"+ app.getSensorId()+".temperature;\n"
							+ "\ttemp"+app.getSensorId()+"= DHT"+ app.getSensorId()+".humidity;\n";
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
				if (elements.get(n).getType().equals("mq9"))
				{
					GasSensor app = (GasSensor) elements.get(n);
					temp+=  "\t//Read data and store it to variables\r\n"
							+ "\tgas"+app.getSensorId()+"= my_lib.ReadMQ9(pin"+app.getSensorId()+");\n";
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
				if (elements.get(n).getType().equals("lm358"))
				{
					LightSensor app = (LightSensor) elements.get(n);
					temp+=  "\t//Read data and store it to variables\r\n"
							+ "\tlight"+app.getSensorId()+"= my_lib.Readlm358(pin"+app.getSensorId()+");\n";
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
				if (elements.get(n).getType().equals("hc-sr04") || elements.get(n).getType().equals("hy-srf05"))
				{
					DistanceSensor app = (DistanceSensor) elements.get(n);
					temp+= "\t//Read data and store it to variables\r\n"
						+  "\tmy_lib.InitHCSR04(pin"+ app.getSensorId() + app.getPins().get(0)  +", pin"+ app.getSensorId() + app.getPins().get(1)  + ");\n"
						+  "\tdistance"+app.getSensorId()+" = my_lib.ReadDistanceHCSR04(pin"+ app.getSensorId() + app.getPins().get(0)  +", pin"+ app.getSensorId() + app.getPins().get(1)  + ");\n";

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
		String [] values;
		if (value.contains("["))	
		{
			value = value.replaceAll("\\[.*\\]", "");
			values = variables.split("= "+"\""+value);
		}
		else
		{
			values = variables.split("= "+"\""+value+"\"");
		}
		String [] values1 = values[0].split(" ");
		return values1[values1.length-1];
	}
	public String getIntVariableName( String value) {
		String [] values = variables.split("= "+value);
		String [] values1 = values[0].split(" ");
		return values1[values1.length-1];
	}
	
	public void mapVariables()
	{
		if (variables.contains("[") && variables.contains("]") && !variables.contains(","))
		{
			for(Entry<String, String> entry : variables_dictionary.entrySet()) {
			    String key = entry.getKey();
			    if (variables.contains(key))
			    {
			    	String sensor_id = variables.substring(variables.indexOf("[")+1,variables.indexOf("]"));
			    	variables = variables.replaceFirst("\""+key+"\\[.*\\]"+"\"", "dtostrf("+ variables_dictionary.get(key) + sensor_id + ", 6, 2, " + getVariableName(key+"["+sensor_id+"]")+ ");");
			    }
			}
		}
	}
	public String getMappedVariable(String str)
	{
		for(Entry<String, String> entry : variables_dictionary.entrySet()) {
		    String key = entry.getKey();
		    if (str.contains(key))
		    {
		    	String sensor_id = str.substring(str.indexOf("[")+1,str.indexOf("]"));
		    	return variables_dictionary.get(key) + sensor_id;
		    }
		}
		return "";
	}
	
}
