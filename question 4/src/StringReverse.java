
public class StringReverse {
	
	public StringBuilder reverseString(StringBuilder str)
	{
		
		if(str == null)
		{
			str = null;
		}
		else
		{
			  
			        StringBuilder input1 = new StringBuilder(); 
			        input1.append(str); 
			        input1 = input1.reverse(); 
			        str = input1;
	    }  

		
		return str;
	}
	

}
