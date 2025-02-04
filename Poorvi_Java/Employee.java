class Employee {
public static void main(String[] args){ 
    int empNo;
    String empName;
}
    Employee(int empNo, String empName) {
        this.empNo = empNo;
        this.empName = empName;
    }
}

class Teaching extends Employee {
    String nameOfSubject;

    Teaching(int empNo, String empName, String nameOfSubject) {
        super(empNo, empName);
        this.nameOfSubject = nameOfSubject;
    }

    void displayInfo() {
        System.out.println("Employee Number: " + empNo);
        System.out.println("Employee Name: " + empName);
        System.out.println("Subject Taught: " + nameOfSubject);
    }
}

class NonTeaching extends Employee {
    String typeOfWork;

    NonTeaching(int empNo, String empName, String typeOfWork) {
        super(empNo, empName);
        this.typeOfWork = typeOfWork;
    }

    void displayInfo() {
        System.out.println("Employee Number: " + empNo);
        System.out.println("Employee Name: " + empName);
        System.out.println("Type of Work: " + typeOfWork);
    }
}

public class Main {
    public static void main(String[] args) {
        Teaching teacher1 = new Teaching(101, "John", "Mathematics");
        Teaching teacher2 = new Teaching(102, "Jane", "Physics");

        NonTeaching staff1 = new NonTeaching(201, "Alice", "Janitorial");
        NonTeaching staff2 = new NonTeaching(202, "Bob", "Security");

        int empNoToFind = 101; // EmpNo to search

        if (teacher1.empNo == empNoToFind) {
            teacher1.displayInfo();
        } else if (teacher2.empNo == empNoToFind) {
            teacher2.displayInfo();
        } else if (staff1.empNo == empNoToFind) {
            staff1.displayInfo();
        } else if (staff2.empNo == empNoToFind) {
            staff2.displayInfo();
        } else {
            System.out.println("Employee not found with empNo: " + empNoToFind);
        }
    }
}
