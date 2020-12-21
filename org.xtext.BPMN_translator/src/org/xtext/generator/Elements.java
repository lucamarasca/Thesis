package org.xtext.generator;

public abstract class Elements {
	 String id ;
	 String type;
	 String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
