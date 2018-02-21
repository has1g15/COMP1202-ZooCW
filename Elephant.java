
public class Elephant extends Animal{
	
	public Elephant(char gender, int age, int Health, Enclosure enclosure) 
	{
		super(gender, age, Health, enclosure);
		lifeExpectancy = 36;
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
	
	//The bath() method is called to treat the elephant 
	public void treat()
	{
		bath();
	}
	
	public void bath()
	{
		Health+=5;
		System.out.println("The elephant is having a bath");
	}
}
