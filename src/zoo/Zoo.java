package zoo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Zoo {

    public static void main(String[] args) {

        Bird bird = new Bird("Hawk", 10, "F", 15);
        Eagle eagle = new Eagle("Eagle", 5, "M", 25);
        Bird bigEagle = new Eagle("Big_Eagle", 10, "M", 40);

        Hawk hawk = new Hawk("Hawk 2", 10, "F", 40);

        Fish fish = new Fish("Fish", 5, "M", 15);

        Animal tiger = new Tiger("Tiger", 10, "F", 50);

        Flyable flyable = new Hawk("Flying_bird", 10, "F", 50);
        flyable.fly();


        Animal [] animals = {eagle, fish, tiger, bird};

        //System.out.println(animals[1]);
        System.out.println(Arrays.toString(animals));

        moveAnimals(eagle);
        moveAnimals(fish);
        moveAnimals(tiger);

    }

    public static void moveAnimals(Animal animal){
        animal.move();
    }


}//end class
