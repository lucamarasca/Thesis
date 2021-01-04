package sensor.devices;

import java.util.ArrayList;

import elements.Elements;

public class DistanceSensor extends Elements{
	String module;
	ArrayList <String> pins ;
	String sensor_id ;
	
	public DistanceSensor(){
		
		module = "module name";
		pins = new ArrayList<String>();
	}
	public String getCPPCode() {
		switch (module) {
		case "hy-srf05":
		case "hc-sr04":
			return GetHCSR04CPPCode();
		default:
			return "";
		}
	}
	String GetHCSR04CPPCode() {
		return 
		"\nvoid InitHCSR04(int trigPin, int echoPin)\n"
		+ "{\r\n"
		+ "\tpinMode(trigPin, OUTPUT); // Sets the trigPin as an OUTPUT\r\n"
		+ "\tpinMode(echoPin, INPUT); // Sets the echoPin as an INPUT\n"
		+ "}\n"
		+ "int ReadDistanceHCSR04(int trigPin, int echoPin)\n"
		+ "{\n"
		+ "\tlong duration;\n"
		+ "\t// Clears the trigPin condition\r\n"
		+ "\tdigitalWrite(trigPin, LOW);\r\n"
		+ "\tdelayMicroseconds(2);\r\n"
		+ "\t// Sets the trigPin HIGH (ACTIVE) for 10 microseconds\r\n"
		+ "\tdigitalWrite(trigPin, HIGH);\r\n"
		+ "\tdelayMicroseconds(10);\r\n"
		+ "\tdigitalWrite(trigPin, LOW);\r\n"
		+ "\t// Reads the echoPin, returns the sound wave travel time in microseconds\r\n"
		+ "\tduration = pulseIn(echoPin, HIGH);\r\n"
		+ "\t// Calculating the distance\r\n"
		+ "\tdistance = duration * 0.034 / 2; // Speed of sound wave divided by 2 (go and back)\n"
		+ "\treturn distance;\n"
		+ "}\n";
	}
	public String GetHCSR04HCode() {
		return "float ReadDistanceHCSR04(int trigPin, int echoPin);\n"
				+ "void InitHCSR04(int trigPin, int echoPin)\n";
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
