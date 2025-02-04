import java.util.Random;
class employee
{
String name;
int age;
double salary;
int empno;
public employee(String name, int age, double salary) 
{
this.name = name;
this.age = age;
this.salary = salary;
this.empno = generateEmpNo();
}
public employee(String name, int age, double salary, int empno) 
{
this.name = name;
this.age = age;
this.salary = salary;
this.empno = empno;
}
private int generateEmpNo() 
{
Random random=new Random();
return random.nextInt(10000);
}
public void displayValues() 
{
System.out.println("Employee Name: " + name);
System.out.println("Employee Age: " + age);
System.out.println("Employee Salary: " + salary);
System.out.println("Employee Empno: " + empno);
}
}
class Teaching extends employee
{
String nameOfSubject;
public Teaching(String name, int age, double salary, String nameOfSubject) 
{
super(name, age, salary);
this.nameOfSubject = nameOfSubject;
}
 public Teaching(int empno, String nameOfSubject) 
{
super(null, 0, 0, empno);
this.nameOfSubject = nameOfSubject;
}
public void displayValues() 
{
super.displayValues();
System.out.println("Teaching Employee NameOfSubject: " + nameOfSubject);
}
}
class NonTeaching extends employee 
{
String typeOfWork;
public NonTeaching(String name, int age, double salary, String typeOfWork) 
{
super(name, age, salary);
this.typeOfWork = typeOfWork;
}
public NonTeaching(int empno, String typeOfWork) 
{
super(null, 0, 0, empno);
this.typeOfWork = typeOfWork;
}
public void displayValues() 
{
super.displayValues();
System.out.println("Non-Teaching Employee TypeOfWork: " + typeOfWork);
}
}
public class prac25
{
public static void main(String[] args) 
{
employee[] employees = new employee[4];
employees[0] = new Teaching("John Doe", 30, 50000, "Math");
employees[1] = new Teaching(101, "English");
employees[2] = new NonTeaching("Jane Smith", 35, 40000, "Admin");
employees[3] = new NonTeaching(102, "HR");
for (employee emp : employees) 
{
if (emp instanceof Teaching && emp.empno == 101) 
{
((Teaching) emp).displayValues();
} 
else if (emp instanceof NonTeaching && emp.empno == 102) 
{
((NonTeaching) emp).displayValues();
} 
else 
{
emp.displayValues();
}
}
}
}