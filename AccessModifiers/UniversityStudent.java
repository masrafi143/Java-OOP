package AccessModifiers;

public class UniversityStudent {
    public String name;
    int id;
    private int age;
    protected double cgpa;

    public UniversityStudent(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void updateAge(int age){
        if(age>0){
            this.age = age;
            System.out.println(this.age);
        } else {
            System.out.println("Invalid id given.");
        }
    }
}
