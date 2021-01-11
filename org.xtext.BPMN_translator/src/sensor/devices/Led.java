package sensor.devices;
import java.util.ArrayList;

import elements.Elements;
public class Led extends Elements{


	String module;
	ArrayList <String> pins ;
	String sensor_id ;
	Boolean on_off;
	public Led(){
		on_off = false;
		module = "module name";
		pins = new ArrayList<String>();
	}
	
	
	public String getSensor_id() {
		return sensor_id;
	}


	public void setSensor_id(String sensor_id) {
		this.sensor_id = sensor_id;
	}


	public Boolean getOn_off() {
		return on_off;
	}


	public void setOn_off(Boolean on_off) {
		this.on_off = on_off;
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
