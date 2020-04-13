
public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BookLibrarian bl = new BookLibrarian();
		
		BookInformation book1 = new BookInformation("George Orwell","1984", "1984", "adhbadhbasdhbja");
		bl.AddBook(book1);
		
		BookInformation book2 = new BookInformation("Cahrlotte","Jane Eyre","2003","ahbdshabdjh");
		bl.AddBook(book2);
		
		BookInformation book3 = new BookInformation("JRR Tolkien","The Hobbit","1962","nsdjaksbds");
		bl.AddBook(book3);
		
		BookInformation book4 = new BookInformation("suzzane collins","The Hunger Games series","1998","jkasndkjasndkjsad");
		bl.AddBook(book4);
		
		BookInformation book5 = new BookInformation("William","Lord of the flies","2001","ajsdhabsdajds");
		bl.AddBook(book5);
		
		BookInformation book6 = new BookInformation("JDsalinger","The Catcher in the Rye","1895","asdamsn dsmd ");
		bl.AddBook(book6);
		
		BookInformation book7 = new BookInformation("JRR Tolkien","The Lord of the Rings","1993","zajsndjasbdhjsad");
		bl.AddBook(book7);
		
		BookInformation book8 = new BookInformation("Ray bradbury","Fahrenheit 451","1985","kbsdbsadjhbasdjhsad");
		bl.AddBook(book8);
		
		BookInformation book9 = new BookInformation("john green","Looking for Alaska","1967","=jabsdjhbadjhsad");
		bl.AddBook(book9);
		
		BookInformation book10 = new BookInformation("Markus Zusak","The Book Thief","1932","jkasndjkasdjsabd");
		bl.AddBook(book10);
		
		BookInformation book11 = new BookInformation("Lios Lowry","The Giver series","1956","ns ndsa dnsadkjasndkjs");
		bl.AddBook(book11);
		
		BookInformation book12 = new BookInformation("Dogulas Adams","The Hitchhiker's Guide to the Galaxy series","2003","jndkjandkandk.");
		bl.AddBook(book12);
		
		BookInformation book13 = new BookInformation("SE Hinton","The Outsiders","2015","kjsnadjka ");
		bl.AddBook(book13);
		
		BookInformation book14 = new BookInformation("LM montgomery","Anne of Green Gables series","1989","jkandkjankjdas");
		bl.AddBook(book14);
		
		BookInformation book15 = new BookInformation("philip pullman","His Dark Materials series","1963","lndkjankdjnasdk");
		bl.AddBook(book15);
				
		System.out.printf("Unsorted");
		bl.printList();
		System.out.println("Author Sorting");
		SortBook sort_data = new SortBook("Author");
		bl.Set_Sortbook(sort_data);
		bl.printList();
		System.out.println("year of publish Sorting");
		SortBook sort_data2 = new SortBook("YearPublished");
		bl.Set_Sortbook(sort_data2);
		bl.printList();
		System.out.println("Title Sorting");
		SortBook sort_data3 = new SortBook("Title");
		bl.Set_Sortbook(sort_data3);
		bl.printList();	

	}
}
