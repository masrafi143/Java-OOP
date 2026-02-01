public class ReferencePassing {
    String name;
    int id;

    public ReferencePassing(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void showDetails(){
        System.out.println("Name: " + name + " id: " + id);
    }

    public void makeCall(ReferencePassing obj){
        System.out.println("I'm " + name);
        System.out.println("Hey, " + obj.name);
    }

    static void main(String[] args) {
        ReferencePassing s1 = new ReferencePassing("Mohammad", 242);
        ReferencePassing s2 = new ReferencePassing("Masrafi", 369);

        s1.showDetails();
        s1.makeCall(s2);

    }
}
