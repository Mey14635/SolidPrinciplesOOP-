public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public boolean hasPassed() {
        return grade >= 50;
    }

    public String getName() {
        return name;
    }
            
    public int getGrade() {
        return grade;
    }
}
