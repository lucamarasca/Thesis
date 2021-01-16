package sensor.devices;

import java.util.ArrayList;

import elements.Elements;

public class TemperatureSensor extends Elements {
	String module;
	ArrayList <String> pins ;
	String sensor_id ;
	
	public TemperatureSensor(){
		
		module = "module name";
		pins = new ArrayList<String>();
	}
	public String getCPPCode() {
		switch (module) {
		case "dht22":
			return GetDHT22Code();
		default:
			return "no sensor";
		}
	}
	String GetDHT22Code() {
		return 
		"\nvoid InitDHT22(int pin)\n"
		+ "{\r\n"
		+ "\tDHT dht(pin, DHTTYPE); // Initialize DHT sensor for normal 16mhz Arduino\r\n"
		+ "\tdht.begin();\n"
		+ "}\n";
	}
	public String GetDHT22HCode() {
		return "void InitDHT22(int pin);\n";
	}
	
	public String getModule() {
		return module;
	}
	public void setModule(String module) {
		this.module = module;
	}
	public ArrayList<String> getPins() {
		return pins;
	}
	public void setPins(ArrayList<String> pins) {
		this.pins = pins;
	}
	public String getSensorId() {
		return sensor_id;
	}
	public void setSensorId(String id) {
		this.sensor_id = id;
	}
}
