class A{
    public static int x = 10;
    public int y = 15;
}
class B extends A{
    public static int x = 20;
    public int y = 25;

    public void method1(){
        System.out.println("---method1---");
        int y=45;
        System.out.println(y); //local -> own instance -> parent instance
        System.out.println(this.y); //own instance -> parent instance
        System.out.println(super.y); //parent instance
    }
    public void method2(){
        System.out.println("---method2---");
        int x = 45;
        System.out.println(x); //local -> own instance/static -> parent instance/static
        System.out.println(this.x); //own instance/static -> parent instance/static
        System.out.println(super.x); //parent instance/static
        System.out.println(B.x); //own static -> parent static
        System.out.println(A.x); //parent static
    }
    public void method3(){
        System.out.println("---method3---");
        System.out.println(x); //20
        System.out.println(this.x); //20
    }
}
class C extends B{
    public int x = 35;
    public void method4(){
        System.out.println("---method4---");
        System.out.println(x); //35
        System.out.println(this.x); //35
        System.out.println(super.x); //20
    }
}

public class Local_vs_This_vs_Super_Inheritance {
    static void main(String[] args) {
        B b1 = new B();
        b1.method1();
        b1.method2();

        C c1 = new C();
        c1.method3();
        c1.method4();
    }
}
