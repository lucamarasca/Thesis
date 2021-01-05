package sensor.devices;

import java.util.ArrayList;

import elements.Elements;

public class LightSensor extends Elements{
	String module;
	ArrayList <String> pins ;
	String sensor_id ;
	
	public LightSensor(){
		
		module = "module name";
		pins = new ArrayList<String>();
	}
	public String getCPPCode() {
		switch (module) {
		case "lm358":
			return GetLM358CPPCode();
		default:
			return "";
		}
	}
	String GetLM358CPPCode() {
		return 
		"\nfloat Readlm358(int pin)\n"
		+ "{\r\n"
		+ "\tint sensorValue = analogRead(pin); \r\n"
		+ "\treturn (float)(4095-sensorValue)*10;\n"
		+ "}\n";
		
	}
	public String GetLM358HCode() {
		return "float Readlm358(int pin);\n";
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
