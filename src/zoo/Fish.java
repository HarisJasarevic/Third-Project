package zoo;

public class Fish extends Animal{

    public Fish(String animalSpecies, int age, String gender, double weight) {
        super(animalSpecies, age, gender, weight);
    }

    @Override
    void move() {
        System.out.println("Fish is moveing around...");
    }

    public void swim(){
        System.out.println("Swimming...");
    }


}
