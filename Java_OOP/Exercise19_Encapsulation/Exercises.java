package Java_OOP.Exercise19_Encapsulation;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!
        Student student = new Student("Alexander",'F',27,"USA","German");
        System.out.println
                ("Name: " + student.getName() + "\nSex: " + student.getSex() +"\nAge: " + student.getAge() +
                 "\nPlace of birth: " + student.getPlaceOfBirth() + "\nNationality: " + student.getNationality() );
           /*System.out.println("Name: " + student.getName());
             System.out.println("Sex: " + student.getSex());
             System.out.println("Age: " + student.getAge());
             System.out.println("Place of birth: " + student.getPlaceOfBirth());
             System.out.println("Nationality: " + student.getNationality());*/
        System.out.println();
        student.setName("Lorenzo");
        student.setSex('M');
        student.setAge(22);
        student.setPlaceOfBirth("Germany");
        student.setNationality("Italy");
        System.out.println
                ("Name: " + student.getName() + "\nSex: " + student.getSex() +"\nAge: " + student.getAge() +
                 "\nPlace of birth: " + student.getPlaceOfBirth() + "\nNationality: " + student.getNationality() );
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        Student student = new Student("Sara", 'F', 19,"England" , "Britannic");
        System.out.println
                ("Name: " + student.getName() + "\nSex: " + student.getSex() +"\nAge: " + student.getAge() +
                        "\nPlace of birth: " + student.getPlaceOfBirth() + "\nNationality: " + student.getNationality() );
        student.setName("Pippo");
        student.setSex('M');
        student.setAge(30);
        student.setPlaceOfBirth("New York");
        student.setNationality("American");
        System.out.println();
        System.out.println(student);
        //Write your code here
    }

}