package org.xtext.generator;

public class DefineCodeGenerator {
	String sensor;
	String protocol ;
	String wifi_module;
	String result;
	DefineCodeGenerator(String sensor, String protocol, String wifi_module){
		this.sensor = sensor.toLowerCase().replaceAll("\\s+","");;
		this.protocol = protocol.toLowerCase().replaceAll("\\s+","");;
		this.wifi_module = wifi_module.toLowerCase().replaceAll("\\s+","");;
		this.result = "";
	}
	public String generateHCode(){
		switch (sensor) 
		{
			case "DHT22 (AM2302)":
				result += 
				"#include <DHT.h>\\r\\n\"\r\n"
				+ "//Costanti\\r\\n\"\r\n"
				+ "#define DHTPIN 8   //Pin a cui è connesso il sensore\\r\\n\"\r\n"
				+ "#define DHTTYPE DHT22   //Tipo di sensore che stiamo utilizzando (DHT22)\\r\\n\"\r\n"
				;
				break;
			default: 
				System.out.println("No code generation for sensor: " + sensor);
		}
		switch (protocol) 
		{
			case "MQTT":
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
				result+="No include for this module";
		}
		result += "\npublic class GeneratedLib\n{\npublic:\n\tfunction prototypes";
		return result;
	}
}
