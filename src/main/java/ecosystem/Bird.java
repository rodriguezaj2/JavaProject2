package ecosystem;

abstract class Bird extends Animal{

    public void eat(){
        System.out.println("This bird is eating food suitable for its diet"); // not necessary could have made abstract
    }

    public abstract void makeSound();

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void bird(){
        System.out.println(name+" is a bird");
    }

}

class Parrot extends Bird{

    Parrot(String animal,String name, int age, String color){
        this.animal=animal;
        this.name=name;
        this.age=age;
        this.color=color;
    }

    public void eat(){
        System.out.println(name+" eats seeds, nuts, fruits, vegetables, also insects");
    }

    public void makeSound(){
        System.out.println(name+" sings, talks, and whistles");
    }



}

class Eagle extends Bird {

    Eagle(String animal, String name, int age, String color) {
        this.animal = animal;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void eat() {
        System.out.println(name + " eats meat, small mammals, fish, birds, reptiles");
    }


    public void makeSound() {
        System.out.println(name + " screeches");
    }

}