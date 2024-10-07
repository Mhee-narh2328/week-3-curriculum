package classActivity1A;

public class Main {
    public static void main(String[] args) {
        InternshipForm obj1 = new InternshipForm("john doe", 21, "Male");
        InternshipForm obj2 = new InternshipForm("jane doe", 18, "Female");

        System.out.println("Name: " + obj1.getName());
        System.out.println("Age: " + obj1.getAge());
        System.out.println("Gender: " + obj1.getGender());

        System.out.println("*********obj2*******");

        System.out.println("Name: " + obj2.getName());
        System.out.println("Age: " + obj2.getAge());
        System.out.println("Gender: " + obj2.getGender());
    }
}
