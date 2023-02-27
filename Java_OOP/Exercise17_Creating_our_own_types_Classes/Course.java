package Java_OOP.Exercise17_Creating_our_own_types_Classes;

import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseName;
    int maxStudents;
    float qualityRatingOutOf10;
    int courseMonthDuration;
    int courseDailyHours;
    List<Student> students = new ArrayList<>();

    public Course(String name) {
        this.courseName = name;
    }
}
