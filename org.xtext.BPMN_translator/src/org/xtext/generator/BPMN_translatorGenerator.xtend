/*
 * generated by Xtext 2.23.0
 */
package org.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.bPMN_translator.*
import network.protocols.*;
import elements.*;
import java.util.ArrayList
import javax.swing.text.html.parser.Entity
import org.xtext.bPMN_translator.mqtt_data
import org.xtext.bPMN_translator.codex
import sensor.devices.TemperatureSensor
import org.xtext.bPMN_translator.Singleton

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class BPMN_translatorGenerator extends AbstractGenerator {
//++++++++++++++++++++++++++++++Costants++++++++++++++++++++++++++++++++++
ArrayList<String> task_type;
ArrayList<String> gateway_type;
ArrayList <String> temp_array_list;
//ArrayList <String> temporal;
Parallel thread;
boolean fork = false;
int threadNumber;
String loop_variable;
ArrayList<String> start_events;
String str;
String str1;
Condition cond;
String cpp_variables;
String cpp_code;
ArduinoCPPCodeGenerator cpp_gen;
String h_variables;
String h_code;
ArrayList<ArrayList<String>> subStarts;
ArduinoHCodeGenerator h_gen;
ArrayList<String> ino_code;
ArduinoInoCodeGenerator ino_gen;
MQTT netdata;
TemperatureSensor s;
ArrayList<Elements> elements;
ArrayList<String> generated_elements;
int iterations;
int n = 0;
int j = 0;
int i = 0;
int k = 0;
int conditions = 0;
int thread_conditions = 0;
int false_closure = 0;
ArrayList<String> successors
ArrayList<String> opened_conditions;
	
def Initialize(Resource resource){
	ino_gen = new ArduinoInoCodeGenerator();
	opened_conditions = new ArrayList<String>();
	ino_code = new ArrayList<String>();
	elements = new ArrayList<Elements>();
	temp_array_list = new ArrayList<String>();
	generated_elements = new ArrayList<String>();
	start_events = new ArrayList<String>();
	successors = new ArrayList<String>();
	subStarts = new ArrayList<ArrayList<String>>();
	iterations = 0;
	cpp_variables = "";
	cpp_code = "";
	h_variables = "";
	h_code = "";
	str = "";
	loop_variable = "";
	threadNumber = 0;
	generated_elements.add("")
	ino_code.add("");
	FillTaskType();
	FillGatewayType();
	FillEvent(resource);
	setDatas(resource);
	
}
def Reset(){
	ino_gen = new ArduinoInoCodeGenerator();
	opened_conditions = new ArrayList<String>();
	ino_code = new ArrayList<String>();
	temp_array_list = new ArrayList<String>();
	iterations = 0;
	cpp_variables = "";
	cpp_code = "";
	h_variables = "";
	h_code = "";
	str = "";
	loop_variable = "";
	threadNumber = 0;
	conditions = 0;
	thread_conditions = 0;
	false_closure = 0;
}
def FillTaskType(){
	task_type = new ArrayList<String>();
	task_type.addAll("task","sendTask", "receiveTask" , "userTask",
		"manualTask" , "businessRuleTask" , "serviceTask" , "scriptTask" , 
		"callActivity"
	);
}

def FillGatewayType(){
	gateway_type = new ArrayList<String>();
	gateway_type.addAll("exclusiveGateway" , "parallelGateway", "inclusiveGateway",
		"complexGateway", "eventBasedGateway"
	);
}
//++++++++++++++++++++++++++++++Generation++++++++++++++++++++++++++++++++
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		
		
		if (resource !== null)
		{
			
			//THIS MEANS THAT I'VE SELECTED A BPMN
			Initialize(resource);
			
			
			
			ino_code = ArduinoCodeGenerationIno();
			//Main files generation
			for(file : ino_code)
			{
				fsa.generateFile("Main"+iterations+".ino", file )
				iterations++;
			}
			//.h lib file generation
			fsa.generateFile("GeneratedLib.h" ,  h_variables + h_code + "};\n#endif")
	        //.cpp lib file generation
	        fsa.generateFile("GeneratedLib.cpp" ,cpp_variables + cpp_code)
	        
	        
        }
        else
        {
        	
        	//THIS MEANS THAT NO SOURCE BPMN HAS BEEN SELECTED
        	//I need to generate generic code using my datas
			
			//.h lib file generation
			h_gen = new ArduinoHCodeGenerator(Parameters.selected_sensor,Parameters.selected_protocol,Parameters.selected_wifisensor);			
			fsa.generateFile("GeneratedLib.h" , "//+++++++++NO SOURCE BPMN SELECTED"+ 
				ArduinoCodeGenerationH())
			
	        //.cpp lib file generation
	        cpp_gen = new ArduinoCPPCodeGenerator(Parameters.selected_device , Parameters.selected_protocol, Parameters.selected_wifisensor, Parameters.selected_sensor); 
	        fsa.generateFile("GeneratedLib.cpp" ,"//+++++++++NO SOURCE BPMN SELECTED"+
	        	ArduinoCodeGenerationCPP()
	        )
        }
        
       
		        
	}
