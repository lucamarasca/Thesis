package network.protocols;

import java.util.ArrayList;

public class HTTPDatas {
	String device;
	String name ;
	String server_ip;
	String request_type;
	String content_type;
	String header;
	ArrayList <String> wifi_ssid = new ArrayList<String>();
	ArrayList <String> wifi_pass = new ArrayList<String>();
	ArrayList <String> datas =  new ArrayList<String>();
	public HTTPDatas() {
		device = "arduino";
		name = "http";
		server_ip = "server_ip";
		request_type = "request_type";
		content_type = "content_type";
		header = "header";
		wifi_ssid.add("//<--First ssid");
		wifi_ssid.add("//<--Second ssid");
		wifi_ssid.add("//<--Third ssid");
		wifi_pass.add("//<--First wifi pass");
		wifi_pass.add("//<--Second wifi pass");
		wifi_pass.add("//<--Third wifi pass");
		datas.add("//<--First topic");
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getServer_ip() {
		return server_ip;
	}
	public void setServer_ip(String server_ip) {
		this.server_ip = server_ip;
	}
	public String getRequest_type() {
		return request_type;
	}
	public void setRequest_type(String request_type) {
		this.request_type = request_type;
	}
	public String getContent_type() {
		return content_type;
	}
	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
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
	public ArrayList<String> getDatas() {
		return datas;
	}
	public void setDatas(ArrayList<String> datas) {
		this.datas = datas;
	}
}
