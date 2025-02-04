public class Person {
    private String name;
    private int age;
    private double salary;
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public static void main(String[] args) {
        Person person = new Person("Vani Sharma", 30, 50000);
        System.out.println("Initial values:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Salary: $" + person.getSalary());
        person.setName("Poorvi Sharma");
        person.setAge(20);
        person.setSalary(30000);
        System.out.println("\nModified values:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Salary: Rs" + person.getSalary());
    }
}
