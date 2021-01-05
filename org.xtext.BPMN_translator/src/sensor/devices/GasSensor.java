package sensor.devices;

import java.util.ArrayList;

import elements.Elements;

public class GasSensor extends Elements{
	String module;
	ArrayList <String> pins ;
	String sensor_id ;
	
	public GasSensor(){
		
		module = "module name";
		pins = new ArrayList<String>();
	}
	public String getCPPCode() {
		switch (module) {
		case "mq9":
			return GetMQ9CPPCode();
		default:
			return "";
		}
	}
	String GetMQ9CPPCode() {
		return 
		"\nfloat ReadMQ9(int pin)\n"
		+ "{\r\n"
		+ "\treturn analogRead(pin); // Sets the trigPin as an OUTPUT\r\n"
		+ "}\n";
		
	}
	public String GetMQ9HCode() {
		return "float ReadMQ9(int pin);\n";
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
