package fizzBuzz;

import java.util.HashMap;
import java.util.Map;

public class Fizz implements FizzBuzzBaseType {
	@SuppressWarnings("serial")
	private  static final Map<Boolean, FizzBuzzBaseType> selector= new HashMap<>() {{
		put(true, new Fizz());
		put(false, new None());
	}};
									   
	Fizz(){
		 
		
	}
	
	String check(Integer num) {
		 return selector.get(num%3 ==0).getString();
	}

	@Override
	public String getString() {
		// TODO Auto-generated method stub
		return "Fizz";
	}

}
