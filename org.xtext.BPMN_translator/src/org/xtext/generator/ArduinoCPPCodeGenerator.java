package org.xtext.generator;
import java.util.ArrayList;

import network.protocols.*;
import sensor.devices.TemperatureSensor;
public class ArduinoCPPCodeGenerator {
	
	String device;
	String network_protocol;
	String wifi_sensor;
	String sensor;
	String cpp_code;
	String device_ID;
	Object o;
	ArduinoCPPCodeGenerator(String device, String network_protocol, String wifi_sensor, String sensor){
		this.device = device.toLowerCase().replaceAll("\\s+","");
		this.network_protocol = network_protocol.toLowerCase().replaceAll("\\s+","");
		this.wifi_sensor = wifi_sensor.toLowerCase().replaceAll("\\s+","");
		this.sensor = sensor.toLowerCase().replaceAll("\\s+","");
		cpp_code = "";
	}
	ArduinoCPPCodeGenerator(){
		cpp_code = "";
	}

	public boolean Check() {
		if (!device.toLowerCase().equals("arduino"))
			return false;
		else
			return true;
	}
	public String Generation(){
		if (!Check())
		{
			System.out.println("Internal error: it's not possible to generate code for"
					+ " the specified device");
			return "0"; //Means that the target device is not arduino, so i return error code
		}
		//In the .h file are written all the dependecies
		cpp_code += "#include <GeneratedLib.h>\n"; 
		if (network_protocol != null && wifi_sensor != null)
		{
			cpp_code += getNetworkCode();
		}
		if (sensor != null)
		{
			//cpp_code += getSensorCode();
		}
		return cpp_code;
		
	}
	public String getNetworkCode() {
		switch (network_protocol)
		{
			case "mqtt":
				
				Object protocol;
				if (o == null)
					protocol = new MQTT(wifi_sensor);
				else 
					protocol = o;
				
				return ((MQTT) protocol).getCPPCode();
			default:
				return "no protocol";
		}
	}
	public String generateProtocolCode(Elements e) {
		switch (e.type) {
		case "mqtt":
			MQTT protocol = (MQTT) e;
			return protocol.getCPPCode();
		}
		return "";
	}
	public String generateSensorCode(Elements e)
	{
		switch (e.type) {
		case "dht22":
			TemperatureSensor sensor= (TemperatureSensor) e;
			return sensor.getCPPCode();
		}
		return "";
	}
	public void setProtocol(Object o) {
		this.o = o;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	public String getNetwork_protocol() {
		return network_protocol;
	}
	public void setNetwork_protocol(String network_protocol) {
		this.network_protocol = network_protocol;
	}
	public String getWifi_sensor() {
		return wifi_sensor;
	}
	public void setWifi_sensor(String wifi_sensor) {
		this.wifi_sensor = wifi_sensor;
	}
	public String getSensor() {
		return sensor;
	}
	public void setSensor(String sensor) {
		this.sensor = sensor;
	}
	
}
