package fizzBuzz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;

public class FizzBuzzComputer {
	private  ArrayList<Function<Integer, String>> funcs= new ArrayList<>();
	 
	FizzBuzzComputer(){
		funcs.add((Integer i)-> new Fizz().check(i));
		funcs.add((Integer i)->new Buzz().check(i));
	}
	
	
	public String Exec(Integer num) {
		String result = funcs.stream()
							 .map((func) -> func.apply(num))
								 .reduce("",(prev,cur)->prev+cur);
		return createFinalResult(result, num);
	}
	
	private String createFinalResult(String str,Integer num) {
		HashMap<Boolean,String> selector = new HashMap<Boolean, String>() {{
			put(true, num.toString());
			put(false, str);
		}};
		
		return selector.get(str.isEmpty());
	}
}
