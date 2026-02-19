// Runtime polymorphism: Method overriding where the method is decided at runtime using dynamic method dispatch.
class Animal4{
    public void makeSound(){
        System.out.println("Animal sound");
    }
}
class Dog3 extends Animal4{
    public void makeSound(){
        System.out.println("Dog sound: woof woof!");
    }
    public void bark(){
        System.out.println("Dog is barking.");
    }
}
class Cat1 extends Animal4{
    public void makeSound(){
        System.out.println("Cat sound: Meow Meow!");
    }
}

public class RunTime_Polymorphism {
    static void displayInfo(Animal4 a){
        // Compile time: Compiler checks method using reference type (Animal4) → makeSound() exists.
        // Run time: JVM calls overridden version based on actual object (Dog3/Cat1) → Dynamic Method Dispatch.
        a.makeSound();
        //a.bark();   //compile time error -> Cannot resolve method 'bark' in 'Animal4'
    }

    static void main() {
        Animal4 a1 = new Animal4();
        Dog3 d1 = new Dog3();
        Cat1 c1 = new Cat1();
        a1.makeSound();
        d1.makeSound();
        c1.makeSound();

        int x = 10;
        double y = (double)x;
        double z = x; //implicit typecasting
        System.out.println("y: " + y);
        System.out.println("z: " + z);

        //reference_type var = new Object()
        Animal4 a2 = new Dog3(); // implicit upcasting
        a2.makeSound(); //Dog sound -> runtime polymorphism

        Cat1 c2 = new Cat1();
        Animal4 a3 = (Animal4)c2;
        a3.makeSound(); //Cat sound -> runtime polymorphism

        displayInfo(d1);
        displayInfo(c1);
    }
}

/*
    Compile time polymorphism -> Static Binding
                                Method Overloading
    Run time polymorphism ->  Dynamic Binding
                              Method Overloading
 */