def InSubProcess(String id, Resource r){
	for (Element : r.allContents.toIterable.filter(element))
	{
		for(Open : Element.open)
		{
			if (Open.keywords.get(0).equals("subProcess"))
			{
				for (Content : Element.contents)
				{
					for (SubElement : Content.element)
					{
						for(SubOpen : SubElement.open)
						{
							if (SubOpen.keywords.get(0).equals("startEvent"))
							{
								var y = 0;
								for (keywords : SubOpen.keywords1)
								{
									if (keywords.equals("id"))
									{
										if (SubOpen.value.get(y).equals(id))
										{
											return true;
										}
									}
								}
								y++;
							}
						}
						for(SubSingleton : SubElement.singleton_tag)
						{
							if (SubSingleton.keywords.get(0).equals("startEvent"))
							{
								var y = 0;
								for (keywords : SubSingleton.keywords1)
								{
									if (keywords.equals("id"))
									{
										if (SubSingleton.value.get(y).equals(id))
										{
											return true;
										}
									}
								}
								y++;
							}
						}
					}
				}
			}
		}
	}
	return false;
}
def FillEvent(Resource r){
	for (Element : r.allContents.toIterable.filter(element))
	{
		for(Open : Element.open)
		{
			if (Open.keywords.get(0).equals("startEvent"))
			{
				if (InSubProcess(getID(Open),r) == false)
				{
					start_events.add(getID(Open));
				}
			}
		}
	}
}

def getID(Open open){
	i=0;
	for (keywords : open.keywords1)
	{
		if (keywords.equals("id"))
		{
			return open.value.get(i);
		}
		i++;
	}
	return "";
}
def getID(Singleton tag){
	
	i=0;
	for (keywords : tag.keywords)
	{
		if (keywords.equals("id"))
		{
			return tag.value.get(i);
		}
		i++;
	}
	return "";
}
	
