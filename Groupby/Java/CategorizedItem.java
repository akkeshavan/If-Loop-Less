/**
 * @Author : Anand Kumar Keshavan
 */

import java.util.ArrayList;

public class CategorizedItem {
	final private String category;
	final private ArrayList<Item> items;
	final double sub_total;
	
	CategorizedItem(String category, ArrayList<Item> items){
		this.category= category;
		this.items = items;
		this.sub_total = this.items.stream()
								   .map(element-> element.amount)
								   .reduce(0.00,(prev, cur)->prev+cur);
	}
	
	public String  toString() {
		return "Category: " + this.category +"\n" + 
	           this.items.stream().map(item->item.toStringWithoutCategory())
	        		   			  .reduce("",(prev,cur)->prev+cur)
	        		   			  + "\n"+ "Sub-Total: "+ this.sub_total;
	}
	
	 
}
