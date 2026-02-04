class ABC{
    public int t;  //instance
    public static int x=4; //instance

    public ABC(int val){
        t = val;
    }
    public void method1(){
        int t = 10;  //local
        int x = 20;  //local
        System.out.println("local t: " + t); //local
        System.out.println("local x: " + x);  //local
        System.out.println("instance t: " + this.t);  //instance
        System.out.println("static x: " + ABC.x);  //static
    }
}

public class local_instance_static_variable {
    static void main(String[] args) {
        ABC a1 = new ABC(50);
        ABC a2 = new ABC(100);
        a1.method1();
        System.out.println("====");
        a2.method1();
    }
}
