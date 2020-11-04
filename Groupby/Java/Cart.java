/**
 * @Author : Anand Kumar Keshavan
 */

import java.util.ArrayList;
import java.util.stream.Stream;
 

public class Cart {
	private final ArrayList<Item> items;
	  Cart(){
	  	this.items = new ArrayList<> ();
	  }
	  public Cart Add(Item item){
	  	this.items.add(item);
	    return this;
	  }
	  public ArrayList<Item> getItems(){
	  	return this.items;
	  }
	  
	  public String toString(){
	  	 return  Stream.of(this.items)
	                  .map(item-> item.toString())
	                  .reduce("",(prev,cur)-> prev+cur.toString());
	  }
}
