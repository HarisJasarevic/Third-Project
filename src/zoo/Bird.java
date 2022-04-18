package zoo;

public class Bird extends Animal implements Flyable{

    public Bird(String animalSpecies, int age, String gender, double weight) {
        super(animalSpecies, age, gender, weight);
    }

    @Override
    void move() {
        System.out.println("Flapping wings...");

    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}
