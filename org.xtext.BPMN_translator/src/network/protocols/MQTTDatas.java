package network.protocols;

import java.util.ArrayList;

public class MQTTDatas {
	String name ;
	String broker_user;
	String broker_password;
	String broker;
	ArrayList <String> wifi_ssid = new ArrayList<String>();
	ArrayList <String> wifi_pass = new ArrayList<String>();
	ArrayList <String> topics = new ArrayList<String>();
	MQTTDatas(){
		name = "MQTT";
		broker_user = "//<--broker user";
		broker_password = "//<--broker password";
		broker = "//<--Adress of the broker";
		wifi_ssid.add("//<--First ssid");
		wifi_ssid.add("//<--Second ssid");
		wifi_ssid.add("//<--Third ssid");
		wifi_pass.add("//<--First wifi pass");
		wifi_pass.add("//<--Second wifi pass");
		wifi_pass.add("//<--Third wifi pass");
		topics.add("//<--First topic");
		topics.add("//<--Second topic");
	}
//++++++++++++++++++++++++++++++GETTERS AND SETTERS+++++++++++++++++++++++++++++++++
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBroker_user() {
		return broker_user;
	}
	public void setBroker_user(String broker_user) {
		this.broker_user = broker_user;
	}
	public String getBroker_password() {
		return broker_password;
	}
	public void setBroker_password(String broker_password) {
		this.broker_password = broker_password;
	}
	public String getBroker() {
		return broker;
	}
	public void setBroker(String broker) {
		this.broker = broker;
	}
	public ArrayList<String> getTopics() {
		return topics;
	}
	public void setTopics(ArrayList<String> topics) {
		this.topics = topics;
	}
	public ArrayList<String> getWifi_ssid() {
		return wifi_ssid;
	}
	public void setWifi_ssid(ArrayList<String> wifi_ssid) {
		this.wifi_ssid = wifi_ssid;
	}
	public ArrayList<String> getWifi_pass() {
		return wifi_pass;
	}
	public void setWifi_pass(ArrayList<String> wifi_pass) {
		this.wifi_pass = wifi_pass;
	}
	
}
