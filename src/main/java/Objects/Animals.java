package Objects;

public class Animals {

    //Attributes
    String animalName;
    int size;
    int age;
    String gender;
    String diet;
    float topSpeed;

    // Constructor
    public Animal(String myName, String myDiet, String myGender, int mySize, float myTopSpeed){
        this.animalName = myName;
        this.diet = myDiet;
        this.gender = myGender;
        this.age= 0;
        this.size = mySize;
        this.topSpeed = myTopSpeed;
    }

    // Methods
    /*
    Speak
    Eat
    Shit
    Drink
    Sleep
     */

    public String animalsSpeak(){
        return "The animal has spoken";
    }

    public void animalEat(){
        this.size +=3;
        this.topSpeed -=2;
    }

    public void animalShit(){
        this.size -= 2;
        this.topSpeed += 2;
    }

    public void animalDrink(){
        this.size++;
    }

    public String animalSleep(){
        return "zzzzzzzzzzz";
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String  getAnimalName(){
        return animalName;
    }
    public void setAnimalName(String animalName){
        this.animalName = animalName;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getDiet(){
        return diet;
    }

    public void setDiet(String diet){
        this.diet = diet;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public float getTopSpeed(){
        return topSpeed;
    }

    public void setTopSpeed (float topSpeed){
        this.topSpeed = topSpeed;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getAnimalInfo(){
        String animalInfo = "Animal Name: " + this.animalName + "\nAnimal Diet " + this.diet + "\nAnimal Gender: " + this.gender;

        return animalInfo;
    }

}