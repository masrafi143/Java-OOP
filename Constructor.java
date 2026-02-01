public class Constructor {
    String name;
    int id;
    public Constructor(){
        System.out.println("Constructor was called");
    }
    public Constructor(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void printDetails(String name, int id){
        System.out.println(this.name);
        System.out.println(this.id);
    }

    static void main(String[] args) {
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor("Masrafi", 369);
        c2.printDetails(c2.name, c2.id);
    }
}
