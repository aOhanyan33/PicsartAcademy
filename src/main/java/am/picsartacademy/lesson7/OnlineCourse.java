package am.picsartacademy.lesson7;

public class OnlineCourse extends Course {
    private String platform;

    public OnlineCourse(String courseName, String instructor, String platform) {
        super(courseName, instructor);
        this.platform = platform;
    }

    @Override
    public void startTraining() {
        System.out.println("Starting online course '" + courseName + "' on platform: " + platform);
    }

    @Override
    public void endTraining() {
        System.out.println("Ending online course '" + courseName + "'");
    }
}
