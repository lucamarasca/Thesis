package elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Condition extends Elements{
	public Boolean isElse;
	public Boolean isEnd;
	String target_variable;
	String operator;
	String value;
	String sensor_id;
	String device_id;
	String mapped_condition ;
	Map<String, String> conditions_dictionary;
	Map<String, String> variables_dictionary;
	
	public Condition(Boolean isEnd, String id) {
		this.setId(id);
		this.setType("end_condition");
		this.isEnd = true;
		this.isElse = false;
	}
	
	public Condition(String condition) {
		System.out.println("im in the condition " + condition);
		conditions_dictionary = new HashMap<String, String>();
		conditions_dictionary.put("&lt;","<");
		conditions_dictionary.put("&gt;",">");
		conditions_dictionary.put("&le;","<=");
		conditions_dictionary.put("&ge;",">=");
		variables_dictionary = new HashMap<String, String>();
		variables_dictionary.put("TEMPERATURE", "temp");
		variables_dictionary.put("HUMIDITY", "hum");
		mapped_condition = "";
		this.sensor_id = "";
		this.type = "";
		this.id = "";
		this.isElse = false;
		this.isEnd = false;
		CreateCondition(condition);
		
		
	}
	public String getMapped_condition() {
		return mapped_condition;
	}
	public void setMapped_condition(String mapped_condition) {
		this.mapped_condition = mapped_condition;
	}
	
	public void CreateCondition(String condition) {
		
		
		String datas;
		condition = mapConditions(condition);
		
			
		if (condition.contains("[") && condition.contains("]") && !condition.contains(","))
		{
			datas = condition.substring(condition.indexOf("[")+1,condition.indexOf("]"));
			datas.replaceAll("\\s","");
			this.id = datas;
			condition = condition.replaceAll("\\[.*\\]", "");
			String [] values1 = condition.split("condition=");
			this.type = values1[0] + "condition";
			this.type = this.type.replaceAll("\\s","");
			
			if (values1[1].contains("_else"))
			{
				values1 = values1[1].split("_");
				mapped_condition = values1[0];
				if (values1[1].equals("else")){
					isElse = true;
					isEnd = false;
				}
			}
			else
			{
				mapped_condition = values1[1];
				
			}
			
		}
		if (condition.contains("[") && condition.contains("]") && condition.contains(","))
		{
			for (int index = condition.indexOf("["); index >= 0; index = condition.indexOf("[", index + 1))
			{
				StringBuilder builder = new StringBuilder(condition);
				datas = condition.substring(index+1,condition.indexOf("]"));
				datas.replaceAll("\\s","");
				String [] values = datas.split(",");
				this.id = values[0].replaceAll("\\s","");
				this.sensor_id = values[1].replaceAll("\\s","");
				builder.replace(index,condition.indexOf("]")+1, "");
				condition = builder.toString();
				condition = mapSensor(condition);
			}
			String [] values1 = condition.split("condition=");
			this.type = values1[0] + "condition";
			this.type = this.type.replaceAll("\\s","");
			
			if (values1[1].contains("_else"))
			{
				values1 = values1[1].split("_");
				mapped_condition = values1[0];
				if (values1[1].equals("else")){
					isElse = true;
					isEnd = false;
				}
			}
			else
			{
				mapped_condition += values1[1];
				
			}
		}	
	}
			
	public String mapConditions(String condition) {
		for(Entry<String, String> entry : conditions_dictionary.entrySet()) {
		    String key = entry.getKey();
		    if (condition.contains(key))
		    {
		    	condition = condition.replaceAll(key, conditions_dictionary.get(key));
		    }
		}
		return condition;
	}
	public String mapSensor(String condition) {
		for(Entry<String, String> entry : variables_dictionary.entrySet()) {
		    String key = entry.getKey();
		    if (condition.contains(key ))
		    {
		    	condition = condition.replaceFirst(key, variables_dictionary.get(key) + this.sensor_id);
		    }
		}
		return condition;
	}
}
