
public abstract class BigCat extends Animal{

	public BigCat(char gender, int age, int Health, Enclosure enclosure)
	{
		super(gender, age, Health, enclosure);
		lifeExpectancy = 24;
		eats = new String[] {"steak", "celery"};
	}
}
