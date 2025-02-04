public class prac24 {
    private String name;
    private int age;
    private double salary;
    private int empNo;
    private static int empCount = 0; 
    public prac24(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.empNo = ++empCount; 
    }
    public void display() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Employee Number: " + empNo);
        System.out.println();
    }
    public static void main(String[] args) {
        prac24[] employees = new prac24[10];
        employees[0] = new prac24("Poorvi", 30, 50000.0);
        employees[1] = new prac24("Mahi", 35, 60000.0);
        employees[2] = new prac24("Vishwa", 25, 45000.0);
        employees[3] = new prac24("Divya", 28, 55000.0);
        employees[4] = new prac24("Divy", 32, 52000.0);
        employees[5] = new prac24("Manav", 40, 70000.0);
        employees[6] = new prac24("Harmin", 27, 48000.0);
        employees[7] = new prac24("Om", 33, 58000.0);
        employees[8] = new prac24("Tirth", 29, 53000.0);
        employees[9] = new prac24("Nitin", 31, 56000.0);

        for (prac24 emp : employees) {
            emp.display();
        }
    }
}
