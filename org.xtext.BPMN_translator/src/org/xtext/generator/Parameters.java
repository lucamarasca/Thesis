package org.xtext.generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Parameters {
	
	
	//Device Lists
	static public ArrayList <String> Devices = new ArrayList<String>();
	
	//Networks
	static public ArrayList <String> Network_protocols_wireless = new ArrayList<String>();
	static public ArrayList <String> Wifi_sensors = new ArrayList<String>();
	//Sensors type
	static public ArrayList <String> Sensor_type = new ArrayList<String>();
	
	//Sensors lists
	//static public ArrayList <String> Bluetooth_sensors = new ArrayList<String>();
	static public ArrayList <String> Distance_sensors = new ArrayList<String>();
	static public ArrayList <String> Temperature_sensors = new ArrayList<String>();
	static public ArrayList <String> Gas_sensors = new ArrayList<String>();
	static public ArrayList <String> Light_sensors = new ArrayList<String>();
	
	static {
		//Supported device list
		Devices.add("Arduino");
		
		//Network protocols list
		Network_protocols_wireless.addAll(Arrays.asList("" , "MQTT",
				 "HTTP"));
		Wifi_sensors.addAll(Arrays.asList("","ESP8266", "ESP32" ,"MKR 1010",
				"W5100"));

		//Sensors types
		Sensor_type.addAll(Arrays.asList("","Distance Sensor", 
				 "Temperature Sensor", "Gas Sensor", "Light Sensor"));
		
		//Sensors
		//Bluetooth_sensors.addAll(Arrays.asList("","DSD TECH HC-05"));
		Distance_sensors.addAll(Arrays.asList("","HC-SR04", "HY-SRF05"));
		Temperature_sensors.addAll(Arrays.asList("","DHT22" , "DHT11"));
		Gas_sensors.addAll(Arrays.asList("","MQ9"));
		Light_sensors.addAll(Arrays.asList("","LM358"));
	}
	
	static public String selected_device = "";
	static public String selected_protocol = "";
	static public String selected_wifisensor = "";
	static public String selected_sensor = "";
	static public boolean end_point_generation = false;
}
