public class prac22 {
    private String name;
    private int rollNo;
    private int totalMarks;
    public prac22() {
        this("John Doe", 1, 0);
    }
    public prac22(String name, int rollNo, int totalMarks) {
        this.name = name;
        this.rollNo = rollNo;
        this.totalMarks = totalMarks;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + totalMarks);
    }

    public static void main(String[] args) {
       prac22 student1 = new prac22();
       prac22 student2 = new prac22("Poorvi", 2, 95);
        System.out.println("Student 1 (default values):");
        student1.display();
        System.out.println("\nStudent 2 (specified values):");
        student2.display();
    }
}
