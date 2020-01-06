package br.com.conta.classes;

public class Pessoa {
	
	protected String name;
	protected int age;
	protected String document;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public int getAge() {
		return age;
	}
	
	
	public String getDocument() {
		return document;
	}
		 
}
