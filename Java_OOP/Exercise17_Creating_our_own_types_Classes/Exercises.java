package Java_OOP.Exercise17_Creating_our_own_types_Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        exercise2();
        exercise3();
    }

    /**
     * 1: Create a new Class in this package
     *
     *    Call this class Course
     *
     *    Inside add the following variables, using an appropriate type.
     *    courseName, maxStudents, qualityRatingOutOf10
     *
     *    On top of this choose 2 variables of your choice!
     */

    /**
     * 2: use the class called Student, add variables
     * (class variables are called 'fields' or 'attributes')
     * called 'name' and 'age'
     * <p>
     * Using the function below set the student name and ages
     */
    private static void exercise2() {
        System.out.println("Exercise 2:");
        List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);
        // Use a for i loop
        for (int i = 0; i < studentNames.size(); i++) {
            Student student = createNewStudent(studentNames.get(i), studentAges.get(i));
            System.out.println(student);
        }

    }

    private static Student createNewStudent(String name, Integer age) {
        Student student = new Student();
        // Write your code here
        student.name = name;
        student.age = age;
        //System.out.println(student.name + " have " + student.age + " years old");
        return student;
    }

    /**
     * 3: Finally lets edit our .Course class once more,
     * <p>
     * This time we are going to add another internal variable (field or attribute) called
     * students. It's going to be a List<Student> called students
     * <p>
     * Copy the code above and add the students from exercise 2
     * <p>
     * Bonus: Using an appropriate loop of your choice find the average age of our students.
     * <p>
     * Hint: use a double to stop automatic integer rounding
     */

    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Write your code here
        double media = 0;
        Course course = new Course();
        course.courseName = "Filosofia";
        course.maxStudents = 19;
        course.qualityRatingOutOf10 = 8.2f;
        course.courseMonthDuration = 24;
        course.courseDailyHours = 5;
        System.out.println("the name of course is " + course.courseName +
                           "\nthe numbers of maxStudents is " + course.maxStudents +
                           "\nThe rating of the course is " + course.qualityRatingOutOf10 +
                           "\nthe course duration is " + course.courseMonthDuration + " Month" +
                           "\nthe daily hours are " + course.courseDailyHours);
        System.out.println();
        System.out.println("Students List");
        List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);
        List<Student> students = Arrays.asList();
        students.add(studentNames);
        students.add(studentAges);
        for (int i = 0; i < studentNames.size(); i++) {
            Student students = createNewStudent(studentNames.get(i), studentAges.get(i));
            System.out.println(students);
//            System.out.println("name's course student is " + studentNames.get(i)
//                             + " and is age is " + studentAges.get(i));
        }
        for (int i = 0; i < studentAges.size(); i++) {
            media = media + studentAges.get(i);
        }
        media = media / studentAges.size();
        System.out.println("the media age of all student is " + media);

    }


    }

