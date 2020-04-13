
import java.util.*;

public class SortBook {
	
	String sort_data;
	
	public SortBook(String sort_data)
	{
		this.sort_data = sort_data;
	}
	
	public List<BookInformation> SortBook(List<BookInformation> book_list)
	{
		
		if(sort_data == "Author")
		{ 
			Collections.sort(book_list, new Comparator() {
				public int compare(Object One, Object Two) 
				{
				return ((BookInformation)One).getAuthor().compareTo(((BookInformation)Two).getAuthor());
				}
				}); 
			
			 
			return book_list;
		}
		else if(sort_data == "YearPublished")
		{
			Collections.sort(book_list, new Comparator() {
				public int compare(Object One, Object Two) 
				{
				return ((BookInformation)One).getYearPublished().compareTo(((BookInformation)Two).getYearPublished());
				}
				}); 
			
           
			return book_list;
			
		}
		else if (sort_data == "Title")
		{
			Collections.sort(book_list, new Comparator() {
				public int compare(Object One, Object Two) 
				{
				return ((BookInformation)One).getTitle().compareTo(((BookInformation)Two).getTitle());
				}
				}); 
			
            return book_list;
		}
		else
		{
			
			return book_list;
		}
	}

}
