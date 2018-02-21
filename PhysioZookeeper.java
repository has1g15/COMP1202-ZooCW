
public class PhysioZookeeper extends Zookeeper{

	public PhysioZookeeper()
	{
		
	}
	
	//Treat given to animal passed in
	public void giveTreat(Animal animal)
	{
		if (animal instanceof Giraffe)
		{
			giveNeckMassage(animal);
		}
		else if (animal instanceof Elephant)
		{
			giveBath(animal);
		}
		else
		{
			System.out.println("This zookeeper can't treat this animal");
		}
	}
	
	//Giraffe treated 
	public void giveNeckMassage(Animal animal)
	{
		((Giraffe) animal).massageNeck();
	}
	
	//Elephant treated 
	public void giveBath(Animal animal)
	{
		((Elephant) animal).bath();
	}
}
