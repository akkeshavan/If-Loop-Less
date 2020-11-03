
public class Item {
	final String name;
	final String category;
	final double unit_price;
	final int units;
	final double amount;
	  
	Item(String category, String name, int units, double unit_price){
	  	this.category= category;
	  	this.name=name;
	    this.units = units;
	    this.unit_price = unit_price;
	    this.amount = this.units * this.unit_price;
	}
	  
	public String toStringWithoutCategory() {  
		return "\tItem: " + this.name + "\tUnits: " + this.units
        + "\tUnit Price: " + this.unit_price + "\tAmount: " + this.amount +"\n";
	}
	  
	public String toString(){
	  	return "\tCategory: " + this.category + "\tItem: " + this.name + "\tUnits: " + this.units
	            + "\tUnit Price: " + this.unit_price + "\tAmount: " + this.amount +"\n";
	}
}
