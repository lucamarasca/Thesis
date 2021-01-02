package network.protocols;



import elements.Elements;

public class HTTP extends Elements{
	String wifi_module;
	HTTPDatas datas;
	public HTTP(String wifi_module){
		this.wifi_module = wifi_module.toLowerCase().replaceAll("\\s+","");
		this.datas = new HTTPDatas();
	}
	public HTTP() {
		this.datas = new HTTPDatas();
	}
	public String getCPPVariables() {
		switch (wifi_module)
		{
		case "esp32":
			return getCPPVariablesESP32();
		case "esp8266":
			return getCPPVariablesESP8266();
		case "samd":
			return getCPPVariablesESP8266();
		default:
			return "no wifi module";
		}
	}
	
	public String getCPPCode() {
		switch (wifi_module)
		{
		case "esp32":
			return getCPPCodeESP32();
		case "esp8266":
		case "samd":
			return "";
		default:
			return "no wifi module";
		}
	}
	public String getHCode() {
		switch (wifi_module)
		{
		case "esp32":
		case "esp8266":
		case "samd":
			return getHCodeESP();
		default:
			return "no wifi module";
		}
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
		
		return 	"HTTPClient http;\n";
	}
	public String getCPPCodeESP32() {
		String result = "";
		result +=		
		  "void setupWiFiHTTP(char* ssid, char* password)\r\n"
		+ "{\r\n"
		+ "\tWiFi.begin(ssid, password);\r\n"
		+ "\tSerial.println(\"Connecting\");\r\n"
		+ "\twhile(WiFi.status() != WL_CONNECTED) {\r\n"
		+ "\t\tdelay(500);\r\n"
		+ "\t\tSerial.print(\".\");\r\n"
		+ "\t}\r\n"
		+ "\tSerial.println(\"\");\r\n"
		+ "\tSerial.print(\"Connected to WiFi network with IP Address: \");\r\n"
		+ "\tSerial.println(WiFi.localIP());\n"
		+ "}\n"
		+ "void InitNetwork(char* ssid, char* password)\r\n"
		+ "{\r\n"
		+ "\tSerial.begin(115200);\r\n"
		+ "\tsetupWiFi(ssid, password);\r\n"
		+ "}\r\n"
		+ "\r\n"
		+ "void sendGetRequest(char* serverIP)\r\n"
		+ "{\r\n"
		+ "\tif(WiFi.status() != WL_CONNECTED)\r\n"
		+ "\t{\r\n"
		+ "\t\tsetupWifi();\r\n"
		+ "\t}\r\n"
		+ "\r\n"
		+ "\thttp.begin(server.c_str());"
		+ "\t// Send HTTP GET request\r\n"
		+ "\tint httpResponseCode = http.GET();\r\n"
		+ "\t\r\n"
		+ "\tif (httpResponseCode>0) {\r\n"
		+ "\t\tSerial.print(\"HTTP Response code: \");\r\n"
		+ "\t\tSerial.println(httpResponseCode);\r\n"
		+ "\t\tString payload = http.getString();\r\n"
		+ "\t\tSerial.println(payload);\r\n"
		+ "\t}\r\n"
		+ "\telse {\r\n"
		+ "\t\tSerial.print(\"Error code: \");\r\n"
		+ "\t\tSerial.println(httpResponseCode);\r\n"
		+ "\t}\n"
		+ "}\n"
		+ "void sendPost(char* serverIP, char* content_type, char* header, char* data)\r\n"
		+ "{\r\n"
		+ "\tif(WiFi.status() != WL_CONNECTED)\r\n"
		+ "\t{\r\n"
		+ "\t\tsetupWifi();\r\n"
		+ "\t}\r\n"
		+ "\r\n"
		+ "\thttp.begin(server.c_str());\n"
		+ "\thttp.addHeader( content_type, header);\r\n"
		+ "\tint httpResponseCode = http.POST(data);\n"
		+ "\thttp.end()\n"
		+ "}\n";
		return result;
	}
	public String getHCodeESP() {
		String result = "";
		result+= "void setupWiFiHTTP(char* ssid, char* password);\n"
		+ "void sendGetRequest(char* serverIP);\n"
		+ "void sendPost(char* serverIP, char* content_type, char* header, char* data)\n";
		return result;
	}
	public String getWifi_module() {
		return wifi_module;
	}
	public void setWifi_module(String wifi_module) {
		this.wifi_module = wifi_module.toLowerCase().replaceAll("\\s+","");;
	}
	public HTTPDatas getDatas() {
		return datas;
	}
	public void setDatas(HTTPDatas datas) {
		this.datas = datas;
	}

	
	
}
