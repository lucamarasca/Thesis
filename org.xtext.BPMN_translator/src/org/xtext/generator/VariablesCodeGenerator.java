package org.xtext.generator;

public class VariablesCodeGenerator {
	String sensor;
	String protocol ;
	String result;
	VariablesCodeGenerator(String sensor, String protocol){
		this.sensor = sensor;
		this.protocol = protocol;
		this.result = "";
	}
	public String generateCPPCode(){
		switch (sensor) 
		{
			case "DHT22 (AM2302)":
				result +=
				"#include <GeneratedLib.h>\n"
				+ "//Variabili\r\n"
				+ "int chk;\r\n"
				+ "float hum;  //Variabile in cui verrà inserita la % di umidità\r\n"
				+ "float temp; //Variabile in cui verrà inserita la temperatura\r\n";
				break;
			default: 
				System.out.println("No code generation for sensor: " + sensor);
		}
		switch (protocol) 
		{
			case "MQTT":
				result += 
						"// Set your MAC address and IP address here\r\n"
						+ "byte mac[] = { 0xDE, 0xAD, 0xBE, 0xEF, 0xFE, 0xED };\r\n"
						+ "// Make sure to leave out the http and slashes!\r\n"
						+ "const char* server = \"test.mosquitto.org\";\r\n"
						+ "// Ethernet and MQTT related objects\r\n"
						+ "EthernetClient ethClient;\r\n";
				break;
			default: 
				System.out.println("No code generation for protocol: " + protocol);
		}
		return result;
	}
}