def getSubStartEvents(String id , Resource r)
{
	subStarts.add(new ArrayList<String>());
	for (Element : r.allContents.toIterable.filter(element))
	{
		for(Open : Element.open)
		{
			if (Open.keywords.get(0).equals("subProcess"))
			{
				var y = 0;
				for (keywords : Open.keywords1)
				{
					if (keywords.equals("id"))
					{
						if (Open.value.get(y).equals(id))
						{
							for (Content : Element.contents)
							{
								for (SubElement : Content.element)
								{
									for(SubOpen : SubElement.open)
									{
										if (SubOpen.keywords.get(0).equals("startEvent"))
										{
											subStarts.get(subStarts.size()-1).add(SubOpen.value.get(y));
											
										}
									}
									for(SubSingleton : SubElement.singleton_tag)
									{
										if (SubSingleton.keywords.get(0).equals("startEvent"))
										{
											subStarts.get(subStarts.size()-1).add(SubSingleton.value.get(y));
										}
									}
								}
								
							}
						}
					y++;
					}
				}
			}
		}
	}
}
def isSubProcess(String id, Resource r){
	for (Element : r.allContents.toIterable.filter(element))
	{
		for(Open : Element.open)
		{
			if (Open.keywords.get(0).equals("subProcess"))
			{
				var y = 0;
				for (keywords1 : Open.keywords1)
				{
					if (keywords1.equals("id"))
					{
						if (Open.value.get(y).equals(id))
							return true;
					}
				}
				y++;
			}
		}
		for(Singleton : Element.singleton_tag)
		{
			if (Singleton.keywords.get(0).equals("subProcess"))
			{
				var y = 0;
				for (keywords1 : Singleton.keywords1)
				{
					if (keywords1.equals("id"))
					{
						if (Singleton.value.get(y).equals(id))
							return true;
					}
				}
				y++;
			}
		}
	}
	return false;
}
def isForkGateway(String id, Resource r){
	var outgoing = 0;
	var y = 0;
	var h = 0;
	for (Element : r.allContents.toIterable.filter(element))
	{
		for(Open : Element.open)
		{
			if (Open.keywords.get(0).equals("sequenceFlow"))
			{
				for(keywords : Open.keywords1)
				{
					if (keywords.equals("sourceRef"))
					{
						if (Open.value.get(h).equals(id))
						{
							for(keywords1 : Open.keywords1)
							{
								if (keywords1.equals("targetRef"))
								{
									outgoing++;
								}
								y++;
							}
							y = 0;
						}
					}
					h++;
				}
				h = 0;
			}
		}
	}
	for (Element : r.allContents.toIterable.filter(element))
	{
		for(Singleton : Element.singleton_tag)
		{
			if (Singleton.keywords.get(0).equals("sequenceFlow"))
			{
				for(keywords : Singleton.keywords1)
				{
					if (keywords.equals("sourceRef"))
					{
						if (Singleton.value.get(h).equals(id))
						{
							for(keywords1 : Singleton.keywords1)
							{
								if (keywords1.equals("targetRef"))
								{
									outgoing++;
								}
								y++;
							}
							y = 0;
						}
					}
					h++;
				}
				h = 0;
			}
		}
	}
	if (outgoing <= 1)
	{
		return true;
	}
	return false;
}
def fillSuccessors(String my_id, Resource r){
	i=0;
	n=0;
	j=0;
	
	var str2 = "";
	var str3 = "";
	for (Element : r.allContents.toIterable.filter(element))
	{
		for(Singleton : Element.singleton_tag)
		{
			if (Singleton.keywords.get(0).equals("sequenceFlow"))
			{
				for(keywords : Singleton.keywords1)
				{
					if (keywords.equals("sourceRef"))
					{
						if (Singleton.value.get(n).equals(my_id))
						{
							for(keywords1 : Singleton.keywords1)
							{
								if (keywords1.equals("targetRef"))
								{
									if(isSubProcess(Singleton.value.get(j),r))
									{
										System.out.println("subprocess");
										
										getSubStartEvents(Singleton.value.get(j),r);
										var app = j;
										for (subStart : subStarts.get(subStarts.size()-1))
											fillSuccessors(subStart,r);
										j=app;
									}
									if (getGatewayType(my_id,r).equals("exclusive_condition") || getGatewayType(my_id,r).equals("inclusive_condition"))
									{
										if (isForkGateway(my_id,r) && getCondition(Element).equals(""))
										{
											false_closure++;
											successors.add("end_condition");
											
										}
									}
									if (!getCondition(Element).equals(""))
									{
										if (threadNumber > 0)
										{
											thread_conditions++;
											
										}
										if (str2.equals(""))
										{
											str2+=getGatewayType(my_id,r)+"="+getCondition(Element);
											
										}
										else
										{
											if (false_closure > 0)
											{
												false_closure--;
											}
											else
												successors.add("end_condition");
											str2 = getGatewayType(my_id,r)+"="+getCondition(Element)+"_else";
										}
										if (hasLoop(my_id,r,str2))
										{
											setLoop(loop_variable);
											return;
										}
										else
										{
											successors.add(str2);
										}	
											
									}
									
									if (!hasLoop(my_id,r,""))
									{
										if (getGatewayType(my_id,r).equals("parallel_condition"))
										{
											
											if (isForkParallel(my_id,r))
											{
												if (thread_conditions <= 0)
												{
													successors.add("end_parallel");
													str3 = "";
													fork = true;
													threadNumber--;
												}		
											}
											else
											{
												if (str3.equals("") || fork)
												{
													fork = false;
													str3 = "parallel_condition";
													successors.add(str3);
													threadNumber++;
													if (thread_conditions > 0)
														thread_conditions--;
													if (thread_conditions == 0 && successors.get(successors.size()-1).equals("end_condition_end"))
													{
														successors.add("end_parallel");
														successors.add(str3);
														threadNumber--;
													}
												}
											}
										}
										
										if (!successors.contains(Singleton.value.get(j)) || getGatewayType(Singleton.value.get(j),r).contains("_condition"))
										{
											
											successors.add(Singleton.value.get(j));
											fillSuccessors(Singleton.value.get(j),r);
										}
										
									}
									
								}
								j++;
							}
							j=0;
						}
					}
					n++;
				}
				n=0;
			}
			i++;
		}
		i=0;
	}
	
	for (Element : r.allContents.toIterable.filter(element))
	{
		for(Open : Element.open)
		{
			if (Open.keywords.get(0).equals("sequenceFlow"))
			{
				for(keywords : Open.keywords1)
				{
					if (keywords.equals("sourceRef"))
					{
						if (Open.value.get(n).equals(my_id))
						{
							for(keywords1 : Open.keywords1)
							{
								if (keywords1.equals("targetRef"))
								{
									if(isSubProcess(Open.value.get(j),r))
									{
										System.out.println("subprocess");
										
										getSubStartEvents(Open.value.get(j),r);
										var app = j;
										for (subStart : subStarts.get(subStarts.size()-1))
											fillSuccessors(subStart,r);
										j=app;
									}
									if (getGatewayType(my_id,r).equals("exclusive_condition") || getGatewayType(my_id,r).equals("inclusive_condition"))
									{
										if (isForkGateway(my_id,r) && getCondition(Element).equals(""))
										{
											successors.add("end_condition");
											false_closure++;
											if (threadNumber > 0)
											{
												thread_conditions--;
											}
										}
									}
									if (!getCondition(Element).equals(""))
									{
										if (threadNumber > 0)
										{
											thread_conditions++;
										}
										if (str2.equals(""))
										{
											str2+=getGatewayType(my_id,r)+"="+getCondition(Element);
											
										}
										else
										{
											if (false_closure > 0)
											{
												false_closure--;
											}
											else
												successors.add("end_condition");
											str2 = getGatewayType(my_id,r)+"="+getCondition(Element)+"_else";
										}
										if (hasLoop(my_id,r,str2))
										{
											setLoop(loop_variable);
											return;
										}
										else
										{
											successors.add(str2);
										}
										
									}
									if (!hasLoop(my_id,r,""))
									{
										if (getGatewayType(my_id,r).equals("parallel_condition"))
										{
											if (isForkParallel(my_id,r))
											{
												if (thread_conditions <= 0)
												{
													successors.add("end_parallel");
													str3 = "";
													fork = true;
													threadNumber--;
												}
												
											}
											else
											{
												if (str3.equals("") || fork)
												{
													fork = false;
													str3 = "parallel_condition";
													successors.add(str3);
													threadNumber++;
												}
												else
												{
													successors.add("end_parallel");
													successors.add(str3);
													threadNumber--;
												}
											}
										}
										if (!successors.contains(Open.value.get(j)) || getGatewayType(Open.value.get(j),r).contains("_condition"))
										{
											successors.add(Open.value.get(j));
											fillSuccessors(Open.value.get(j),r);
										}
							
									}	
								}
								j++;
							}
							j=0;
						}
					}
					n++;
				}
				n=0;
			}
			i++;
		}
		i=0;
	}
	
	if (!str2.equals(""))
	{
		if (false_closure > 0)
		{
			false_closure--;
		}
		else
		{
			successors.add("end_condition_end");
			if (threadNumber > 0 && thread_conditions == 0)
				successors.add("end_parallel");
			
		}
		
	}
	if (!str3.equals(""))
	{
		
		successors.add("end_parallel");
	}
	
	
}

