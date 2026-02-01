public class ReturnFromMethods {
    public int add(int a, int b){
        return a+b;
    }

    static void main(String[] args) {
        ReturnFromMethods c1 = new ReturnFromMethods();
        System.out.println(c1.add(5,5));
    }
}
