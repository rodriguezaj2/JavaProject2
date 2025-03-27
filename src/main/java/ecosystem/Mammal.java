package ecosystem;

 abstract class Mammal extends Animal{

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void mammal(){
        System.out.println(name+" is a mammal");
    }



}

 class Lion extends Mammal{

    Lion(String animal,String name, int age, String color){
        this.animal=animal;
        this.name=name;
        this.age=age;
        this.color=color;
    }

    public void eat(){
        System.out.println(name+" eats Zebras");
    }

    public void makeSound(){
        System.out.println(name+" roars");
    }



}

 class Elephant extends Mammal{

    Elephant(String animal, String name, int age, String color){
        this.animal=animal;
        this.name=name;
        this.age=age;
        this.color=color;
    }

    public void eat(){
        System.out.println(name+" eats plants");
    }


     public void makeSound(){
        System.out.println(name+" rumbles and sounds like a trumpet");
    }



}