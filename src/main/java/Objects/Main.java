package Objects;

public class Main {

    Animal horse= new Animal("Lance", "Herbivore","Male",30, 20);
    System.out.println("Size of horse before eating: "+horse.getSize());
    horse.animalEat();
    System.out.println("Size of horse after eating: "+horse.getSize());
    horse.animalShit();
    System.out.println("Size of horse after shitting: "+horse.getSize());
    System.out.println(horse.getAnimalInfo());

    }
