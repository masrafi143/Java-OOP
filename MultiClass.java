import java.util.Arrays;
class Students {
    String name;
    int id;
    public Courses [] course = new Courses[5];
    int courseCount = 0;

    public Students(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void addCourse(Courses c){
        course[courseCount] = c;
        courseCount += 1;
    }
    public void showDetails(){
        System.out.println("Name: " + name + ", Id: " + id);
        System.out.println("Courses taken: ");
        for(int i=0; i<courseCount; i++){
            System.out.println(course[i].code);
            System.out.println(course[i].title);
        }
    }
}
class Courses{
    String code;
    String title;

    public Courses(String code, String title){
        this.code = code;
        this.title = title;
    }

}

public class MultiClass {
    static void main(String[] args) {
        Students s1 = new Students("Mohammad Masrafi", 369);
        Courses c1 = new Courses("SE-216", "OOP");
        Courses c2 = new Courses("SE-214", "Algorithm");

        s1.addCourse(c1);
        s1.addCourse(c2);
        s1.showDetails();
    }
}
