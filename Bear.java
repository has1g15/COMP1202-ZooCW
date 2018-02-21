
public class Bear extends Animal{
	
	public Bear(char gender, int age, int Health, Enclosure enclosure) 
	{
		super(gender, age, Health, enclosure);
		eats = new String[] {"fish", "steak"};
		lifeExpectancy = 18;
	}

	/*when a month pass is called on the animal, health is decreased, if there is available food, it eats an item
	of food and its age is incremented by a month*/
	public boolean aMonthPasses() 
	{
		decreaseHealth();
		
		//if (food = eats)
		{
			eat();
		}
		age++;
		return false;
	}
	
	//The hug method is called when the bear is treated 
	public void treat()
	{
		hug();
	}
	
	public void hug()
	{
		Health+=3;
		System.out.println("The bear is hugging");
	}
}
