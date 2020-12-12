package org.xtext.generator;

public class DefineCodeGenerator {
	String sensor;
	String protocol ;
	String result;
	DefineCodeGenerator(String sensor, String protocol){
		this.sensor = sensor;
		this.protocol = protocol;
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
				result += 
						  "#include <SPI.h>\r\n"
						+ "#include <Ethernet.h>\r\n"
						+ "#include <PubSubClient.h>";
				break;
			default: 
				System.out.println("No code generation for protocol: " + protocol);
		}
		result += "\npublic class GeneratedLib\n{\npublic:\n\tfunction prototypes";
		return result;
	}
}
