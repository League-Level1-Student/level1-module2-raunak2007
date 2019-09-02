package _01_getters_and_setters;

public class Taco {
	private String meat;
	private String sauce;
	String getSauce() {
		return this.sauce;
	}
	String getMeat() {
		return this.meat;
	}
	void setSauce(String s) {
		this.sauce=s;
	}
	void setMeat(String s) {
		this.meat=s;
	}
}
	class Person {
	private String name;
	private String superpower;
	Person(String name){
		this.name=name;
	}
	String getName() {
		return this.name;
	}
	String getSuperpower() {
		return this.superpower;
	}
	void setName(String s) {
		this.name=s;
	}
	void setSuperpower(String s) {
		this.superpower=s;
	}
	public String toString() {
		return name+" with superpower "+superpower+" skills";
	}
	}
