import java.util.ArrayList;

interface BakedGoods {
	public int getPrice();
	public String getDescription();
	public String getSellByDate();
}
class Cookie implements BakedGoods {
	public int getPrice() {
		return 5;
	}
	public String getDescription() {
		return "cookie";
	}
	public String getSellByDate() {
		return "4/12/2020";
	}
}

class Brownie implements BakedGoods{
	public int getPrice() {
		return 30;
	}
	public String getDescription() {
		return "brownie";
	}
	public String getSellByDate() {
		return "4/12/2020";
	}
}

class CinnamonRoll implements BakedGoods {
	public int getPrice() {
		return 10;
	}
	public String getDescription() {
		return "cinnamon";
	}
	public String getSellByDate() {
		return "4/12/2020";
	}
}

public class ExamQ3Interface {
	public static void  main(String args[])
	{
		
		ArrayList<BakedGoods> goodslst=new ArrayList<BakedGoods>();
		Cookie c=new Cookie();
		CinnamonRoll cr=new CinnamonRoll();
		Brownie b=new Brownie();
		
		Cookie c1=new Cookie();
		CinnamonRoll cr1=new CinnamonRoll();
		Brownie b1=new Brownie();
		
		Cookie c2=new Cookie();
		CinnamonRoll cr2=new CinnamonRoll();
		Brownie b2=new Brownie();
		
		goodslst.add(c);
		goodslst.add(cr);
		goodslst.add(b);
		
		goodslst.add(c1);
		goodslst.add(cr1);
		goodslst.add(b1);
		
		goodslst.add(c2);
		goodslst.add(cr2);
		goodslst.add(b2);
		
		for(int i=0;i<goodslst.size();i++)
		{			
			System.out.println(goodslst.get(i).getDescription());
			System.out.println(goodslst.get(i).getPrice());
			System.out.println(goodslst.get(i).getSellByDate());	
		}		
	}
}
