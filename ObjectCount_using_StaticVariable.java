class Student2 {
    public String name;
    public int id;
    public static int count = 0; //static variable to count object

    public Student2(String name, int id){
        this.name = name;
        this.id = id;
        count ++;
    }

    public void showDetails(){
        System.out.println(name + ", id: " + id);
    }
}

public class ObjectCount_using_StaticVariable {
    static void main(String[] args) {

        System.out.println("Total student: " + Student2.count);

        Student2 s1 = new Student2("Mohammad", 242);
        Student2 s2 = new Student2("Masrafi", 369);
        s1.showDetails();
        s2.showDetails();

        System.out.println("Total student: " + Student2.count);
    }
}
