
public abstract class Animal {
	
	//Properties of an animal
	protected int age;
	protected char gender;
	protected String[] eats;
	protected int Health;
	protected int lifeExpectancy;
	protected Enclosure enclosure;
	
	//Constructor setting parameters passed in as animal properties 
	public Animal(char gender, int age, int Health, Enclosure enclosure)
	{
		this.age = age;
		this.gender = gender;
		this.Health = Health;
		this.enclosure = enclosure;
	}
	
	public int getAge()
	{
		return age;
	}

	public char getGender()
	{
		return gender;
	}
	
	public int getLifeExpectancy()
	{
		return lifeExpectancy;
	}
	
	public int getHealth()
	{
		return Health;
	}
	
	public Enclosure getEnclosure()
	{
		return enclosure;
	}
	
	//Method checking if an animal can eat the food passed in as a parameter
	public boolean canEat(String food)
	{
		boolean valid = false;
		for (String foodname: eats)
		{
			if (foodname == food)
			{
				valid = true;
			}
		}
		return valid;
	}
	
	/*
	When an animal eats a food item, the item is taken from the enclosure foodstore. Health and waste is 
	incremented accordingly depending on the food eaten 
	*/
	public void eat()
	{
		for (String foodname: eats)
		{
			if (enclosure.getFoodstore().getFoodItems(foodname) != 0)
			{
				enclosure.getFoodstore().takeFood(foodname);
				switch (foodname)
				{
				case "hay":
					Health+=1;
					enclosure.addWaste(4);
					break;
				case "steak":
					Health+=3;
					enclosure.addWaste(4);
					break;
				case "fruit":
					Health+=2;
					enclosure.addWaste(3);
					break;
				case "celery":
					enclosure.addWaste(1);
					break;
				case "fish":
					Health+=3;
					enclosure.addWaste(2);
				case "ice cream":
					Health+=1;
					enclosure.addWaste(3);
				}
			}
		}
	}
	
	//Everytime aMonthPasses() method is called in animal, this method is called to decrease health of animal
	public void decreaseHealth()
	{
		Health-=2;
	}
	
	public void treat()
	{
		
	}
	
	//aMonthPasses method is inherited by all animal classes 
	public abstract boolean aMonthPasses();
	
	//The enclosure passed in as parameter is set as the animal's enclosure 
	public void setEnclosure(Enclosure e)
	{
		enclosure = e;
	}
}
