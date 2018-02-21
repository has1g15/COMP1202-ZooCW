import java.util.ArrayList;

public class Enclosure {

	ArrayList<Animal> animals;
	protected int waste;
	Foodstore foodstore;
	
	public Enclosure()
	{
		//A new array list of animals is created in the enclosure
		animals = new ArrayList<Animal>();
		//A new foodstore is created in the enclosure 
		foodstore = new Foodstore();
	}

	public void addAnimal(Animal animal)
	{
		//While the number of animals in the enclosure isn't greater than 20, another animal can be added 
		if (checkEnclosureNumber())
		{
			animals.add(animal);
		}
	}
	
	public void removeAnimal(Animal animal)
	{
		//While the size of the animal array list is greater than 0, animals can be removed from the enclosure
		if (animals.size() > 0)
		{
			animals.remove(animal);
		}
	}
	
	//The amount of waste passed in is taken from the total amount of waste 
	public void removeWaste(int amount)
	{
		waste = waste - amount;
	}
	
	//The amount of waste passed in is added to the total amount of waste 
	public void addWaste(int amount)
	{
		waste = waste + amount;
	}
	
	//The amount of waste in the enclosure is returned 
	public int getWasteSize()
	{
		int waste = 0;
		return waste;
	}
	
	//The foodstore is returned from the enclosure 
	public Foodstore getFoodstore()
	{
		return foodstore;
	}
	
	//The size of the animal array list is returned 
	public int size()
	{
		int num = animals.size();
		return num;
	}
	
	//A month passes is called on every animal in the enclosure 
	public void aMonthPasses()
	{
		for (Animal animal: animals)
		{
			animal.aMonthPasses();
			//If an animal has no health left, they're removed from the enclosure 
			/*if (animal.getHealth() == 0)
			{
				animals.remove(animal);
			}
			//If an animal reaches its life expectancy, it's removed from the enclosure 
			if (animal.getAge() == animal.getLifeExpectancy())
			{
				animals.remove(animal);
			}*/
		}
	}
	
	/*The number of animals in the enclosure is checked to make sure it doesn't exceed 20, false is returned if 
	the size of the array list is larger than 20*/
	public boolean checkEnclosureNumber()
	{
		boolean valid = true;
		if (animals.size() > 20)
		{
			valid = false;
		}
		return valid;
	}
}

