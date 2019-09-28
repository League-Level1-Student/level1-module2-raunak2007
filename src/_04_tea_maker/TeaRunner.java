package _04_tea_maker;

public class TeaRunner {
	public static void main(String[] args) {
		TeaBag tea=new TeaBag("chamomile");
		Kettle k=new Kettle();
		k.boil();
		Kettle.Water w=k.getWater();
		Cup c=new Cup();
		c.makeTea(tea,w);
	}
}
