package fizzBuzz;

import java.util.HashMap;
import java.util.Map;

public class Buzz implements FizzBuzzBaseType {
	@SuppressWarnings("serial")
	private  static final Map<Boolean, FizzBuzzBaseType> selector= new HashMap<>() {{
		put(true, new Buzz());
		put(false, new None());
	}};
			
	Buzz(){
		
	}
	
	String check(Integer num) {
		 return selector.get(num%5 == 0).getString();
	}

	@Override
	public String getString() {
	 
		return "Buzz";
	}

}