def isForkParallel(String id, Resource r){
	var outgoing = 0;
	var y = 0;
	var h = 0;
	for (Element : r.allContents.toIterable.filter(element))
	{
		for(Open : Element.open)
		{
			if (Open.keywords.get(0).equals("sequenceFlow"))
			{
				for(keywords : Open.keywords1)
				{
					if (keywords.equals("sourceRef"))
					{
						if (Open.value.get(h).equals(id))
						{
							for(keywords1 : Open.keywords1)
							{
								if (keywords1.equals("targetRef"))
								{
									outgoing++;
								}
								y++;
							}
							y = 0;
						}
					}
					h++;
				}
				h = 0;
			}
		}
	}
	for (Element : r.allContents.toIterable.filter(element))
	{
		for(Singleton : Element.singleton_tag)
		{
			if (Singleton.keywords.get(0).equals("sequenceFlow"))
			{
				for(keywords : Singleton.keywords1)
				{
					if (keywords.equals("sourceRef"))
					{
						if (Singleton.value.get(h).equals(id))
						{
							for(keywords1 : Singleton.keywords1)
							{
								if (keywords1.equals("targetRef"))
								{
									outgoing++;
								}
								y++;
							}
							y = 0;
						}
					}
					h++;
				}
				h = 0;
			}
		}
	}
	if (outgoing <= 1)
	{
		return true;
	}
	return false;
}
def setLoop(String condition){
	for (var y = successors.size()-1; y > 0; y--)
	{
		if(successors.get(y).equals(condition))
		{
			val String[] x = condition.split("condition=");
			
			var result = "loop_condition=" + x.get(1).toString() ;
			successors.set(y,result)
			y=0;
		}
	}
}
def hasLoop(String id, Resource r, String condition){
	
	
	if (temp_array_list.contains(id))
	{
		for (var y = 0; y < temp_array_list.size(); y++)
		{
			if (temp_array_list.get(y).equals(id))
				loop_variable = temp_array_list.get(y-1);
		}
		temp_array_list.clear();
		return true;
	}
	if (!condition.equals(""))
	{
		temp_array_list.add(condition);
	}
	else
	{
		temp_array_list.add(id);
	}
	
	if (NextIsEndEvent(getNext(id,r),r))
	{
		temp_array_list.clear();
		return false;
	}
	
	
	return false;
}
def getNext(String id, Resource r){
	var y = 0;
	var h = 0;
	for (Element : r.allContents.toIterable.filter(element))
	{
		for(Open : Element.open)
		{
			if (Open.keywords.get(0).equals("sequenceFlow"))
			{
				for(keywords : Open.keywords1)
				{
					if (keywords.equals("sourceRef"))
					{
						if (Open.value.get(h).equals(id))
						{
							for(keywords1 : Open.keywords1)
							{
								if (keywords1.equals("targetRef"))
								{
									return Open.value.get(y);
								}
								y++;
							}
							y = 0;
						}
					}
					h++;
				}
				h = 0;
			}
		}
	}
	for (Element : r.allContents.toIterable.filter(element))
	{
		for(Singleton : Element.singleton_tag)
		{
			if (Singleton.keywords.get(0).equals("sequenceFlow"))
			{
				for(keywords : Singleton.keywords1)
				{
					if (keywords.equals("sourceRef"))
					{
						if (Singleton.value.get(h).equals(id))
						{
							for(keywords1 : Singleton.keywords1)
							{
								if (keywords1.equals("targetRef"))
								{
									return Singleton.value.get(y);
								}
								y++;
							}
							y = 0;
						}
					}
					h++;
				}
				h = 0;
			}
		}
	}
}
def getCondition(element e)
{
	for (Content : e.contents)
	{
		for (Element : Content.element)
		{
			for (Open : Element.open)
			{
				for (keywords : Open.keywords)
				{
					if (keywords.equals("conditionExpression"))
					{
						for (conditions : Element.contents)
						{
							if (conditions.body.isEmpty())
							{
								return "";
							}
							str1 = "";
							for(data : conditions.body)
							{
								str1 += data
							}
							
							return str1
						}
					}
				}
			}
		}
	}
	return "";
}
def getGatewayType(String id, Resource r){
	k=0;
	for (Element : r.allContents.toIterable.filter(element))
	{
		for(Open : Element.open)
		{
			for(keywords : Open.keywords1)
			{
				if (keywords.equals("id"))
				{
					if (Open.value.get(k).equals(id))
					{
						if (Open.keywords.get(0).contains("exclusive"))
						{
							return "exclusive_condition";
						}
						else if (Open.keywords.get(0).contains("inclusive"))
						{
							return "inclusive_condition";
						}
						else if (Open.keywords.get(0).contains("parallel"))
						{
							return "parallel_condition";
						}
						else return "condition";						
					}
				}
				k++;
			}
			k=0;
		}
	}	
}
def NextIsEndEvent(String id, Resource r){
	k=0;
	for (Element : r.allContents.toIterable.filter(element))
	{
		for(Open : Element.open)
		{
			for(keywords : Open.keywords1)
			{
				if (keywords.equals("id"))
				{
					if (Open.value.get(k).equals(getNext(id,r)))
					{
						if (Open.keywords.get(0).contains("endEvent"))
						{
							return true;
						}
					}
				}
				k++;
			}
			k=0;
		}
	}
	
	return false;
}
def ArduinoCodeGenerationIno(){
	return ino_gen.Generation(elements)
}


