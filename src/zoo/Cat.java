package zoo;

public class Cat extends Animal{

    public Cat(String animalSpecies, int age, String gender, double weight) {
        super(animalSpecies, age, gender, weight);
    }

    @Override
    void move() {
        System.out.println("Waving tail... ");
    }


}

