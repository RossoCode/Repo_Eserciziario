package Java_OOP.Exercise17_Creating_our_own_types_Classes;

public class Student {
    String name;
    int age;

    /**
     * Student(String name, int age) {
        this.name = name;
        this.age = age;
    } */
    @Override
    public String toString() {
        return "Student{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }
}
