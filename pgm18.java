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
    double salary;
    int empid;

    public Employee(int age,String pname,String gender, String address,String cpname,String qualification,double salary,int empid) {
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

    public Teacher(int age,String pname,String gender, String address,String cpname,String qualification,double salary,int empid,String subject,String dept,int teachid) {
        super(age,pname,gender,address,cpname,qualification,salary,empid);
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
        System.out.println("Employee ID: " + empid);
        System.out.println("Company name: " + cpname);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + dept);
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
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        String pname = scanner.nextLine();
        System.out.print("Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Company name: ");
        String cpname = scanner.nextLine();
        System.out.print("Qualification: ");
        String qualification = scanner.nextLine();
        System.out.print("Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Employee ID: ");
        int empid = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Subject Taught: ");
        String subject = scanner.nextLine();
        System.out.print("Department: ");
        String dept = scanner.nextLine();
        System.out.print("Teacher ID: ");
        int teachid = scanner.nextInt();

        teachers[i] = new Teacher(age, pname, gender, address, cpname, qualification, salary, empid, subject, dept, teachid);
    }

    System.out.println("\nDetails of all teachers:");
    for (Teacher teacher : teachers) {
        teacher.display();
    }

    scanner.close();
}
}
