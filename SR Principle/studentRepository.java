public class studentRepository {
    public void save(Student student) {
        // Simulated database save
        System.out.println("Saving student: " + student.getName());
    }

    public Student findByName(String name) {
        // Simulated database fetch
        System.out.println("Fetching student with name: " + name);
        return new Student(name, 75); // Dummy student
    }
}