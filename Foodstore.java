import java.util.Hashtable;

public class Foodstore {

	//Hashtable mapping food items to their quantities 
	Hashtable<String, Integer> foodstore;
	
	public Foodstore()
	{
		//new foodstore instantiated 
		foodstore = new Hashtable<String, Integer>();
	}
	
	//Food is added to the foodstore hashtable 
	public void addFood(String type, int numItems)
	{
		foodstore.put(type, numItems);
	}
	
	//Food is taken from the table 
	public void takeFood(String type)
	{
		foodstore.remove(type);
	}
	
	//The number of fooditems is returned 
	public int getFoodItems(String foodName)
	{
		return foodstore.get(foodName);
	}
}
