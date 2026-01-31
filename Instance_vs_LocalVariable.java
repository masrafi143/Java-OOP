public class Instance_vs_LocalVariable {
    String name;
    int id;

    Instance_vs_LocalVariable(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void printDetails(String name, int id){
        name = "local";
        System.out.println(name); //local
        System.out.println(this.name); //instance
        System.out.println(this); //address of the object
    }

    static void main(String[] args) {
        Instance_vs_LocalVariable a = new Instance_vs_LocalVariable("instance", 369);
        a.printDetails(a.name, a.id);
        System.out.println(a);
    }
}
