package designPattern.creating.builder;

// Uso
public class MainBuilder {
	public static void main(String[] args) {
		SandwichBuilder builder = new ClubSandwichBuilder();
		SandwichDirector director = new SandwichDirector();
		Sandwich sandwich = director.makeSandwich(builder);
		System.out.println(sandwich);
	}
}

//Produto Complexo 
class Sandwich {
	private String bread;
	private String meat;
	private String cheese;
	
	public void setBread(String bread) { this.bread = bread; }
	public void setMeat(String meat) { this.meat = meat; }
	public void setCheese(String cheese) { this.cheese = cheese; }
	
	public String toString() {
		return bread + " sandwich with " + meat + " and " + cheese;
	}
}

// Builder abstrato
interface SandwichBuilder {
	void buildBread();
	void buildMeat();
	void buidCheese();
	Sandwich getSandwich();
}

// Builder concreto
class ClubSandwichBuilder implements SandwichBuilder {
	private Sandwich sandwich = new Sandwich();
	
	public void buildBread() { sandwich.setBread("Toasted");	}

	public void buildMeat() { sandwich.setMeat("Turkey"); }

	public void buidCheese() { sandwich.setCheese("Cheddar"); }
	
	public Sandwich getSandwich() {	return sandwich; 	}
}

// Diretor
class SandwichDirector {
	public Sandwich makeSandwich(SandwichBuilder builder) {
		builder.buildBread();
		builder.buildMeat();
		builder.buidCheese();
		return builder.getSandwich();
	}
}
