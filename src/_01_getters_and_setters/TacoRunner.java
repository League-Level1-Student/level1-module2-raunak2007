package _01_getters_and_setters;

public class TacoRunner {
	public static void main(String[] args) {
		Person raunak=new Person("raunak");
		Person rohan=new Person("rohan");
		Person mickey=new Person("mickey");
		raunak.setSuperpower("flying");
		rohan.setSuperpower("running");
		mickey.setSuperpower("swimming");
		System.out.println(raunak);
		System.out.println(rohan);
		System.out.println(mickey);
		
	}
}
