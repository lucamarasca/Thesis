package org.xtext.generator;

public class SensorsCodeGenerator {
	String sensor;
	//Mi serve per capire se ho la BPMN o meno, se non la ho, genero del codice più generico
	int generation_type;
	SensorsCodeGenerator(String sensor, int type){
		this.sensor = sensor;
		this.generation_type = type;
	}//in the loop lib instantiation.read
	
	public String GenerateCPPCode(){
		switch (sensor)
		{
		case "DHT22 (AM2302)":
			switch(generation_type)
			{
			case 0:
				//So che non ho una BPMN, quindi posso generare del codice di default
				String result =
				"#include <DHT.h>\r\n"
				+ "//Costanti\r\n"
				+ "#define DHTPIN 8   //Pin a cui è connesso il sensore\r\n"
				+ "#define DHTTYPE DHT22   //Tipo di sensore che stiamo utilizzando (DHT22)\r\n"
				+ "DHT dht(DHTPIN, DHTTYPE); //Inizializza oggetto chiamato \"dht\", parametri: pin a cui è connesso il sensore, tipo di dht 11/22"
				+ "//Variabili\r\n"
				+ "int chk;\r\n"
				+ "float hum;  //Variabile in cui verrà inserita la % di umidità\r\n"
				+ "float temp; //Variabile in cui verrà inserita la temperatura\r\n"
				+ "public void Init(){\n\tdht.begin();\n}\n"
				+ "public void ReadTempAndHumidity(){\n"
				+ "//Leggi i dati e salvali nelle variabili hum e temp\r\n"
				+ "hum = dht.readHumidity();\r\n"
				+ "temp= dht.readTemperature();\r\n"
				+ "//Stampa umidità e temperatura tramite monitor seriale\r\n"
				+ "Serial.print(\"Umidità: \");\r\n"
				+ "Serial.print(hum);\r\n"
				+ "Serial.print(\" %, Temp: \");\r\n"
				+ "Serial.print(temp);\r\n"
				+ "Serial.println(\" Celsius\");"
				+ "\n}"
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
