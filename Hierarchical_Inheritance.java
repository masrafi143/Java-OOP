class Student5{
    public String name;
    public int id;

    public Student5(String name, int id){
        this.name = name;
        this.id = id;
    }
    public  void showDetails(){
        System.out.println(name + " " + id);
    }
}
class sweStudent extends Student5{
    public int numOfLabs;
    public sweStudent(String name, int id, int numOfLabs){
        super(name, id);
        this.numOfLabs = numOfLabs;
    }
    public void cry(){
        System.out.println(name + " is crying because of " + numOfLabs + " labs.");
    }
}

class bbaStudent extends Student5{
    public bbaStudent(String name, int id){
        super(name, id);
    }
    public void party(){
        System.out.println(name + " is doing All day party.");
    }
}

public class Hierarchical_Inheritance {
    static void main(String[] args) {
        sweStudent swe = new sweStudent("Mohamad Masrafi", 369, 3);
        swe.showDetails();
        swe.cry();
        bbaStudent bba = new bbaStudent("Masrafi", 242);
        bba.showDetails();
        bba.party();
    }
}
