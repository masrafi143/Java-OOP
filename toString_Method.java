class Animal2{
    public String name;
    public Animal2(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println(name + " is eating.");
    }

    /*
    public String toString(){
        return "This is an Animal Class.";
    }
     */
}
class Dog2 extends Animal2{
    public String color;
    public Dog2(String name, String color){
        super(name);
        this.color = color;
    }
    public void bark(){
        System.out.println(color + " " + name + " is barking.");
    }
    public String toString(){
        return "This is a Dog Class.";
    }
}
class Cat extends Animal2{
    public Cat(String name){
        super(name);
    }
    public void poke(){
        System.out.println(name + " is smiling.");
    }
    public String toString(){
        return "This is a Cat Class.";
    }
}

public class toString_Method {
    static void main(String[] args) {
        Animal2 a1 = new Animal2("Animal");
        Dog2 d1 = new Dog2("Rover", "Brown");
        Cat c1 = new Cat("Tom");
        System.out.println(d1.toString());
        System.out.println(c1.toString());
        System.out.println(d1);
        System.out.println(a1); //memory location
    }
}

// toString() returns a string representation of an object.
// Here, Dog2 and Cat override toString() to return custom messages instead of the default memory address.