//library.h
def ArduinoCodeGenerationH(){
	return h_gen.Generation();
}	

//library.cpp
def ArduinoCodeGenerationCPP(){
	return cpp_gen.Generation();
}

def setDatas(Resource r){
	cpp_gen = new ArduinoCPPCodeGenerator();
	h_gen = new ArduinoHCodeGenerator();
	Reset();
	setDataStructure(r);
	cpp_gen.setProtocol(netdata);
	
	h_gen.setProtocol(netdata);
}


def setDataStructure(Resource r){
	
	for (start : start_events)
	{
		fillSuccessors(start,r);
		Reset();
	}
		for (element : successors)
			setDatas(r,element);
	
}
def setDatas(Resource r, String successor_id){
	if (successor_id.contains("parallel_condition"))
	{
		thread = new Parallel();
		elements.add(thread);
	}
	if (successor_id.contains("end_parallel"))
	{
		thread = new Parallel(true);
		elements.add(thread);
	}
	if (successor_id.contains("condition="))
	{
		conditions++;
		cond = new Condition (successor_id);
		opened_conditions.add(cond.getId());
		elements.add(cond);
		return;
	}
	if (successor_id.equals("end_condition") )
	{
		cond = new Condition(false, opened_conditions.get(opened_conditions.size()-1));
		opened_conditions.remove(opened_conditions.size()-1);
		elements.add(cond);
	}
	if (successor_id.equals("end_condition_end") )
	{
		cond = new Condition(true, opened_conditions.get(opened_conditions.size()-1));
		opened_conditions.remove(opened_conditions.size()-1);
		elements.add(cond);
	}
	for (Element : r.allContents.toIterable.filter(element))
	{
		for (Open : Element.open)
		{
			if (getID(Open).equals(successor_id))
			{
				for(Content : Element.contents)
				{
					for(e : Content.element)
					{
						for(c : e.contents)
						{
							for(Codex : c.codex)
							{
								if (c.type.get(0).equals("_TASK"))
								{	
									for(Protocol : Codex.protocol)
									{
										if (Protocol.pname.get(0).toLowerCase().replaceAll("\\s+","").equals("mqtt"))
										{
											netdata = new MQTT();
											elements.add(netdata);
											netdata.setType("mqtt");
											netdata.setName(getName(Element));
											for(Device : Codex.device_code)
											{ 
												netdata.getDatas().setDevice(Device.device.get(0));
												cpp_gen.setDevice(Device.device.get(0));
												netdata.setId(Device.id.get(0));
											}
											for(MQTTData : Protocol.mqtt_data)
											{
												h_gen.setNetwork_protocol(MQTTData.pname.get(0).toLowerCase().replaceAll("\\s+",""));
												cpp_gen.setNetwork_protocol(MQTTData.pname.get(0).toLowerCase().replaceAll("\\s+",""));
												
												netdata.getDatas().setName(MQTTData.pname.get(0));
												netdata.getDatas().setBroker_user(MQTTData.broker_user.get(0));
												netdata.getDatas().setBroker_password(MQTTData.broker_password.get(0));
												netdata.getDatas().setBroker(MQTTData.broker.get(0));
												
						
						
						
												netdata.getDatas().wifi_ssid.clear();
												netdata.getDatas().wifi_pass.clear();
												for(MQTT_network_data : MQTTData.mqtt_network_data)
												{
													
													netdata.getDatas().wifi_ssid.add(MQTT_network_data.ssid.get(0))
													netdata.getDatas().wifi_pass.add(MQTT_network_data.password.get(0))
												}
												//CHECK
												netdata.getDatas().pubTopics.clear();
												netdata.getDatas().getPublish_data.clear();
												var h = 0;
												for(MQTT_topic_pub : MQTTData.pubtopics)
												{
													if(!netdata.getDatas().pubTopics.contains(MQTT_topic_pub.toString()))
													{
														netdata.getDatas().pubTopics.add(MQTT_topic_pub.toString());
														netdata.getDatas().getPublish_data.add(MQTTData.value.get(h).toString());
														h++;
													}
												}
												netdata.getDatas().subTopics.clear();
												for(MQTT_topic_sub : MQTTData.subtopics)
												{
													if(!netdata.getDatas().subTopics.contains(MQTT_topic_sub.toString()))
													netdata.getDatas().subTopics.add(MQTT_topic_sub.toString());
												}
											}
											for(MQTTDevice : Protocol.mqtt_device)
											{
												h_gen.setWifi_sensor(MQTTDevice.dname.get(0).toLowerCase().replaceAll("\\s+",""));
												cpp_gen.setWifi_sensor(MQTTDevice.dname.get(0).toLowerCase().replaceAll("\\s+",""));
												netdata.setWifi_module(MQTTDevice.dname.get(0));
											}
											if (!generated_elements.contains("mqtt"))
											{
												h_variables += h_gen.generateDefineCode();
												h_code += h_gen.generateMethodsCode();
												cpp_variables += cpp_gen.generateProtocolVariables(netdata);
												cpp_code += cpp_gen.generateProtocolCode(netdata);
												generated_elements.add("mqtt")
											}
										}
									}
									for (sensor : Codex.sensor_code)
									{
										if (sensor.sname.get(0).toLowerCase().replaceAll("\\s+","").equals("temperature"))
										{
											s = new TemperatureSensor();
											for(Device : Codex.device_code)
											{ 
												cpp_gen.setDevice(Device.device.get(0));
												s.setId(Device.id.get(0));
											}
											elements.add(s);
											s.setType("dht22");
											
											for (sensdata : sensor.sensor)
											{
												s.setModule(sensdata.pname.get(0).toLowerCase().replaceAll("\\s+",""));
												s.setSensorId(sensdata.sensor_id.get(0));
												for(pins : sensdata.pins)
												{
													s.getPins().add(pins);
												}
											}
											if (!generated_elements.contains("dht22"))
											{
												h_gen.sensor = "dht22";
												h_variables += h_gen.generateDefineCode();
												h_code += h_gen.generateMethodsCode();
												cpp_code += cpp_gen.generateSensorCode(s);
												generated_elements.add("dht22")
											}
										}
									}	
								}
							}
						}
					}
				}
			}
		}
	}
}



