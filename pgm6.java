import java.util.Scanner;
class Complex{
 double real,imaginary;
 
 public Complex(double real,double imaginary)
 {
 this.real=real;
 this.imaginary=imaginary;
 }
 public Complex add(Complex other)
 {
 double realsum=this.real + other.real;
 double imagsum=this.imaginary + other.imaginary;
 return new Complex(realsum,imagsum);
 }
 public void display()
 {
 System.out.println(real+"+"+imaginary+"i");
 }
 }
 public class pgm6
 {
 public static void main(String[] args)
 {
 double r1,r2,i1,i2;
 Scanner sc =new Scanner(System.in);
 System.out.println("Enter real of first");
 r1=sc.nextDouble();
 System.out.println("Enter imaginary of first");
 i1=sc.nextDouble();
 System.out.println("Enter real of second");
 r2=sc.nextDouble();
 System.out.println("Enter imaginary of second");
 i2=sc.nextDouble();
 
 Complex num1=new Complex(r1,i1);
 Complex num2=new Complex(r2,i2);
 System.out.print("Complex number1:   ");
 num1.display();
 System.out.print("Complex number2:  " );
 num2.display();
 System.out.print("Sum:    ");
 Complex sum=num1.add(num2);
 sum.display();
 }
 }