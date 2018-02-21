
public class Zookeeper {

	Enclosure zookeeperEnclosure;
	Foodstore foodstore;
	
	public Zookeeper()
	{
		//Zookeeper assigned to a new enclosure 
		zookeeperEnclosure = new Enclosure();
		//New zoo foodstore created 
		foodstore = new Foodstore();
	}
	
	public void aMonthPasses() 
	{
		/*
		In a typical month, a zookeeper gives a treat to up to two animals, removes up to 20 units of waste from 
		their enclosure and move up to 20 units of food from the zoo foodstore to the enclosure foodstore 
		*/
		for (Animal animal: zookeeperEnclosure.animals)
		{
			if (animal instanceof Lion || animal instanceof Tiger || animal instanceof Bear)
			{
				giveTreat(animal);
			}
		}
		zookeeperEnclosure.removeWaste(20);
		/*try 
		{
			moveFood("celery", 0);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}*/
	}

	/*If an animal is a lion or a tiger, it will be stroked by the zookeeper and if it's a bear, the hug method will
	be called*/
	public void giveTreat(Animal animal)
	{
		if (animal instanceof BigCat)
		{
			strokeAnimal(animal);
		}
		else if (animal instanceof Bear)
		{
			hugAnimal(animal);
		}
		else
		{
			System.out.println("This zookeeper can't treat this animal");
		}
	}
	
	//Depending on the subclass of BigCat, the stroked method is called in that class 
	public void strokeAnimal(Animal animal)
	{
		if (animal instanceof Lion)
		{
			((Lion) animal).stroked();
		}
		else if (animal instanceof Tiger)
		{
			((Tiger) animal).stroked();
		}
	}
	
	//The bear is treated 
	public void hugAnimal(Animal animal)
	{
		((Bear) animal).hug();
	}
	
	//Food is moved from the zoo foodstore to the enclosure foodstore 
	public void moveFood(String item, int quantity) throws Exception 
	{
		int quantityAvailable = foodstore.getFoodItems(item);
		//If more than 20 units are moved, an exception is thrown 
		if (quantity > 20)
		{
			throw new Exception("Zookeeper can only move 20 units of food");
		}
		else 
		{
			/*If the quantity of food available in the foodstore is less than the quantity being moved by the 
			zookeeper, an exception is thrown*/
			if (quantityAvailable < quantity)
			{
				throw new Exception("Amount of food unavailable");
			}
			/*If a quantity under 20 and less than the amount of items in the foodstore is moved, food is taken
			from the zoo foodstore and placed in the enclosure foodstore*/
			else
			{
				foodstore.takeFood(item);
				zookeeperEnclosure.foodstore.addFood(item, quantity);
			}
		}
	}
	
	//Waste is removed from the enclosure by the zookeeper provided the quantity being moved is under 20
	public void removeWaste(int quantity)
	{
		if (quantity > 20)
		{
			System.out.println("Zookeeper can only move up to 20 units of waste");
		}
		else
		{
			zookeeperEnclosure.removeWaste(quantity);
		}
	}
}
