public class student{
    private String myname;
    private int mygrade;

    public student(String name, int grade) {
        this.myname = name;
        this.mygrade = grade;
    }

    // Business logic
    public boolean hasPassed() {
        return mygrade >= 50;
    }

    // Persistence logic (violates SRP)
    public void saveToDatabase() {
        // Simulated save logic
        System.out.println("Saving " + myname + " to the database...");
    }

    // Reporting logic (violates SRP)
    public void generateReport() {
        System.out.println("---- Student Report ----");
        System.out.println("Name: " + myname);
        System.out.println("Grade: " + mygrade);
        System.out.println("Status: " + (hasPassed() ? "Passed" : "Failed"));
    }
}

