
public class Penguin extends Animal{

	public Penguin(char gender, int age, int Health, Enclosure enclosure) 
	{
		super(gender, age, Health, enclosure);
		lifeExpectancy = 15;
		eats = new String[] {"fish", "ice cream"};
	}

	/*when a month pass is called on the animal, health is decreased, if there is available food, it eats an item
	of food and its age is incremented by a month*/
	public boolean aMonthPasses() 
	{
		decreaseHealth();
		age++;
		return false;
	}

	//The watchAFilm() method is called to treat the penguin 
	public void treat()
	{
		watchAFilm();
	}
	
	public void watchAFilm()
	{
		Health+=2;
		System.out.println("The penguin is watching a film");
	}
}
