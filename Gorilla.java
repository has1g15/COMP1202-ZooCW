
public class Gorilla extends Ape{

	public Gorilla(char gender, int age, int Health, Enclosure enclosure) 
	{
		super(gender, age, Health, enclosure);
		lifeExpectancy = 32;
	}

	/*when a month pass is called on the animal, health is decreased, if there is available food, it eats an item
	of food and its age is incremented by a month*/
	public boolean aMonthPasses() 
	{
		decreaseHealth();
		age++;
		return false;
	}
	
	//The painting() method is called to treat the gorilla 
	public void treat()
	{
		painting();
	}
	
	public void painting()
	{
		Health+=4;
		System.out.println("The gorilla is painting");
	}
}
