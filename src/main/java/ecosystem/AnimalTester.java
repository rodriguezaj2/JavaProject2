package ecosystem;

public class AnimalTester {
    public static void main(String[] args) {
        Lion lion1= new Lion("Lion","Lenox The Lion",8,"Beige");
        lion1.displayInformation();
        lion1.eat();
        lion1.sleep();
        lion1.makeSound();
        lion1.mammal();

        System.out.println();


        Elephant elephant1=new Elephant("Elephant","Dumbo",12,"Gray");
        elephant1.displayInformation();
        elephant1.eat();
        elephant1.sleep();
        elephant1.makeSound();
        elephant1.mammal();

        System.out.println();

        Parrot parrot1=new Parrot("Parrot","Potty The Parrot",5,"Green");
        parrot1.displayInformation();
        parrot1.eat();
        parrot1.sleep();
        parrot1.makeSound();
        parrot1.bird();

        System.out.println();

        Eagle eagle1=new Eagle("Eagle","Larry The Eagle",4,"Dark Brown and White");
        eagle1.displayInformation();
        eagle1.eat();
        eagle1.sleep();
        eagle1.makeSound();
        eagle1.bird();


    }
}
