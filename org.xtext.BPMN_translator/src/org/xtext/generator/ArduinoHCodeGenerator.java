package org.xtext.generator;

import network.protocols.HTTP;
import network.protocols.MQTT;
import sensor.devices.TemperatureSensor;


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
		this.protocol = "";
		this.wifi_module = "";
		this.sensor = ""; 
	}
	public String Generation() {
		String return_value="";
		return_value = generateDefineCode(return_value);
		return_value = generateMethodsCode(return_value);
		return return_value;
	}
	public String generateDefineCode(String code){
		String result = "";
		
		result  +="#ifndef GeneratedLib_H //tests if RACom_H has not been defined\r\n"
				+ "#define GeneratedLib_H //define GeneratedLib_H\n"
				+ "#include \"Arduino.h\"        //includes the library Arduino.h\r\n"
				+ "#include \"SoftwareSerial.h\" //Includes the library SoftwareSerial.h \n";
		if (!code.contains(result))
			code += result;
		
		switch (sensor) 
		{
			case "DHT22 (AM2302)":
				result = "";
				result += 
				"#include <DHT.h>\\r\\n\"\r\n"
				+ "//Costanti\\r\\n\"\r\n"
				+ "#define DHTPIN 8   //Pin a cui è connesso il sensore\\r\\n\"\r\n"
				+ "#define DHTTYPE DHT22   //Tipo di sensore che stiamo utilizzando (DHT22)\\r\n\"\r\n";
				if (!code.contains(result))
					code+= result;
				break;
			default: 
				break;
		}
		switch (protocol) 
		{
			
			case "mqtt":
				switch (wifi_module)
				{
					case "sim900":
						result = "";
						result += "#include <GSM.h>";
					case "esp8266":
						result = "";
						result += "#include <ESP8266WiFiMulti.h>\n";
						if (!code.contains(result))
							code+= result;
						result += "#include <ESP8266WiFi.h>\n";
						if (!code.contains(result))
							code+= result;
						break;
					case "w5100":
						result = "";
						result +=" #include <Ethernet.h>\n";
						if (!code.contains(result))
							code+= result;
						result = "";
						result += "#include <PubSubClient.h>\n";
						if (!code.contains(result))
							code+= result;
						break;
					case "mkr1010":
					case "esp32":
						result = "";
						result += "#include <WiFi.h>\n";
						if (!code.contains(result))
							code+= result;
						result += "#include <WiFiMulti.h>\n";
						if (!code.contains(result))
							code+= result;
						break;
					default: 
						break;
				}
				result = "";
				result += "#include <PubSubClient.h>\n";
				if (!code.contains(result))
					code+= result;
				result = "";
				result += "#include <WiFiClient.h>\n";
				if (!code.contains(result))
					code+= result;
				result = "";
				break;
				
			case "http":
				switch (wifi_module)
				{
					case "esp8266":
						result = "";
						result += "#include <ESP8266WiFi.h>\n";
						if (!code.contains(result))
							code+= result;
						result += "#include <ESP8266HTTPClient.h>\n";
						if (!code.contains(result))
							code+= result;
						break;
					case "w5100":
						result = "";
						result += "#include <SPI.h>\n" ;
						if (!code.contains(result))
							code+= result;
						result = "";
						result += "#include <Ethernet.h>\n";
						if (!code.contains(result))
							code+= result;
					case "mkr1010":
					case "esp32":
						result = "";
						result += "#include <WiFi.h>\n";	
						if (!code.contains(result))
							code+= result;
						result = "";
						result += "#include <HTTPClient.h>\n";
						if (!code.contains(result))
							code+= result;
						result = "";
						result += "#include <WiFiClient.h>\n";
						if (!code.contains(result))
							code+= result;
						result = "";
						break;
					default: 
						break;
				}
				
				break;
			default: 
				break;
		}
		
		
		return code;
	}
	String generateMethodsCode(String code) {
		String result = "";
		result+="\nclass GeneratedLib\n"
		+ "{\n"
		+ "private:\n";
		if (!code.contains(result))
			code+= result;
		switch(protocol)
		{
			case "mqtt":
				result = "";
				Object protocol;
				if (o == null)
					protocol = new MQTT(wifi_module);
				else 
					protocol = o;
				
				result += ((MQTT) protocol).getHCode();	
				if (!code.contains(result))
					code+= result;
				break;
			case "http":
				result = "";
				Object http_protocol;
				if (o == null)
					http_protocol = new HTTP(wifi_module);
				else 
					http_protocol = o;
				
				result += ((HTTP) http_protocol).getHCode();	
				if (!code.contains(result))
					code+= result;
				break;
		}
		switch(sensor)
		{
		case "dht22":
			result = "";
			Object sensor;
			
			sensor = new TemperatureSensor();
			result+= ((TemperatureSensor)sensor).GetDHT22HCode();
			if (!code.contains(result))
				code+= result;
			break;
		}
		return code;
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
