 class ExamSingleton{
	 private static final ExamSingleton instance = new ExamSingleton();
	    
	    private ExamSingleton(){}

	    public static ExamSingleton createInstance(){
	        return instance;
	    }
	 
	 public String tellJoke() {
		 
		 String str = "\n" + 
		 		"Why do we tell actors to \"break a leg?\"\n" + 
		 		"\n" + 
		 		"Because every play has a cast.\n" + 
		 		"";
		 return str;
	 }
 }

public class ExamQ5 {
public static void main(String[] args) {
	ExamSingleton single = ExamSingleton.createInstance();
	System.out.print(single.tellJoke());
}
}
