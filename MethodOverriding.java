class Animal1{
    public String name;
    public Animal1(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println(name + " is eating bread.");
    }
}
class Dog1 extends Animal1{
    public String color;
    public Dog1(String name, String color){
        super(name);
        this.color = color;
    }
    public void eat(){
        super.eat(); //calls parent method
        System.out.println(name + " is eating meat."); //method overriding
    }
    public void bark(){
        System.out.println(color + " " + name + " is barking.");
    }
}

public class MethodOverriding {
    static void main(String[] args) {
        Dog1 d1 = new Dog1("Rover", "Brown");
        d1.bark();
        d1.eat();
    }
}
