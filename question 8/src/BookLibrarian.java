import java.util.ArrayList;

import java.util.List;

public class BookLibrarian {

	List<BookInformation> Book_list = new ArrayList<BookInformation>();
	private SortBook sortbook;
	
	public BookLibrarian()
	{}
	
	public void Set_Sortbook(SortBook sortbook)
	{
		this.sortbook = sortbook;
	}
	
	public void AddBook(BookInformation book)
	{
		
		Book_list.add(book);
	}
	
	public void printList()
	{  List<BookInformation> sortlist;
		if(sortbook == null)
		{
			sortlist = Book_list;
			
		}
		else
		{
			sortlist = sortbook.SortBook(Book_list);
		}	
		
		for(BookInformation book: sortlist)
		{
			System.out.println("Author:   " + book.getAuthor());
			System.out.println("Title:   " + book.getTitle());
			System.out.println("YearPublished:   " + book.getYearPublished());
			System.out.println("Summary:   " + book.getSummary());
		}
		
		
		
	}
}
