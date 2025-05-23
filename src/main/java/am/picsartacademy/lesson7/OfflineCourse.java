package am.picsartacademy.lesson7;

public class OfflineCourse extends Course {
    private String roomNumber;

    public OfflineCourse(String courseName, String instructor, String roomNumber) {
        super(courseName, instructor);
        this.roomNumber = roomNumber;
    }

    @Override
    public void startTraining() {
        System.out.println("Starting onsite course '" + courseName + "' in room: " + roomNumber);
    }

    @Override
    public void endTraining() {
        System.out.println("Ending onsite course '" + courseName + "'");
    }
}
