class Student6{   //Grand-Parent
    public String name;
    public int id;

    public Student6(String name, int id){
        this.name = name;
        this.id = id;
    }
    public  void showDetails(){
        System.out.println(name + " " + id);
    }
}
class sweStudent1 extends Student6{   //Parent
    public int numOfLabs;
    public sweStudent1(String name, int id, int numOfLabs){
        super(name, id);
        this.numOfLabs = numOfLabs;
    }
    public void cry(){
        System.out.println(name + " is crying because of " + numOfLabs + " labs.");
    }
}
class sweFresher extends sweStudent1{    //Children
    public sweFresher(String name, int id, int numOfLabs){
        super(name, id, numOfLabs);
    }
    public void enroll_OOP(){
        System.out.println(name + " enrolled in OOP.");
    }
}

public class MultiLevel_Inheritance {
    static void main(String[] args) {
        sweStudent1 swe = new sweStudent1("Mohammad", 242, 4);
        sweFresher swe1 = new sweFresher("Masrafi", 369, 2);
        swe1.showDetails();
        swe1.cry();
        swe1.enroll_OOP();
    }
}
