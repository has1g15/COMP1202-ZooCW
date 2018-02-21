
public class PlayZookeeper extends Zookeeper{

	public PlayZookeeper()
	{
		
	}
	
	//Depending on instance of animal, appropriate method is called 
	public void giveTreat(Animal animal)
	{
		if (animal instanceof Penguin)
		{
			letWatchAFilm(animal);
		}
		else if (animal instanceof Chimpanzee)
		{
			letPlayChase(animal);
		}
		else if (animal instanceof Gorilla)
		{
			letPaint(animal);
		}
		else
		{
			System.out.println("This zookeeper can't treat this animal");
		}
	}
	
	//Penguin treated 
	public void letWatchAFilm(Animal animal)
	{
			((Penguin) animal).watchAFilm();
	}
	
	//Chimpanzee treated 
	public void letPlayChase(Animal animal)
	{
			((Chimpanzee) animal).playChase();
	}
	
	//Gorilla treated 
	public void letPaint(Animal animal)
	{
			((Gorilla) animal).painting();
	}
}
