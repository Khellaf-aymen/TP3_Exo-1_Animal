
public abstract class Animal {
	private String name ;
	private boolean vegetarian;
	private int age ; 
		private double weight ; 
public Animal (String name , boolean vegetarian, int age, double weight ) {
	this.name=name;
	this.vegetarian=vegetarian;
	this.age = age ;
	this.weight = weight ; 
}


@Override
public String toString() {
return "---Animal info---\n"+
"\nname :"+name+
"\nage  : "+age+
"\nweight : "+weight+
"\nis animal vegetarian :"+vegetarian;
}
	
	public String getNom() {
		return name;
	}

	public void setNom(String name) {
		this.name = name;
	}

	public boolean isVegetarien() {
		return vegetarian;
	}

	public void setVegetarien(boolean vegetarien) {
		this.vegetarian = vegetarian;
	}


	
	
   public void setAge(int age) {
		this.age = age;
	}

public int getAge() {
	return age;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public boolean isVegetarian() {
	return vegetarian;
}

public void setVegetarian(boolean vegetarian) {
	this.vegetarian = vegetarian;
}

public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = weight;
}

abstract public void diagnostique () ;
 


    }



















