class Animal{
    public String name;

    public Animal(){
        System.out.println("No parameter Animal constructor.");
    }
    public Animal(String name){
        this.name = name;
        System.out.println("1 parameter Animal constructor.");
    }
    public void eat(){
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal{
    public String color;

    public Dog(String name, String color){
        super(name); //Calls the parent class constructor to initialize the 'name' variable
        this.color = color;
    }
    public void bark(){
        System.out.println(color + " " + name + " is barking.");
    }
}

public class Single_Inheritance {
    static void main(String[] args) {
        Animal a1 = new Animal("Cat");
        Dog d1 = new Dog("Tommy", "Brown");
        d1.eat();
        d1.bark();
    }
}
