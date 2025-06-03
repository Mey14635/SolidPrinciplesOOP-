public class StudentReportGenerator {
    public void generateReport(Student student) {
        System.out.println("---- Student Report ----");
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Status: " + (student.hasPassed() ? "Passed" : "Failed"));
    }
}