//++++++++++++++++++++++++++++++++STATIC PART OF THE GENERATED CODE++++++++++++++++++++++++++++++++++++	


def StaticMainFileStart(){
	return 
	
	"GeneratedLib gen;\n"+
	"void setup()\n" +
	"{\n" +
  		"\tSerial.begin(9600);\n // opens serial port, sets data rate to 9600 bps"+

  		"\twhile (!Serial);\n";
    
}
def StaticMainFileSecond(){
return 
"
}
void loop()
{


"
}
def getName(element e){
	
	for(Open : e.open)
	{
		for(Keywords : Open.keywords1)
		{
			if (Keywords.equals("name"))
			{
				return Open.value.get(i);
			}
			i++;
		}
	}
}



//++++++++++++++++++++++++++++Comments+++++++++++++++++++++++++++++++++++++++
/*
 def TaskToMethodsH(Open open_tag){
		val type = "void";
		
		if(task_type.contains(open_tag.keywords.get(0))){
			
			return "\t" + type + " " + open_tag.value.get(getNamePosition(open_tag))
			.replaceAll(" ", "_").toLowerCase() + "();"
		}
		
	}
	def TaskToMethodsCPP(Open open_tag){
		val type = "void";
		
		if(task_type.contains(open_tag.keywords.get(0))){
			
			return type + " MyBPMNClass::" + open_tag.value.get(getNamePosition(open_tag))
			.replaceAll(" ", "_").toLowerCase() + "()\n{\n\n\t\\\\todo\n\n}\n"
		}
		
	}



//+++++++++++++++++++++++++++++++GETERS++++++++++++++++++++++++++++++++
def getOutgoingArrow(element e, CharSequence app){
		return_value = "" 
	
		i=0;
		for (Open : e.open)
		{
			if (Open.keywords.get(0).equals("sequenceFlow"))
			{
				for (keywords : Open.keywords1)
				{
					if( keywords.equals("sourceRef"))
						return_value += Open.value.get(i).toString()
					i++
				}
			}
		}
		return return_value
	}
def write(Object o){
	'''�o�'''
}
	//return the task type
	def getTaskType(element e){		 
'''�FOR Open : e.open��Open.keywords.get(0)��ENDFOR�'''
	}
	//return the id of an task
	def getTaskId(element e){		 
'''�FOR Open : e.open��Open.value��ENDFOR�'''
	}
	
	
//+++++++++++++++++++++++++++++++++OTHER METHODS++++++++++++++++++++++++++++++++++++
def int getNamePosition(Open open_tag){
	return open_tag.keywords1.lastIndexOf("name");
	* 
	* 
def getName(element e){
	
	for(Open : e.open)
	{
		for(Keywords : Open.keywords1)
		{
			if (Keywords.equals("name"))
			{
				return Open.value.get(i);
			}
			i++;
		}
	}
}
def GenerateVariables(codex codex) {
	
	for(Protocol : codex.protocol)
	{
		if (Protocol.pname.get(0).toLowerCase().replaceAll("\\s+","").equals("mqtt"))
		{
			for(MQTTData : Protocol.mqtt_data)
			{
				if (temp.equals(""))
				{
					temp += "#include <GeneratedLib.h>\n"+
					"\tchar* brokerUser = \""+MQTTData.broker_user.get(0)+"\";\n"+
					"\tchar* brokerPass = \""+MQTTData.broker_password.get(0)+"\";\n";
					for(MQTT_topic_pub : MQTTData.pubtopics)					
					{
						temp += "\tchar* pubTopic"+iterations +" = \""+MQTT_topic_pub.toString()+"\";\n";
						iterations++;
					}
					
					for(MQTT_topic_sub : MQTTData.subtopics)
					{
						temp += "\tchar* subTopic"+iterations +" = \""+MQTT_topic_sub.toString()+"\";\n";
						iterations++;
					}	
					
				}
				if (!temp.contains(MQTTData.broker.get(0)))
				{
					temp += "char* broker"+iterations +"= \""MQTTData.broker.get(0)+"\";\n";
				}
				if (!temp.contains(MQTTData.broker_user.get(0)))
				{
					temp += "char* brokerUser"+iterations +"= \""MQTTData.broker_user.get(0)+"\";\n";
				}
				if (!temp.contains(MQTTData.broker_password.get(0)))
				{
					temp += "char* brokerPass"+iterations +"= \""+MQTTData.broker_password.get(0)+"\";\n";
				}
				for(MQTT_topic_pub : MQTTData.pubtopics)					
				{
					if (!temp.contains(MQTT_topic_pub.toString()))
					{
						temp += "char* pubTopic"+iterations +"= \""+MQTT_topic_pub.toString()+"\";\n";
					}
				}
				for(MQTT_topic_sub : MQTTData.subtopics)					
				{
					if (!temp.contains(MQTT_topic_sub.toString()))
					{
						temp += "char* subTopic"+iterations +"= \""+MQTT_topic_sub.toString()+"\";\n";
					}
				}
			}
		}	
	}
	iterations++;
	
	
}
	

def GenerateInoCode(codex codex, String name){
	
	for(Protocol : codex.protocol)
	{
		if (Protocol.pname.get(0).toLowerCase().replaceAll("\\s+","").equals("mqtt"))
		{
			for(MQTTData : Protocol.mqtt_data)
			{
				if (temp1.equals(""))
				{
					
					temp1+="\tGeneratedLib.InitNetwork(broker);\n"
						+ "GeneratedLib.reconnect(\"device id\", brokerUser, brokerPassword, broker);\n"
						+"}\n"+StaticMainFileSecond() +"\n"
					for(MQTT_topic_pub : MQTTData.pubtopics)					
					{
						temp1 += "\tGeneratedLib.sendInPubTopic(char* pubTopic"+iterations1 +" );\n";
						iterations1++;
					}
					
					for(MQTT_topic_sub : MQTTData.subtopics)
					{
						temp1 += "\tGeneratedLib.Subscribe(char* subTopic"+iterations1 +" );\n";
						iterations1++;
					}	
					
				}
				if (!temp1.contains(MQTTData.broker.get(0)) && 
					temp1.contains(MQTTData.broker_user.get(0)) &&
					temp1.contains(MQTTData.broker_password.get(0))	
					)
				{
					temp1 += "GeneratedLib.reconnect(\"device id\", brokerUser, brokerPassword, broker"+iterations1+");\n";
				}
				if (temp1.contains(MQTTData.broker.get(0)) && 
					!temp1.contains(MQTTData.broker_user.get(0)) &&
					temp1.contains(MQTTData.broker_password.get(0))	
					)
				{
					temp1 += "GeneratedLib.reconnect(\"device id\", brokerUser"+iterations1+", brokerPassword, broker);\n";
				}
				if (temp1.contains(MQTTData.broker.get(0)) && 
					temp1.contains(MQTTData.broker_user.get(0)) &&
					!temp1.contains(MQTTData.broker_password.get(0))	
					)
				{
					temp1 += "GeneratedLib.reconnect(\"device id\", brokerUser, brokerPassword"+iterations1+", broker);\n";
				}
				if (temp1.contains(MQTTData.broker.get(0)) && 
					!temp1.contains(MQTTData.broker_user.get(0)) &&
					!temp1.contains(MQTTData.broker_password.get(0))	
					)
				{
					temp1 += "GeneratedLib.reconnect(\"device id\", brokerUser"+iterations1+", brokerPassword"+iterations1+", broker);\n";
				}
				if (!temp1.contains(MQTTData.broker.get(0)) && 
					temp1.contains(MQTTData.broker_user.get(0)) &&
					!temp1.contains(MQTTData.broker_password.get(0))	
					)
				{
					temp1 += "GeneratedLib.reconnect(\"device id\", brokerUser, brokerPassword"+iterations1+", broker"+iterations1+");\n";
				}
				if (!temp1.contains(MQTTData.broker.get(0)) && 
					!temp1.contains(MQTTData.broker_user.get(0)) &&
					temp1.contains(MQTTData.broker_password.get(0))	
					)
				{
					temp1 += "GeneratedLib.reconnect(\"device id\", brokerUser"+iterations1+", brokerPassword, broker"+iterations1+");\n";
				}
				if (!temp1.contains(MQTTData.broker.get(0)) && 
					!temp1.contains(MQTTData.broker_user.get(0)) &&
					!temp1.contains(MQTTData.broker_password.get(0))	
					)
				{
					temp1 += "GeneratedLib.reconnect(\"device id\", brokerUser"+iterations1+", brokerPassword"+iterations1+", broker"+iterations1+");\n";
				}
				
				
				
				
			}
		}	
	}
	iterations1++;
}
}	 
* 
* def ArduinoCodeGenerationIno(Resource r, IFileSystemAccess2 fsa){
	for (Element : r.allContents.toIterable.filter(element))
	{
		for(Open : Element.open)
		{
			if (Open.keywords.get(0).toLowerCase().contains("gateway"))
			{
				System.out.println("SI");
			}
		}
	}
	for (Element : r.allContents.toIterable.filter(element))
	{
		for(Content : Element.contents)
		{
			//If i need to generate code for a task
			if(Content.type.contains("_TASK"))
			{
				for(Codex : Content.codex)
				{
					for(Device : Codex.device_code)
					{ 
						if (!ids.contains(Device.id.get(0)))
						{
							for (Element1 : r.allContents.toIterable.filter(element))
							{
								for(Content1 : Element1.contents)
								{
									for(Codex1: Content1.codex)
									{
										for(Device1 : Codex1.device_code)
										{ 
											if (Device1.id.get(0).equals(Device.id.get(0)))
											{
												System.out.println("stessa famiglia");
												GenerateVariables(Codex1);
												GenerateInoCode(Codex1);
												iterations++;
											}
										}
									}
									
								}
								
							}
							ino_code.add(temp + StaticMainFileStart() + temp1);
							ids.add(Device.id.get(0));
						}
					}	
					
				}
			}
		}
	}
}*/	
}
