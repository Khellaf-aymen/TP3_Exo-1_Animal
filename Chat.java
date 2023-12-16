
public class Chat extends Animal implements Pet , MakeSound{
private String couleur ;
	
	public Chat(String name, boolean vegetarian, int age, String couleur,double weight ) {
	super(name, vegetarian, age, weight );
	this.couleur = couleur;
}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
@Override
public String toString() {
return "";
}
@Override
public void diagnostique() {


if (getWeight()>8) {
		System.out.println("the cat is overweith ");
		}

if (this.getAge() >10 ) {
   System.out.println("the cat is old ");
}

}
@Override
public void CanBePet() {
	System.out.println("Yes can be a Good Cat");
}
@Override
public int LifeSpan(int wild_age) {
	return (int)(wild_age+0.4*wild_age);
}
@Override
public void Cri() {
System.out.println("it sound : meow");

	}




	
}


		
	
	
	

