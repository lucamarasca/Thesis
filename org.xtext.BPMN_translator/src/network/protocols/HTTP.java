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
		case "mkr1010":
		case "esp8266":
			return getCPPVariablesESP();
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
		case "esp8266":
			return getCPPCodeESP();
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
		return "// Initialize the Ethernet client library\r\n"
				+ "// with the IP address and port of the server\r\n"
				+ "// that you want to connect to (port 80 is default for HTTP):\r\n"
				+ "EthernetClient client;\n";
	}
	public String getCPPCodeW5100() {
		String result = "";
		result+="void initConnectionW5100(byte* mac, char* server, IPAddress ip, IPAddress dns) {\r\n"
				+ "\t// start the Ethernet connection:\r\n"
				+ "\tSerial.println(\"Initialize Ethernet with DHCP:\");\r\n"
				+ "\tif (Ethernet.begin(mac) == 0) {\r\n"
				+ "\t\tSerial.println(\"Failed to configure Ethernet using DHCP\");\r\n"
				+ "\t\t// Check for Ethernet hardware present\r\n"
				+ "\t\tif (Ethernet.hardwareStatus() == EthernetNoHardware) {\r\n"
				+ "\t\t\tSerial.println(\"Ethernet shield was not found.  Sorry, can't run without hardware. :(\");\r\n"
				+ "\t\t\twhile (true) {\r\n"
				+ "\t\t\t\tdelay(1); // do nothing, no point running without Ethernet hardware\r\n"
				+ "\t\t\t}\r\n"
				+ "\t\t}\r\n"
				+ "\t\tif (Ethernet.linkStatus() == LinkOFF) {\r\n"
				+ "\t\t\tSerial.println(\"Ethernet cable is not connected.\");\r\n"
				+ "\t\t}\r\n"
				+ "\t\t// try to congifure using IP address instead of DHCP:\r\n"
				+ "\t\tEthernet.begin(mac, ip, myDns);\r\n"
				+ "\t} else {\r\n"
				+ "\t\tSerial.print(\"  DHCP assigned IP \");\r\n"
				+ "\t\tSerial.println(Ethernet.localIP());\r\n"
				+ "\t}\r\n"
				+ "\t// give the Ethernet shield a second to initialize:\r\n"
				+ "\tdelay(1000);\r\n"
				+ "\tSerial.print(\"connecting to \");\r\n"
				+ "\tSerial.print(server);\r\n"
				+ "\tSerial.println(\"...\");\r\n"
				+ "\r\n"
				+ "\t// if you get a connection, report back via serial:\r\n"
				+ "\tif (client.connect(server, 80)) {\r\n"
				+ "\t\tSerial.print(\"connected to \");\r\n"
				+ "\t\tSerial.println(client.remoteIP());\r\n"
				+ "\t\t// Make a HTTP request:\r\n"
				+ "\t\tclient.println(\"GET /search?q=arduino HTTP/1.1\");\r\n"
				+ "\t\tclient.println(\"Host: www.google.com\");\r\n"
				+ "\t\tclient.println(\"Connection: close\");\r\n"
				+ "\t\tclient.println();\r\n"
				+ "\t} else {\r\n"
				+ "\t\t// if you didn't get a connection to the server:\r\n"
				+ "\t\tSerial.println(\"connection failed\");\r\n"
				+ "\t}\r\n"
				+ "\tbeginMicros = micros();\r\n"
				+ "}\n"
				+ "void sendGetRequestW5100(){\n"
				+ "\t// if there are incoming bytes available\r\n"
				+ "\t// from the server, read them and print them:\r\n"
				+ "\tint len = client.available();\r\n"
				+ "\tif (len > 0) {\r\n"
				+ "\t\tbyte buffer[80];\r\n"
				+ "\t\tif (len > 80) len = 80;\r\n"
				+ "\t\tclient.read(buffer, len);\r\n"
				+ "\t\tif (printWebData) {\r\n"
				+ "\t\t\tSerial.write(buffer, len); // show in the serial monitor (slows some boards)\r\n"
				+ "\t\t}\r\n"
				+ "\t\tbyteCount = byteCount + len;\r\n"
				+ "\t}\n}\n"
				+"void sendPostRequestW5100(char* server_ip, char* data, char* url, char* content_type){"
				+ "\tif (client.connect(server_ip)) { \n"
				+ "\t\tclient.println(\"POST url\");"
				+ "\t\tclient.println(\"Host: server_ip\");\r\n"
				+ "\t\tclient.println(\"Content-Type: content_type\");\r\n"
				+ "\t\tclient.println(\"Connection:close\");\r\n"
				+ "\t\tclient.print(\"Content-Length:\");\r\n"
				+ "\t\tclient.println(data.length());\r\n"
				+ "\t\tclient.println();\r\n"
				+ "\t\tclient.print(data);\r\n"
				+ "\r\n"
				+ "\t\tclient.flush();\r\n"
				+ "\t\tclient.stop();\r\n"
				+ "}\n}\n";
		return result;
	}
	public String getHCodeW5100() {
		String result = "";
		result+="void initConnectionW5100(byte* mac, char* server, IPAddress ip, IPAddress dns);\r\n"
		+ "void sendGetRequestW5100();\n"
		+"void sendPostRequestW5100(char* server_ip, char* data, char* url, char* content_type);\n";
		return result;
	}
	public String getCPPVariablesESP() {
		
		return 	"HTTPClient http;\n";
	}
	public String getCPPCodeESP() {
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
