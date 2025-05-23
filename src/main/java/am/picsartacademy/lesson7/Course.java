package am.picsartacademy.lesson7;

public abstract class Course implements Teachable {
    protected String courseName;
    protected String instructor;

    public Course(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }

    @Override
    public void startTraining() {
        System.out.println("Starting course: " + courseName);
    }

    @Override
    public void endTraining() {
        System.out.println("Ending course: " + courseName);
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }
}

