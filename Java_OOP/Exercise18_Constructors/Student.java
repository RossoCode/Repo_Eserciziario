package Java_OOP.Exercise18_Constructors;

public class Student {
    String name;
    int age;
     Student(String name, int age) {
              System.out.println();
         System.out.println("Constructing!");
            this.name = name;
            this.age = age;
              System.out.println("the name is "+ name + " and the age is " + age);
         System.out.println("Constructed!");
              System.out.println();
    }
     Student(String name) {
        System.out.println();
        System.out.println("Constructing!");
        this.name = name;
        System.out.println("the name is "+ name );
        System.out.println("Constructed!");
        System.out.println();
    }
     Student(int age) {
        System.out.println();
        System.out.println("Constructing!");
        this.age = age;
        System.out.println("the age is " + age);
        System.out.println("Constructed!");
        System.out.println();
    }
     Student() {
        System.out.println();
        System.out.println("Constructing!");
        System.out.println("Constructed!");
        System.out.println();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

