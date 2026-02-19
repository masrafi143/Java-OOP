// Compile-time polymorphism: Method overloading where the method is decided at compile time.

class Animal3{
    public void eat(){
        System.out.println("Animal is eating.");
    }
    public void eat(int time){
        System.out.println("Animal is eating " + time + " times.");
    }
    public void eat(String food){
        System.out.println("Animal is eating " + food);
    }
}

public class CompileTime_Polymorphism {
    static void main(String[] args) {
        Animal3 a1 = new Animal3();
        a1.eat();
        a1.eat(3);
        a1.eat("bread");
    }
}

/*
    Compile time polymorphism -> Static Binding
                                Method Overloading
    Run time polymorphism ->  Dynamic Binding
                              Method Overloading
 */
