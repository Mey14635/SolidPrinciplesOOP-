public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 82);

        studentRepository repository = new studentRepository();
        repository.save(student);

        StudentReportGenerator reportGenerator = new StudentReportGenerator();
        reportGenerator.generateReport(student);
    }
}
