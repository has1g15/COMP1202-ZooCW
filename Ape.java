
public abstract class Ape extends Animal{

	public Ape(char gender, int age, int health, Enclosure enclosure) 
	{
		super(gender, age, health, enclosure);
		eats = new String[] {"fruit", "ice cream"};
	}
}
