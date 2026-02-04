class Student1 {
    public String name;
    private int id;

    public Student1(String name, int id){
        this.name = name;
        this.id = id;
    }
    private double calculateCGPA(){
        double cgpa = 4.0;
        return cgpa;
    }
    public void showDetails(){
        System.out.println(name);
        System.out.println("id: " + id);
        System.out.println("cgpa: " + calculateCGPA());
    }
}

public class PrivateMethods {
    static void main(String[] args) {
        Student1 s1 = new Student1("Masrafi", 369);
        s1.showDetails();
    }
}
