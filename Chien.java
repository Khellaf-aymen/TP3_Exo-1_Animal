public class Chien extends Animal implements Pet , MakeSound {

    public Chien(String name, boolean vegetarian, int age, double weight) {
        super(name, vegetarian, age, weight);
     
    }

    @Override
    public void diagnostique() {
        if (this.getWeight()>20) {
            System.out.println("the dog is overweith ");
            }
    
    if (this.getAge() >10 ) {
       System.out.println("the dog is too old ");
    }


    }

    @Override
    public void CanBePet() {
    System.out.println("can be a good Dog ");
    }

    @Override
    public int LifeSpan(int wild_age) {
        return (int)(wild_age+0.4*wild_age);
    }

    @Override
    public void Cri() {
        System.out.println("it sound : bark");
    }

   
    
}
