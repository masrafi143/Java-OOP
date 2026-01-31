//class, objects, methods
public class Student {
    public String name;  //instance variable
    public String id;

    //methods
    public void printHello(){
        System.out.println("Hello world");
    }
    public void printStudent(String name, String id){ //local variable
        this.name = name;
        System.out.println("Hello, This is " + name + ". id: " + id);
    }
    static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "Mohammad";
        s1.id = "242";
        s2.name = "Masrafi";
        s2.id = "369";

        System.out.println(s1.name);
        System.out.println(s1);
        System.out.println(s2.name);
        System.out.println(s2);

        s3 = s2;
        System.out.println("s3:");
        System.out.println(s3.name);
        System.out.println(s3); //same address as s2

        s3.id = "242-35-369";
        // s2 & s3 pointing to same address, so changing s3 or s2 are same.
        System.out.println(s2.id);

        //calling methods
        System.out.println("=====calling methods=====");
        s1.printHello();
        s2.printStudent(s2.name, s2.id);
    }
}

