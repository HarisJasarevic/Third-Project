package zoo;

public abstract class Animal { //ova klasa postaje abstraktna klasa

    protected String animalSpecies;
    protected int age;
    protected String gender;
    protected double weight;

    public Animal(String animalSpecies, int age, String gender, double weight) {
        this.animalSpecies = animalSpecies;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Eating...");
    }

    public void sleep(){
        System.out.println("Sleeping...");
    }



    abstract void move();

    @Override
    public String toString() {
        return "Animal{" +
                "animalSpecies='" + animalSpecies + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                '}';
    }
}
