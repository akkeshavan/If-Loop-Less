/**
 * @Author : Anand Kumar Keshavan
 */
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CategorizedView {
	 private final Cart cart;
	 private ArrayList<CategorizedItem> itemsByCategory;
	 private CategorizedView(Cart cart){
		 this.cart= cart;
	 }
	 
	 private Set<String> getCategories(){
		 return this.cart.getItems().stream()
				 	     .map(item->item.category)
				 	  	 .collect(Collectors.toSet());
	 }
	 private ArrayList<CategorizedItem> groupBycategory(Set<String> categories) {
		// Stream<Item> items= this.cart.getItems().stream();
		 return categories.stream()
		    	   .map(cat-> {
		    		   		  Stream<Item> items= this.cart.getItems().stream();
		    		           ArrayList<Item> thisCategoryItems= items.filter(item -> item.category == cat )
		    		        		                                   .collect(Collectors .toCollection(ArrayList::new));
		    		           return new CategorizedItem(cat,thisCategoryItems);
		    	   })
		    	   .collect(Collectors .toCollection(ArrayList::new) );    	  
	 }
	 
	 public String toString() {
		 return this.itemsByCategory.stream()
				 					.map(element -> element.toString())
				 					.reduce("", (prev,cur)-> "\n"+prev+cur+ "\n");
	 }
	 
	 public static CategorizedView create(Cart cart) {
		 CategorizedView result = new CategorizedView(cart);
		 result.itemsByCategory= result.groupBycategory(result.getCategories() );
		 return result;
	 }
}
