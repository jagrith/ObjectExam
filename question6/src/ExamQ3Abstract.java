import java.util.ArrayList;

abstract class SpaceShip {

int tonnage;

String name;

public int getTonnage() {return tonnage; }

public String getName() {return name;}

public abstract String getFranchise();{}
}

class StarWarsShips extends SpaceShip {
	public  int getTonnage()
	{
		return 2; 
	}

	public String getName() 
	{	
		return "Falcon";
	}

	public String getFranchise() // Star Wars, Star Trek, or some other Sci-fi universe
	{
		return "franchise";
	}	
}

class StarTrekShips extends SpaceShip {

	public  int getTonnage()
	{
		return 5; 
	}

	public String getName() 
	{	
		return "USS Enterprise";
	}

	public String getFranchise() // Star Wars, Star Trek, or some other Sci-fi universe
	{
		return "franchise";
	}	
}

class OtherSciFiSpaceShips extends SpaceShip {
	
	public  int getTonnage()
	{
		return 2; 
	}

	public String getName() 
	{	
		return "firefly";
	}

	public String getFranchise() // Star Wars, Star Trek, or some other Sci-fi universe
	{
		return "franchise";
	}
} 
public class ExamQ3Abstract {
	public static void main(String[] args) {
		ArrayList<SpaceShip> shiplst = new ArrayList<SpaceShip>(); 
		
		StarWarsShips starwarship1=new StarWarsShips();
		StarTrekShips startrekship1=new StarTrekShips();
		OtherSciFiSpaceShips scifi1=new OtherSciFiSpaceShips();
		
		StarWarsShips starwarship2=new StarWarsShips();
		StarTrekShips startrekship2=new StarTrekShips();
		OtherSciFiSpaceShips scifi2=new OtherSciFiSpaceShips();
		
		
		StarWarsShips starwarship3=new StarWarsShips();
		StarTrekShips startrekship3=new StarTrekShips();
		OtherSciFiSpaceShips scifi3=new OtherSciFiSpaceShips();
		
		shiplst.add(scifi1);
		shiplst.add(scifi2);
		shiplst.add(scifi3);
		shiplst.add(starwarship1);
		shiplst.add(starwarship2);
		shiplst.add(starwarship3);
		shiplst.add(startrekship1);
		shiplst.add(startrekship2);
		shiplst.add(startrekship3);
		
		for(int i = 0; i < shiplst.size(); i++)
		{
			 System.out.println(shiplst.get(i).getName());
			 System.out.println(shiplst.get(i).getTonnage());
		     System.out.println(shiplst.get(i).getFranchise());
		}
			
	}

}
