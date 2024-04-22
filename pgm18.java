import java.util.Scanner;

class Person {
    int age;
    String pname;
    String gender;
    String address;

    public Person( int age,String pname,String gender, String address) {
         this.age=age;
         this.pname=pname;
         this.gender=gender;
         this.address = address;
    }
}
class Employee extends Person  {
    String cpname;
    String qualification;
    float salary;
    int empid;

    public Employee(String cpname,String qualification,float salary,int empid) {
        super(age,pname,gender,address);
        this.cpname = cpname;
        this.qualification = qualification;
        this.salary = salary;
        this.empid = empid;
    }}
class Teacher extends Employee  {
    String subject;
    String dept;
    int teachid;

    public Teacher(String subject,String dept,int teachid) {
        super(cpname,qualification,salary,empid);
        this.subject = subject;
        this.dept = dept;
        this.salary = salary;
        this.teachid = teachid;
    }

    public void display() {
        System.out.println("\nName: " + pname);
        System.out.println("Address: " + address);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Company name: " + cpname);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        
        System.out.println("Subject Taught: " + subject);
    }
}
public class pgm18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of teachers: ");
        int n = scanner.nextInt();

 
        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for teacher " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Department: ");
            String department = scanner.nextLine();
            System.out.print("Subject Taught: ");
            String subject = scanner.nextLine();

         
            teachers[i] = new Teacher(empId, name, salary, address, department, subject);
        }

        System.out.println("\nDetails of all teachers:");
        for (Teacher teacher : teachers) {
            teacher.display();
        }

        scanner.close();
    }
}
