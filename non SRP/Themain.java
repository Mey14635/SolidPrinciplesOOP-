public class Themain{
    public static void main(String[] args) {
        student student = new student("Victor", 82);
        student.saveToDatabase();   // Not the responsibility of a student object
        student.generateReport();   // Not the responsibility of a student object
    }
}