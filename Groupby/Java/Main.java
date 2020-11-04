/**
 * @Author : Anand Kumar Keshavan
 */
 

public class Main {
	public static void main(String[] args) {
		  
	    Cart cart = new Cart();
	    cart.Add( new Item("Veggies", "Onions", 2, 100.00))
	    	  .Add( new Item("Dairy Prod", "Milk", 4, 60.00))
	        .Add( new Item("Snacks", "Biscuits", 2, 20.00))
	        .Add( new Item("Snacks", "Chips", 3, 40.00))
	        .Add( new Item("Veggies", "Tomatoes", 1, 60.00))
	        .Add( new Item("Snacks", "Chocolate", 1, 50.00));
	    System.out.println(cart.toString());
	    
	    CategorizedView view= CategorizedView.create(cart);
	    System.out.println(view.toString());
	  }
}
