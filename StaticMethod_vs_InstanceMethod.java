class Student3{
    public String name;
    public int id;
    private static String uniName = "DIU";

    public Student3(String name, int id){
        this.name = name;
        this.id = id;
    }

    public static void m1(){
        System.out.println("static m1 method was called.");
    }

    public static void updateUniName(String uName){
        uniName = uName;
        m1();
    }

    public void showDetails(){
        System.out.println("Name: " + name + ", id: " + id);
        System.out.println("Uni name: " + uniName);
    }
}

public class StaticMethod_vs_InstanceMethod {
    static void main(String[] args) {
        Student3 s1 = new Student3("Mohammad", 242);
        Student3 s2 = new Student3("Masrafi", 369);
        s1.showDetails();
        s2.showDetails();
        Student3.updateUniName("Daffodil International University");  //m1 method called
        s1.showDetails();
        s2.showDetails();
    }
}

/*
* ------Static method vs Instance method----
*
* --> Instance method can access instance variable, static variable,
*     it can also invoke instance method, static method
*
* --> Static method can access static variable, and invoke static method.
*     But it cannot access instance variable, invoke instance method.
* */
