package org.xtext.generator;

public class NetworkCodeGenerator {
	String protocol ;
	int generation_type;
	NetworkCodeGenerator(String protocol, int type){
		this.protocol = protocol;
		this.generation_type = type;
	}
	public String GenerateCPPCode(){
		switch (protocol)
		{
		case "MQTT":
			switch(generation_type)
			{
			case 0:
				//So che non ho una BPMN, quindi posso generare del codice di default
				String result =			  
				  "\npublic void Init_networkprotocol()\n{\n"
				+ "\t// Start the ethernet connection\r\n"
				+ "\tEthernet.begin(mac, ip);              \n"
				+ "\t// Ethernet takes some time to boot!n"
				+ "\tdelay(3000);                         \n"
				+ "\t// Set the MQTT server to the server stated above ^\r\n"
				+ "\tmqttClient.setServer(server, 1883);\n"
				+ "\t// Attempt to connect to the server with the ID \"myClientID\"\r\n"
				+ "\tif (mqttClient.connect(\"myClientID\"))\n"
				+ "\t{\r\n"
				+ "\t\tSerial.println(\"Connection has been established, well done\");\r\n"
				+ "\t\t// Establish the subscribe event\r\n"
				+ "\t\tmqttClient.setCallback(subscribeReceive);\r\n"
				+ "\t} \r\n"
				+ "\telse \r\n"
				+ "\t{\r\n"
				+ "\t\tSerial.println(\"Looks like the server connection failed...\");\r\n"
				+ "\t}\n"
				+ "}\n"
				+ "public void publish()\n{"
				+ "\t// This is needed at the top of the loop!\r\n"
				+ "\tmqttClient.loop();\r\n"
				+ "\t// Ensure that we are subscribed to the topic \"MakerIOTopic\"\r\n"
				+ "\tmqttClient.subscribe(\"MakerIOTopic\");\r\n"
				+ "\t// Attempt to publish a value to the topic \"MakerIOTopic\"\r\n"
				+ "\tif(mqttClient.publish(\"MakerIOTopic\", \"Hello World\"))\r\n"
				+ "\t{\r\n"
				+ "\t\tSerial.println(\"Publish message success\");\r\n"
				+ "\t}\r\n"
				+ "\telse\r\n"
				+ "\t{\r\n"
				+ "\t\tSerial.println(\"Could not send message :(\");\r\n"
				+ "\t}\r\n"
				+ "\t// Dont overload the server!\r\n"
				+ "\tdelay(4000);\n"
				+ "}\n"
				+ "void subscribeReceive(char* topic, byte* payload, unsigned int length)\r\n"
				+ "{\r\n"
				+ "\t// Print the topic\r\n"
				+ "\tSerial.print(\"Topic: \");\r\n"
				+ "\tSerial.println(topic);\r\n"
				+ "\t// Print the message\r\n"
				+ "\tSerial.print(\"Message: \");\r\n"
				+ "\tfor(int i = 0; i < length; i ++)\r\n"
				+ "\t{\r\n"
				+ "\t\tSerial.print(char(payload[i]));\r\n"
				+ "\t}\r\n"
				+ "\t// Print a newline\r\n"
				+ "\tSerial.println(\"\");\r\n"
				+ "}"
				;
				return result;
			case 1:
				return "";
				
			default:
				return "No data in the cpp file for: " + protocol + " has been generated.";
				
			}
		default:
			return "No data in the cpp file for: " + protocol + " has been generated.";
		}
	}
	public String GenerateHCode() {
		switch (protocol)
		{
		case "MQTT":
			switch(generation_type)
			{
			case 0:
				//So che non ho una BPMN, quindi posso generare del codice di default
				String result =
				  "\tvoid subscribeReceive(char* topic, byte* payload, unsigned int length);\r\n"
				+ "\tIPAddress ip(192, 168, 1, 160);\r\n"
				+ "\tPubSubClient mqttClient(ethClient);\n"
				;
				return result;
			case 1:
				return "";
				
			default:
				return "No data in the cpp file for: " + protocol + " has been generated.";
				
			}
		default:
			return "No data in the cpp file for: " + protocol + " has been generated.";
		}
	}
}
