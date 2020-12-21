package sensor.devices;

import java.util.ArrayList;

import org.xtext.generator.Elements;

public class TemperatureSensor extends Elements {
	String module;
	ArrayList <String> pins ;
	String id;
	
	public TemperatureSensor(){
		id = "device id";
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
		+ "\tDHT dht(pin, DHTTYPE); //// Initialize DHT sensor for normal 16mhz Arduino\r\n"
		+ "\tdht.begin();\n"
		+ "}\n";
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
