package network.protocols;

import elements.Elements;

public class MQTT extends Elements{
	String wifi_module;
	MQTTDatas datas;
	public MQTT(String wifi_module){
		this.wifi_module = wifi_module.toLowerCase().replaceAll("\\s+","");
		this.datas = new MQTTDatas();
	}
	public MQTT() {
		this.datas = new MQTTDatas();
	}
	public String getCPPVariables() {
	
		switch (wifi_module)
		{
		case "mkr1010":
		case "esp32":
			return getCPPVariablesESP32();
		case "esp8266":
			return getCPPVariablesESP8266();
		case "w5100":
			return getCPPVariablesW5100();
		default:
			return "no wifi module";
		}
	}
	
	public String getCPPCode() {
		switch (wifi_module)
		{
		case "mkr1010":
		case "esp32":
			return getCPPCodeESP32();
		case "esp8266":
			return getCPPCodeESP8266();
		case "w5100":
			return getCPPCodeW5100();
		default:
			return "no wifi module";
		}
	}
	public String getHCode() {
		switch (wifi_module)
		{
		case "esp32":
		case "esp8266":
		case "mkr1010":
			return getHCodeESP();
		case "w5100":
			return getHCodeW5100();
		default:
			return "no wifi module";
		}
	}
	public String getCPPVariablesW5100() {
		return "EthernetClient ethClient;\r\n"
				+ "PubSubClient mqttClient;\n"
				+ "Boolean network_avaiable;\n";
	}
	public String getCPPVariablesESP8266() {
		
		return 	"ESP8266WiFiMulti wifiMulti;\r\n"
				+ "WiFiClient espClient;\r\n"
				+ "PubSubClient client(espClient);\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "long currentTime, lastTime;\r\n"
				+ "\r\n";
	}
	public String getCPPVariablesESP32() {
		
		return 	"WiFiMulti wifiMulti;\r\n"
				+ "WiFiClient espClient;\r\n"
				+ "PubSubClient client(espClient);\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "long currentTime, lastTime;\r\n"
				+ "\r\n";
	}
	public String getHCodeW5100() {
		String result = "";
		result+= "void SubscribeW5100(char* topic);\n"
		+ "void callbackW5100(char* topic, byte* payload, unsigned int len);\n"
		+ "void InitMQTTConnectionW5100(char* broker, char* mac);\n"
		+ "void sendInPubTopicW5100(char* pubTopic, char* datas);\n";
		return result;
	}
	public String getCPPCodeW5100() {
		String result = "";
		result += "void InitMQTTConnectionW5100 (char* mac, char* broker){"
				+ "\tif(network_avaiable)"
				+ "\t\treturn;"
				+ "\t//setup ethernet communication using DHCP\r\n"
				+ "\tif (Ethernet.begin(mac) == 0) {\r\n"
				+ "\t\t//Serial.println(F(\"Unable to configure Ethernet using DHCP\"));\r\n"
				+ "\t\tfor (;;);\r\n"
				+ "\t}\r\n"
				+ "\r\n"
				+ "\tSerial.println(F(\"Ethernet configured via DHCP\"));\r\n"
				+ "\tSerial.print(\"IP address: \");\r\n"
				+ "\tSerial.println(Ethernet.localIP());\r\n"
				+ "\tSerial.println();\n"
				+ "\t// setup mqtt client\r\n"
				+ "\tmqttClient.setClient(ethClient);\r\n"
				+ "\tmqttClient.setServer( broker); \r\n"
				+ "\t//Serial.println(F(\"MQTT client configured\"));\r\n"
				+ "\tmqttClient.setCallback(callback);"
				+ "\tnetwork_avaiable=true;"
				+ "}\n"
				+ "void SubscribeW5100(Char* topic)\r\n"
				+ "{\r\n"
				+ "\tif(!client.connected())\r\n"
				+ "\t{\r\n"
				+ "\t\treconnect(id, brokerUser, brokerPass, broker);\r\n"
				+ "\t}\r\n"
				+ "\tclient.subscribe(topic);\r\n"
				+ "}\n"
				+ "void sendInPubTopicW5100(char* pubTopic, char* datas)\r\n"
				+ "{\r\n"
				+ "\tif(!client.connected())\r\n"
				+ "\t{\r\n"
				+ "\t\treconnect();\r\n"
				+ "\t}\r\n"
				+ "\tcurrentTime = millis();\r\n"
				+ "\tclient.publish(pubTopic, datas);\r\n"
				+ "\tlastTime = millis();\r\n"
				+ "}\n"
				+ "void callbackW5100(char* topic, byte* payload, unsigned int len)\r\n"
				+ "{\r\n"
				+ "\tSerial.print(\"Received messages: \");\r\n"
				+ "\tSerial.println(topic);\r\n"
				+ "\tfor(unsigned int i=0; i<len; i++)\r\n"
				+ "\t{\r\n"
				+ "\t\tSerial.print((char) payload[i]);\r\n"
				+ "\t}\r\n"
				+ "\tSerial.println();\r\n"
				+ "}\n";
		return result;
	}
	public String getCPPCodeESP8266() {
		String result = "";
		result +=		
		  "void setupWiFi(char* ssid, char* password)\r\n"
		+ "{\r\n"
		+ "\tdelay(100);\r\n"
		+ "\r\n"
		+"\twifiMulti.addAP(ssid, password);"
		+"\n"
		+ "\tSerial.println(\"Connecting ...\");\r\n"
		+ "\twhile (wifiMulti.run() != WL_CONNECTED) \r\n"
		+ "\t{\r\n"
		+ "\t\tdelay(250);\r\n"
		+ "\t\tSerial.print('.');\r\n"
		+ "\t}\r\n"
		+ "\r\n"
		+ "\tSerial.println('\\n');\r\n"
		+ "\tSerial.print(\"Connected to:\\t\");\r\n"
		+ "\tSerial.println(WiFi.SSID());\r\n"
		+ "\r\n"
		+ "\tSerial.print(\"IP address:\\t\");\r\n"
		+ "\tSerial.println(WiFi.localIP());\r\n"
		+ "}\r\n"
		+ "\r\n"
		+"void Subscribe(Char* topic)\r\n"
		+ "{\r\n"
		+ "\tif(!client.connected())\r\n"
		+ "\t{\r\n"
		+ "\t\treconnect(id, brokerUser, brokerPass, broker);\r\n"
		+ "\t}\r\n"
		+ "\tclient.subscribe(topic);\r\n"
		+ "}\n"
		+ "void reconnect(int id, char* brokerUser, char* brokerPass,char* broker)\r\n"
		+ "{\r\n"
		+ "\twhile(!client.connected())\r\n"
		+ "\t{\r\n"
		+ "\t\tSerial.print(\"\\nConnecting to \");\r\n"
		+ "\t\tSerial.println(broker);\r\n"
		+ "\r\n"
		+ "\t\tif(client.connect(id, brokerUser, brokerPass))\r\n"
		+ "\t\t{\r\n"
		+ "\t\t\tSerial.print(\"\\nConnected to \");\r\n"
		+ "\t\t\tSerial.println(broker);\r\n"
		+ "\t\t}\r\n"
		+ "\t\telse\r\n"
		+ "\t\t{\r\n"
		+ "\t\t\tSerial.println(\"Connecting\");\r\n"
		+ "\t\t\tdelay(2500);\r\n"
		+ "\t\t}\r\n"
		+ "\t}\r\n"
		+ "}\r\n"
		+ "\r\n"
		+ "void callback(char* topic, byte* payload, unsigned int len)\r\n"
		+ "{\r\n"
		+ "\tSerial.print(\"Received messages: \");\r\n"
		+ "\tSerial.println(topic);\r\n"
		+ "\tfor(unsigned int i=0; i<len; i++)\r\n"
		+ "\t{\r\n"
		+ "\t\tSerial.print((char) payload[i]);\r\n"
		+ "\t}\r\n"
		+ "\tSerial.println();\r\n"
		+ "}\r\n"
		+ "\r\n"
		+ "void InitNetwork(char* broker, char* ssid, char* password)\r\n"
		+ "{\r\n"
		+ "\tSerial.begin(115200);\r\n"
		+ "\tsetupWiFi(ssid, password);\r\n"
		+ "\tclient.setServer(broker, 1883);\r\n"
		+ "\tclient.setCallback(callback);\r\n"
		+ "}\r\n"
		+ "\r\n"
		+ "void sendInPubTopic(char* pubTopic, char* datas)\r\n"
		+ "{\r\n"
		+ "\tif(!client.connected())\r\n"
		+ "\t{\r\n"
		+ "\t\treconnect();\r\n"
		+ "\t}\r\n"
		+ "\r\n"
		+ "\tcurrentTime = millis();\r\n"
		+ "\tclient.publish(pubTopic, datas);\r\n"
		+ "\r\n"
		+ "\tlastTime = millis();\r\n"
		+ "}\n";
		return result;
	}
	public String getCPPCodeESP32() {
		String result = "";
		result +=		
		  "void setupWiFi(char* ssid, char* password)\r\n"
		+ "{\r\n"
		+ "\tdelay(100);\r\n"
		+ "\r\n"
		+"\tWiFi.begin(ssid, password);"
		+"\n"
		+ "\tSerial.println(\"Connecting ...\");\r\n"
		+ "\twhile(WiFi.status() != WL_CONNECTED)\r\n"
		+ "\t{\r\n"
		+ "\t\tdelay(250);\r\n"
		+ "\t\tSerial.print('.');\r\n"
		+ "\t}\r\n"
		+ "\r\n"
		+ "\tSerial.println('\\n');\r\n"
		+ "\tSerial.print(\"Connected to:\\t\");\r\n"
		+ "\tSerial.println(WiFi.SSID());\r\n"
		+ "\r\n"
		+ "\tSerial.print(\"IP address:\\t\");\r\n"
		+ "\tSerial.println(WiFi.localIP());\r\n"
		+ "}\r\n"
		+ "\r\n"
		+"void Subscribe(Char* topic)\r\n"
		+ "{\r\n"
		+ "\tif(!client.connected())\r\n"
		+ "\t{\r\n"
		+ "\t\treconnect(id, brokerUser, brokerPass, broker);\r\n"
		+ "\t}\r\n"
		+ "\tclient.subscribe(topic);\r\n"
		+ "}\n"
		+ "void reconnect(int id, char* brokerUser, char* brokerPass,char* broker)\r\n"
		+ "{\r\n"
		+ "\twhile(!client.connected())\r\n"
		+ "\t{\r\n"
		+ "\t\tSerial.print(\"\\nConnecting to \");\r\n"
		+ "\t\tSerial.println(broker);\r\n"
		+ "\r\n"
		+ "\t\tif(client.connect(id, brokerUser, brokerPass))\r\n"
		+ "\t\t{\r\n"
		+ "\t\t\tSerial.print(\"\\nConnected to \");\r\n"
		+ "\t\t\tSerial.println(broker);\r\n"
		+ "\t\t}\r\n"
		+ "\t\telse\r\n"
		+ "\t\t{\r\n"
		+ "\t\t\tSerial.println(\"Connecting\");\r\n"
		+ "\t\t\tdelay(2500);\r\n"
		+ "\t\t}\r\n"
		+ "\t}\r\n"
		+ "}\r\n"
		+ "\r\n"
		+ "void callback(char* topic, byte* payload, unsigned int len)\r\n"
		+ "{\r\n"
		+ "\tSerial.print(\"Received messages: \");\r\n"
		+ "\tSerial.println(topic);\r\n"
		+ "\tfor(unsigned int i=0; i<len; i++)\r\n"
		+ "\t{\r\n"
		+ "\t\tSerial.print((char) payload[i]);\r\n"
		+ "\t}\r\n"
		+ "\tSerial.println();\r\n"
		+ "}\r\n"
		+ "\r\n"
		+ "void InitNetwork(char* broker, char* ssid, char* password)\r\n"
		+ "{\r\n"
		+ "\tSerial.begin(115200);\r\n"
		+ "\tsetupWiFi(ssid, password);\r\n"
		+ "\tclient.setServer(broker, 1883);\r\n"
		+ "\tclient.setCallback(callback);\r\n"
		+ "}\r\n"
		+ "\r\n"
		+ "void sendInPubTopic(char* pubTopic, char* datas)\r\n"
		+ "{\r\n"
		+ "\tif(!client.connected())\r\n"
		+ "\t{\r\n"
		+ "\t\treconnect();\r\n"
		+ "\t}\r\n"
		+ "\r\n"
		+ "\tcurrentTime = millis();\r\n"
		+ "\tclient.publish(pubTopic, datas);\r\n"
		+ "\r\n"
		+ "\tlastTime = millis();\r\n"
		+ "}\n";
		return result;
	}
	public String getHCodeESP() {
		String result = "";
		result+= "void setupWiFi(char* ssid, char* password);\n"
		+ "void Subscribe(char* topic);\n"
		+ "void reconnect(int id, char* brokerUser, char* brokerPass,char* broker);\n"
		+ "void callback(char* topic, byte* payload, unsigned int len);\n"
		+ "void InitNetwork(char* broker, char* ssid, char* password);\n"
		+ "void sendInPubTopic(char* pubTopic, char* datas);\n";
		return result;
	}
	public String getWifi_module() {
		return wifi_module;
	}
	public void setWifi_module(String wifi_module) {
		this.wifi_module = wifi_module.toLowerCase().replaceAll("\\s+","");;
	}
	public MQTTDatas getDatas() {
		return datas;
	}
	public void setDatas(MQTTDatas datas) {
		this.datas = datas;
	}
/*
 * 	public String getCPPCodeESP() {
		String result = "";
		
		result +=		
		"ESP8266WiFiMulti wifiMulti;\r\n"
		+ "WiFiClient espClient;\r\n"
		+ "PubSubClient client(espClient);\r\n"
		+ "\r\n"
		+ "const char* id = "+"\""+datas.getID()+"\"\n"  
		+ "const char* brokerUser = "+"\""+datas.getBroker_user()+"\""+";  // exp: myemail@mail.com\r\n"
		+ "const char* brokerPass = "+"\""+datas.getBroker_password()+"\""+";\r\n"
		+ "const char* broker = \""+datas.getBrokers().get(0)+"\""+";\r\n";
		
		for(int i = 0; i < datas.getPubTopics().size();i++)
			result += "const char* pubTopic"+i+" =  \"" + datas.getPubTopics().get(i)+"\";\n";
		result+="\r\n";
		for(int i = 0; i < datas.getSubTopics().size();i++)
			result += "const char* subTopic"+i+" =  \"" + datas.getSubTopics().get(i)+"\";\n";
		result+="\r\n"
		+ "\r\n"
		+ "long currentTime, lastTime;\r\n"
		+ "\r\n"
		+ "void setupWiFi()\r\n"
		+ "{\r\n"
		+ "\tdelay(100);\r\n"
		+ "\r\n";
		
		for(int i = 0; i < datas.getWifi_ssid().size();i++)
			result +="\twifiMulti.addAP("+"\""+datas.getWifi_ssid().get(i)+"\""+","+"\""+datas.getWifi_pass().get(i)+"\""+");\n";
		result+="\n"
		+ "\tSerial.println(\"Connecting ...\");\r\n"
		+ "\twhile (wifiMulti.run() != WL_CONNECTED) \r\n"
		+ "\t{\r\n"
		+ "\t\tdelay(250);\r\n"
		+ "\t\tSerial.print('.');\r\n"
		+ "\t}\r\n"
		+ "\r\n"
		+ "\tSerial.println('\\n');\r\n"
		+ "\tSerial.print(\"Connected to:\\t\");\r\n"
		+ "\tSerial.println(WiFi.SSID());\r\n"
		+ "\r\n"
		+ "\tSerial.print(\"IP address:\\t\");\r\n"
		+ "\tSerial.println(WiFi.localIP());\r\n"
		+ "}\r\n"
		+ "\r\n"
		+ "void reconnect()\r\n"
		+ "{\r\n"
		+ "\twhile(!client.connected())\r\n"
		+ "\t{\r\n"
		+ "\t\tSerial.print(\"\\nConnecting to \");\r\n"
		+ "\t\tSerial.println(broker);\r\n"
		+ "\r\n"
		+ "\t\tif(client.connect(id, brokerUser, brokerPass))\r\n"
		+ "\t\t{\r\n"
		+ "\t\t\tSerial.print(\"\\nConnected to \");\r\n"
		+ "\t\t\tSerial.println(broker);\r\n";
		for(int i = 0; i < datas.getSubTopics().size();i++)
			result += "\t\t\tclient.subscribe(subTopic"+i+");\n ";
		result +=
		  "\t\t}\r\n"
		+ "\t\telse\r\n"
		+ "\t\t{\r\n"
		+ "\t\t\tSerial.println(\"Connecting\");\r\n"
		+ "\t\t\tdelay(2500);\r\n"
		+ "\t\t}\r\n"
		+ "\t}\r\n"
		+ "}\r\n"
		+ "\r\n"
		+ "void callback(char* topic, byte* payload, unsigned int len)\r\n"
		+ "{\r\n"
		+ "\tSerial.print(\"Received messages: \");\r\n"
		+ "\tSerial.println(topic);\r\n"
		+ "\tfor(unsigned int i=0; i<len; i++)\r\n"
		+ "\t{\r\n"
		+ "\t\tSerial.print((char) payload[i]);\r\n"
		+ "\t}\r\n"
		+ "\tSerial.println();\r\n"
		+ "}\r\n"
		+ "\r\n"
		+ "void InitNetwork()\r\n"
		+ "{\r\n"
		+ "\tSerial.begin(115200);\r\n"
		+ "\tsetupWiFi();\r\n"
		+ "\tclient.setServer(broker, 1883);\r\n"
		+ "\tclient.setCallback(callback);\r\n"
		+ "}\r\n"
		+ "\r\n";
		for (int i = 0; i < datas.getPubTopics().size();i++)
			result+= "void client.sendInPubTopic"+i+"()\r\n"
		+ "{\r\n"
		+ "\tif(!client.connected())\r\n"
		+ "\t{\r\n"
		+ "\t\treconnect();\r\n"
		+ "\t}\r\n"
		+ "\r\n"
		+ "\tcurrentTime = millis();\r\n"
		+ "\tclient.publish(pubTopic"+i+", \"datas to publish\");\r\n"
		+ "\r\n"
		+ "\tlastTime = millis();\r\n"
		+ "}\n";
		return result;
	}*/

	
	
}
