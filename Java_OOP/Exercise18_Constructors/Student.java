package Java_OOP.Exercise18_Constructors;

public class Student {
    String name;
    int age;
    void dataStudent(String n, int a) {
    System.out.println("Constructing!");
        name = n;
        System.out.println(n);
        age = a;
        System.out.println(a);
    System.out.println("Constructed!");
    }
}

