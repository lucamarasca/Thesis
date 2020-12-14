package org.xtext.generator;

public class SensorsCodeGenerator {
	String sensor;
	//Mi serve per capire se ho la BPMN o meno, se non la ho, genero del codice più generico
	int generation_type;
	SensorsCodeGenerator(String sensor, int type){
		
		this.generation_type = type;
	}//in the loop lib instantiation.read
	
	public String GenerateCPPCode(){
		
		
			switch(generation_type)
			{
			case 0:
				//So che non ho una BPMN, quindi posso generare del codice di default
				String result =
				"public void Init_sensor()\n{\n\tDHT dht(DHTPIN, DHTTYPE); "
				+ "//Inizializza oggetto chiamato \\\"dht\\\", parametri: pin a cui è connesso il sensore, tipo di dht 11/22\"\r\n"
				+ "\tdht.begin();\n}\n"
				+ "public void ReadTempAndHumidity()\n{\n"
				+ "\t//Leggi i dati e salvali nelle variabili hum e temp\r\n"
				+ "\thum = dht.readHumidity();\r\n"
				+ "\ttemp= dht.readTemperature();\r\n"
				+ "\t//Stampa umidità e temperatura tramite monitor seriale\r\n"
				+ "\tSerial.print(\"Umidità: \");\r\n"
				+ "\tSerial.print(hum);\r\n"
				+ "\tSerial.print(\" %, Temp: \");\r\n"
				+ "\tSerial.print(temp);\r\n"
				+ "\tSerial.println(\" Celsius\");"
				+ "\n}\n"
				;
				return result;
			case 1:
				return "";
				
			default:
				return "Non cpp file for sensor: " + sensor + " has been generated.";
				
			}
		
	}
	public String GenerateHCode() {
		switch (sensor)
		{
		case "DHT22 (AM2302)":
			switch(generation_type)
			{
			case 0:
				//So che non ho una BPMN, quindi posso generare del codice di default
				String result =
				  "\tvoid Init_sensor();\n"
				+ "\tvoid ReadTempAndHumidity();\n"
				;
				return result;
			case 1:
				return "";
				
			default:
				return "Non cpp file for sensor: " + sensor + " has been generated.";
				
			}
		default:
			return "";
		}
	}
}
