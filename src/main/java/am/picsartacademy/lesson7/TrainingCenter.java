package am.picsartacademy.lesson7;

import java.util.ArrayList;
import java.util.List;

public class TrainingCenter {
    private String name;
    private List<Teachable> courses;

    public TrainingCenter(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Teachable course) {
        courses.add(course);
        System.out.println("Course added to " + name);
    }

    public void startAllCourses() {
        System.out.println("Starting all courses at " + name);
        for (Teachable course : courses) {
            course.startTraining();
        }
    }

    public void endAllCourses() {
        System.out.println("Ending all courses at " + name);
        for (Teachable course : courses) {
            course.endTraining();
        }
    }

}
