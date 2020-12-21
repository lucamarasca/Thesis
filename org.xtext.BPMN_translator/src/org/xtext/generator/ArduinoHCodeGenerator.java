package org.xtext.generator;

import network.protocols.MQTT;


public class ArduinoHCodeGenerator {
	String sensor;
	String protocol ;
	String wifi_module;
	
	Object o;
	ArduinoHCodeGenerator(String sensor, String protocol, String wifi_module){
		if (sensor != null)
			this.sensor = sensor.toLowerCase().replaceAll("\\s+","");
		else
			this.sensor = "";
		this.protocol = protocol.toLowerCase().replaceAll("\\s+","");
		this.wifi_module = wifi_module.toLowerCase().replaceAll("\\s+","");
		
	}
	ArduinoHCodeGenerator() {
		
		sensor = ""; //DA MODIFICARE
	}
	public String Generation() {
		String result="";
		result += generateDefineCode();
		result += generateMethodsCode();
		return result;
	}
	public String generateDefineCode(){
		String result = "";
		
		result  +="#ifndef GeneratedLib_H //tests if RACom_H has not been defined\r\n"
				+ "#define GeneratedLib_H //define GeneratedLib_H\n"
				+ "#include \"Arduino.h\"        //includes the library Arduino.h\r\n"
				+ "#include \"SoftwareSerial.h\" //Includes the library SoftwareSerial.h \n";
		switch (sensor) 
		{
			case "DHT22 (AM2302)":
				result += 
				"#include <DHT.h>\\r\\n\"\r\n"
				+ "//Costanti\\r\\n\"\r\n"
				+ "#define DHTPIN 8   //Pin a cui è connesso il sensore\\r\\n\"\r\n"
				+ "#define DHTTYPE DHT22   //Tipo di sensore che stiamo utilizzando (DHT22)\\r\n\"\r\n"
				;
				break;
			default: 
				System.out.println("No code generation for sensor: " + sensor);
		}
		switch (protocol) 
		{
			case "mqtt":
				result += "#include <Ethernet.h>\r\n"
						+ "#include <PubSubClient.h>\n"
						+ "#include <WiFiClient.h>\n";
				break;
			default: 
				System.out.println("No code generation for protocol: " + protocol);
		}
		switch (wifi_module)
		{
			case "esp8266":
				result += "#include <ESP8266WiFiMulti.h>\n"
				+ "#include <ESP8266WiFi.h>\n";
				break;
			case "esp32":
				result += "#include <Wire.h>\n";
				break;
			default: 
				System.out.println("No code generation for this module");
		}
		
		return result;
	}
	String generateMethodsCode() {
		String result = "";
		result+="\nclass GeneratedLib\n"
		+ "{\n"
		+ "private:\n";
		
		switch(protocol)
		{
			case "mqtt":
				Object protocol;
				if (o == null)
					protocol = new MQTT(wifi_module);
				else 
					protocol = o;
				
				result += ((MQTT) protocol).getHCode();	
		}
		result+="};\n#endif";
		return result;
	}
	public void setProtocol(Object o) {
		this.o = o;
	}
	public String getNetwork_protocol() {
		return protocol;
	}
	public void setNetwork_protocol(String network_protocol) {
		this.protocol = network_protocol;
	}
	public String getWifi_sensor() {
		return wifi_module;
	}
	public void setWifi_sensor(String wifi_sensor) {
		this.wifi_module = wifi_sensor;
	}
}
