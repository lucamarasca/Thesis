package network.protocols;

import java.util.ArrayList;

public class MQTTDatas {
	String device;
	String name ;
	String broker_user;
	String broker_password;
	String broker;
	String id;
	ArrayList <String> wifi_ssid = new ArrayList<String>();
	ArrayList <String> wifi_pass = new ArrayList<String>();
	ArrayList <String> publish_topics = new ArrayList<String>();
	ArrayList <String> publish_data =  new ArrayList<String>();
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<String> getPublish_topics() {
		return publish_topics;
	}
	public void setPublish_topics(ArrayList<String> publish_topics) {
		this.publish_topics = publish_topics;
	}
	public ArrayList<String> getPublish_data() {
		return publish_data;
	}
	public void setPublish_data(ArrayList<String> publish_data) {
		this.publish_data = publish_data;
	}
	public ArrayList<String> getSubscribed_topics() {
		return subscribed_topics;
	}
	public void setSubscribed_topics(ArrayList<String> subscribed_topics) {
		this.subscribed_topics = subscribed_topics;
	}
	ArrayList <String> subscribed_topics = new ArrayList<String>();
	public MQTTDatas(){
		id = "deviceid";
		device = "Arduino";
		name = "MQTT";
		broker_user = "//<--broker user";
		broker_password = "//<--broker password";
		broker ="//<--Adress of the broker";
		wifi_ssid.add("//<--First ssid");
		wifi_ssid.add("//<--Second ssid");
		wifi_ssid.add("//<--Third ssid");
		wifi_pass.add("//<--First wifi pass");
		wifi_pass.add("//<--Second wifi pass");
		wifi_pass.add("//<--Third wifi pass");
		publish_topics.add("//<--First topic");
		publish_topics.add("//<--Second topic");
		subscribed_topics.add("//<--First topic");
		subscribed_topics.add("//<--Second topic");
		subscribed_topics.add("//<--Second topic");
		subscribed_topics.add("//<--Second topic");
	}
//++++++++++++++++++++++++++++++GETTERS AND SETTERS+++++++++++++++++++++++++++++++++
	public String getID() {
		return id;
	}
	public void setID(String id) {
		this.id = id;
	}
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
	public ArrayList<String> getPubTopics() {
		return publish_topics;
	}
	public void setPubTopics(ArrayList<String> topics) {
		this.publish_topics = topics;
	}
	public ArrayList<String> getSubTopics() {
		return subscribed_topics;
	}
	public void setSubTopics(ArrayList<String> topics) {
		this.subscribed_topics = topics;
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
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	
}
