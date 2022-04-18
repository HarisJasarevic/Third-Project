package zoo;

public class Eagle extends Bird{


    public Eagle(String animalSpecies, int age, String gender, double weight) {
        super(animalSpecies, age, gender, weight);
    }

    @Override
    public void fly() {

    }

    void ispis(){
        System.out.println("Orao...");
    }

}


