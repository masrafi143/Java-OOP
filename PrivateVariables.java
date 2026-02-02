import AccessModifiers.*;
public class PrivateVariables {
    static void main(String[] args) {
        UniversityStudent s1 = new UniversityStudent("Masrafi", 369);
        s1.updateAge(-55);  //invalid id so, wont update
        s1.updateAge(21);  //age updated to 21
    }
}