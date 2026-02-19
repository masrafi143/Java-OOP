class Animal5{
    public void makeSound(){
        System.out.println("Animal sound");
    }
}
class Dog4 extends Animal5{
    public void makeSound(){
        System.out.println("Dog sound: woof woof!");
    }
    public void bark(){
        System.out.println("Dog is barking.");
    }
}
class Cat2 extends Animal5{
    public void makeSound(){
        System.out.println("Cat sound: Meow Meow!");
    }
}

public class Upcasting_Downcasting_instanceOf {
    static void displayInfo(Animal5 a){   // a → already upcasted reference (Dog4/Cat2 → Animal5)
        Dog4 d = (Dog4)a;  // Downcasting (Animal5 → Dog4) → Explicit cast required
        d.makeSound();
        d.bark(); // Runtime error if actual object is Cat2 (ClassCastException)
    }
    static void displayInfo1(Animal5 a){
        if(a instanceof Dog4){  // Runtime type checking before downcasting
            Dog4 d = (Dog4)a;  // Safe Downcasting (Animal5 → Dog4)
            d.makeSound();
            d.bark();
        } else{
            a.makeSound();
        }
    }

    static void main() {
        Animal5 a1 = new Animal5();
        Dog4 d1 = new Dog4();
        Cat2 c1 = new Cat2();

        displayInfo(d1);
        //displayInfo(c1); // Runtime Error: ClassCastException ->
                        // Because c1 is Cat2 object, but inside method we forcefully cast it to Dog4.

        displayInfo1(d1);
        displayInfo1(c1);

        System.out.println(d1 instanceof Dog4); //true
        System.out.println(d1 instanceof Animal5); //true
        System.out.println(a1 instanceof Animal5); //true
        System.out.println(a1 instanceof Cat2); //false
    }
}

// Upcasting: Converting child object reference to parent type (Child → Parent), implicit and safe.
// Downcasting: Converting parent reference back to child type (Parent → Child), explicit and may cause runtime error.