package _02_sea_creature;

public class SeaCreatureRunner {
	public static void main(String[] args) {
	SeaCreature sponge=new SeaCreature("Spongebob");
	SeaCreature p=new SeaCreature("Patrick");
	SeaCreature s=new SeaCreature("Squidward");
	sponge.eat();
	sponge.laugh();
	System.out.println(p.getName());
	System.out.println(s.getName());
	p.eat();
	p.laugh();
	s.eat();
	s.laugh();
	
	}
}
