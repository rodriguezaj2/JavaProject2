package ecosystem;

public interface AnimalBehaviors {

    void eat();
    void sleep();
    void makeSound();
}

 abstract class Animal implements AnimalBehaviors {

    String animal;
    String name;
    int age;
    String color;

    void displayInformation(){
        System.out.println("Animal: "+animal+" Name: "+name+" Age: "+age+ " Color: "+color);

    }
}

