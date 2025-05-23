package am.picsartacademy.lesson7;

public class Main {
    public static void main(String[] args) {
        TrainingCenter center = new TrainingCenter("Training Hub");

        Teachable onlineJava = new OnlineCourse("Java Basics", "Alice", "Zoom");
        Teachable offlinePython = new OfflineCourse("Python Advanced", "Ben", "Room 204");

        center.addCourse(onlineJava);
        center.addCourse(offlinePython);

        center.startAllCourses();
        center.endAllCourses();
    }
}
