package org.xtext.generator;
import network.protocols.*;
public class ArduinoCPPCodeGenerator {
	String device;
	String network_protocol;
	String wifi_sensor;
	String sensor;
	String cpp_code;
	ArduinoCPPCodeGenerator(String device, String network_protocol, String wifi_sensor, String sensor){
		this.device = device;
		this.network_protocol = network_protocol;
		this.wifi_sensor = wifi_sensor;
		this.sensor = sensor;
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
			case "MQTT":
				MQTT protocol = new MQTT(wifi_sensor);
				return protocol.getCPPCode();
			default:
				return "no protocol";
		}
	}

}
