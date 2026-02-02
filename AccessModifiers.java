import AccessModifiers.*;
public class AccessModifiers {
    static void main(String[] args) {
        UniversityStudent s1 = new UniversityStudent("Mohammad Masrafi", 369);
        //different package->
//        System.out.println(s1.name);  //public -> yes
//        System.out.println(s1.id);  //default -> no
//        System.out.println(s1.age);  //private -> no
//        System.out.println(s1.cgpa);  //protected -> no
    }


}
