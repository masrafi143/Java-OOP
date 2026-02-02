package AccessModifiers;

public class AccessModifier {
    static void main(String[] args) {
        UniversityStudent s1 = new UniversityStudent("Mohammad Masrafi", 369);
        //same package->
//        System.out.println(s1.name);  //public -> yes
//        System.out.println(s1.id);  //default -> yes
//        System.out.println(s1.age);  //private -> no
//        System.out.println(s1.cgpa);  //protected -> yes
    }




}

