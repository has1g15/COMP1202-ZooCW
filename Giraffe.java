
public class Giraffe extends Animal{

	public Giraffe(char gender, int age, int Health, Enclosure enclosure) 
	{
		super(gender, age, Health, enclosure);
		lifeExpectancy = 28;
		eats = new String[] {"hay", "fruit"};
	}

	/*when a month pass is called on the animal, health is decreased, if there is available food, it eats an item
	of food and its age is incremented by a month*/
	public boolean aMonthPasses() 
	{
		decreaseHealth();
		age++;
		return false;
	}
	
	//The massageNeck() method is called to treat the giraffe 
	public void treat()
	{
		massageNeck();
	}
	
	public void massageNeck()
	{
		Health+=4;
		System.out.println("The giraffe is being massaged");
	}
}
