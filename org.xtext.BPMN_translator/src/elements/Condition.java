package elements;

import java.util.HashMap;
import java.util.Map;

public class Condition extends Elements{
	String target_variable;
	String operator;
	String value;
	String initial_condition ;
	Map<String, String> conditions_dictionary;
	Map<String, String> variables_dictionary;
	public Condition(String condition) {
		conditions_dictionary = new HashMap<String, String>();
		conditions_dictionary.put("&lt;","<");
		conditions_dictionary.put("&gt;",">");
		conditions_dictionary.put("&le;","<=");
		conditions_dictionary.put("&ge;",">=");
		variables_dictionary = new HashMap<String, String>();
		variables_dictionary.put("TEMPERATURE", "temp");
		variables_dictionary.put("HUMIDITY", "hum");
		initial_condition = condition;
		this.id = "condition";
		this.type = "condition";
	}
	public String generateCondition() {
		return initial_condition;
	}
}
