public class Student {
    private String name;

    // Constructor with default name "Unknown" if no name is provided
    public Student() {
        this.name = "Unknown";
    }

    // Constructor with parameter to set the name
    public Student(String name) {
        this.name = name;
    }

    // Method to get the name of the student
    public String getName() {
        return name;
    }

    // Method to set the name of the student
    public void setName(String name) {
        this.name = name;
    }

    // Method to print the name of the student
    public void printName() {
        System.out.println("Student's name: " + name);
    }

    public static void main(String[] args) {
        // Creating objects of Student class with different names
        Student student1 = new Student(); // Default name "Unknown"
        Student student2 = new Student("John");
        Student student3 = new Student("Alice");

        // Printing names of students
        student1.printName();
        student2.printName();
        student3.printName();
    }
}
