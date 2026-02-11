class Student4{
    public String name;
    public int id;

    public void doClass(){
        System.out.println(name + " is doing theory class.");
    }
    public void showDetail(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class cseStudent extends Student4{ //inheritance
    public cseStudent(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void doLab(){
        System.out.println(name + " is doing lab class.");
    }
}

public class Inheritance {
    static void main(String[] args) {
        cseStudent s1 = new cseStudent("Mohammad", 242);
        s1.doClass();
        s1.doLab();
    }
}
