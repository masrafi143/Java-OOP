public class MethodOverloading {
    public int add(int a, int b){
        System.out.println("int int add");
        return a+b;
    }
    public double add(double a, double b, int c){
        System.out.println("double, int add");
        return a+b+c;
    }
    public String add(String a, String b){
        System.out.println("String String concat");
        return a+b;
    }

    static void main(String[] args) {
        MethodOverloading m1 = new MethodOverloading();
        System.out.println(m1.add(1,2));
        System.out.println(m1.add(1.5,2.5, 3));
        System.out.println(m1.add("Mohammad ", "Masrafi"));
    }
}
