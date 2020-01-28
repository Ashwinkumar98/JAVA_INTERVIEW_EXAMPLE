package lambdaFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		List<Book> books=new ArrayList<>();
		books.add(new Book(1987363544L, "Java 8", "James", 4.7, "Amazon"));
		books.add(new Book(1986363544L, "Engineering Graphics", "Vinoth", 4.0, "Flipkart"));
		books.add(new Book(1980363544L, "Integration and Differentiation", "Veerarajan", 4.2, "Flipkart"));
		books.add(new Book(1980360544L, "Data Structures", "Kumar", 4.0, "Amazon"));
		books.add(new Book(1980360544L, "Algorithms", "suresh", 4.2, "Snapdeel"));
		
		Map<String, List<Book>> res = books.stream().filter(b->b.getRating()>=4.2).collect(Collectors.groupingBy(Book::getSource));
		
		for(Entry<String, List<Book>> entry : res.entrySet()) {
			System.out.println("Source : "+entry.getKey());
			for(Book b : entry.getValue()) {
				System.out.println(b.toString());
			}
		}
	}

}
