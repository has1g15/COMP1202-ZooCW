import java.util.ArrayList;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class Zoo {

	BufferedReader reader;
	FileReader file;
	ArrayList<Enclosure> enclosures;
	ArrayList<Zookeeper> zookeepers;

	public static void main(String[] args) 
	{
		Zoo zoo = new Zoo();
		//Go method is called on zoo to start simulation 
		zoo.go();
	}

	public Zoo()
	{
		Enclosure animalEnclosure = new Enclosure();
		Zookeeper zookeeper = new Zookeeper();
		enclosures = new ArrayList<Enclosure>();
		zookeepers = new ArrayList<Zookeeper>();
		
		//Reads in configuration file and catches exception if file is not found
		try 
		{
			file = new FileReader("F:/ECSZoo/src/myZoo.txt");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		reader = new BufferedReader(file);
		String line[];
		String type;
		String information = " ";
		
		//Entities added to zoo while there are still lines to read in file
		while (fileReady())
		{
			//Line of file is split on colon 
			line = getLine().split(":");
			type = line[0];

			switch(type)
			{
			case "zoo": 
				System.out.println("~~~ Welcome to ECSZoo ~~~");
				break;
			//If an item of food is read in, the type of food and the number of items is added to the foodstore hashtable
			case "hay":
			case "steak":
			case "fish":
			case "ice cream":
			case "fruit":
			case "celery":
				information = line[1];
				int numItems = Integer.parseInt(information);
				zookeeper.foodstore.addFood(type, numItems);
				System.out.println(numItems + " x " + type + " has been added to the foodstore");
				break;
			//When an enclosure is read in, a new enclosure is added to the array list of enclosures 
			case "enclosure":
				information = line[1];
				animalEnclosure = new Enclosure();
				animalEnclosure.addWaste(Integer.parseInt(information));
				enclosures.add(animalEnclosure);
				System.out.println("An enclosure has been added, it contains " + information + " units of waste");
				break;
			/*
			When an animal is read in, the properties of the animal are split on the commas and passed in as parameters
			to the constructor of the animal
			*/
			case "bear":
				information = line[1];
				line = information.split(",");
				Bear bear = new Bear(line[0].toCharArray()[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]), animalEnclosure);
				animalEnclosure.addAnimal(bear);
				System.out.println("A bear has been added: Gender: " + line[0].toCharArray()[0] + ", Age: " + Integer.parseInt(line[1]) + ", Health: " + Integer.parseInt(line[2]));
				break;
			case "chimpanzee":
				information = line[1];
				line = information.split(",");
				Chimpanzee chimpanzee = new Chimpanzee(line[0].toCharArray()[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]), animalEnclosure);
				animalEnclosure.addAnimal(chimpanzee);
				System.out.println("A chimpanzee has been added: Gender: " + line[0].toCharArray()[0] + ", Age: " + Integer.parseInt(line[1]) + ", Health: " + Integer.parseInt(line[2]));
				break;
			case "elephant":
				information = line[1];
				line = information.split(",");
				Elephant elephant = new Elephant(line[0].toCharArray()[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]), animalEnclosure);
				animalEnclosure.addAnimal(elephant);
				System.out.println("An elephant has been added: Gender: " + line[0].toCharArray()[0] + ", Age: " + Integer.parseInt(line[1]) + ", Health: " + Integer.parseInt(line[2]));
				break;
			case "giraffe":
				information = line[1];
				line = information.split(",");
				Giraffe giraffe = new Giraffe(line[0].toCharArray()[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]), animalEnclosure);
				animalEnclosure.addAnimal(giraffe);
				System.out.println("A giraffe has been added: Gender: " + line[0].toCharArray()[0] + ", Age: " + Integer.parseInt(line[1]) + ", Health: " + Integer.parseInt(line[2]));
				break;
			case "gorilla":
				information = line[1];
				line = information.split(",");
				Gorilla gorilla = new Gorilla(line[0].toCharArray()[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]), animalEnclosure);
				animalEnclosure.addAnimal(gorilla);
				System.out.println("A gorilla has been added: Gender: " + line[0].toCharArray()[0] + ", Age: " + Integer.parseInt(line[1]) + ", Health: " + Integer.parseInt(line[2]));
				break;
			case "lion":
				information = line[1];
				line = information.split(",");
				Lion lion = new Lion(line[0].toCharArray()[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]), animalEnclosure);
				animalEnclosure.addAnimal(lion);
				System.out.println("A lion has been added: Gender: " + line[0].toCharArray()[0] + ", Age: " + Integer.parseInt(line[1]) + ", Health: " + Integer.parseInt(line[2]));
				break;
			case "penguin":
				information = line[1];
				line = information.split(",");
				Penguin penguin = new Penguin(line[0].toCharArray()[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]), animalEnclosure);
				animalEnclosure.addAnimal(penguin);
				System.out.println("A penguin has been added: Gender: " + line[0].toCharArray()[0] + ", Age: " + Integer.parseInt(line[1]) + ", Health: " + Integer.parseInt(line[2]));
				break;
			case "tiger":
				information = line[1];
				line = information.split(",");
				Tiger tiger = new Tiger(line[0].toCharArray()[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]), animalEnclosure);
				animalEnclosure.addAnimal(tiger);
				System.out.println("A tiger has been added: Gender: " + line[0].toCharArray()[0] + ", Age: " + Integer.parseInt(line[1]) + ", Health: " + Integer.parseInt(line[2]));
				break;
			//When a zookeeper is read in, the zookeeper is added to the array list of zookeepers 
			case "zookeeper":
				zookeepers.add(zookeeper);
				break;
			case "playZookeeper":
				PlayZookeeper playzookeeper = new PlayZookeeper();
				zookeepers.add(playzookeeper);
				System.out.println("A playzookeeper has been added to the zoo");
				break;
			case "physioZookeeper":
				PhysioZookeeper physiozookeeper = new PhysioZookeeper();
				zookeepers.add(physiozookeeper);
				break;
			}
		}
		
	}

	//Method returning line of the file 
	public String getLine()
	{
		String line = " ";
		try 
		{
			line = reader.readLine();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return line;
	}

	//Returns true if the file is ready to be read from 
	public boolean fileReady()
	{
		boolean ready = false;
		try 
		{
			if (reader.ready())
			{
				ready = true;
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return ready;
	}

	public void go()
	{
		//All the time aMonthPasses() is true, it will be called again 
		while (aMonthPasses())
		{
			aMonthPasses();
			try
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e)
			{

			}
		}
	}

	//A month passes in the zoo. If there are still animals in the enclosure, method returns true
	public boolean aMonthPasses()
	{
		boolean passMonth = true;
		boolean noAnimals = false;
		//For every enclosure in the enclosures array list, the aMonthPasses() method is called
		for (Enclosure animalEnclosure:enclosures)
		{
			animalEnclosure.aMonthPasses();
			//If there are no animals left in the enclosure, another month won't pass
			if (animalEnclosure.animals.size() < 1)
			{
				noAnimals = true;
			}
			if (noAnimals)
			{
				passMonth = false;
			}
		}

		//A month passes is called on every zookeeper in the zookeepers array list 
		for (Zookeeper zooKeeper: zookeepers)
		{
			zooKeeper.aMonthPasses();
			String foodList[] = new String[] {"fish", "ice cream", "steak", "hay", "fruit", "celery"};
			
			//Foodstore is restocked 
			for (int i = 0; i < foodList.length; i++)
			{
				zooKeeper.foodstore.addFood(foodList[i], 1);
			}
		}
		return passMonth;
	}
}
