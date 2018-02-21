
public class Chimpanzee extends Ape{

	public Chimpanzee(char gender, int age, int Health, Enclosure enclosure) 
	{
		super(gender, age, Health, enclosure);
		lifeExpectancy = 24;
	}

	/*when a month pass is called on the animal, health is decreased, if there is available food, it eats an item
	of food and its age is incremented by a month*/
	public boolean aMonthPasses() 
	{
		decreaseHealth();
		age++;
		return false;
	}
	
	//The playChase() method is called to treat the chimpanzee 
	public void treat()
	{
		playChase();
	}
	
	public void playChase()
	{
		Health+=4;
		System.out.println("The chimpanzee is playing chase");
	}
}
