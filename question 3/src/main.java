
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Random r = new Random();
		int random = 0;
		
		for(int i=0; i<10; i++)
		{
			int j = r.random();
		    random = random + j;
		    System.out.printf(" The random number of %d iteration is  "  + j + "\n", i);
			 
		}
		
		System.out.println(" sum of all 10 random numbers   " + random);
		

	}

}
