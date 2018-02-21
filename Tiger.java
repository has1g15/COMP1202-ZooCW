
public class Tiger extends BigCat{

	public Tiger(char gender, int age, int Health, Enclosure enclosure) 
	{
		super(gender, age, Health, enclosure);
	}

	/*when a month pass is called on the animal, health is decreased, if there is available food, it eats an item
	of food and its age is incremented by a month*/
	public boolean aMonthPasses() 
	{
		decreaseHealth();
		age++;
		return false;
	}
	
	//The stroked() method is called to treat the tiger 
	public void treat()
	{
		stroked();
	}
	
	public void stroked()
	{
		Health+=3;
		System.out.println("The tiger is being stroked");
	}
}
