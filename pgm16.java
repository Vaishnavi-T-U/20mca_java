import java.util.Scanner;
public class pgm16{
public static double calculateArea(double length,double width)
{
return length*width;
}
public static double calculateArea(double radius)
{
return 3.14*radius*radius;
}
public static double calculateArea(int side)
{
return side*side;
}
public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the length of rectangle : ");
      double a = sc.nextDouble();
      System.out.print("Enter the width of rectangle : ");
      double b = sc.nextDouble();
      double rectangleArea=calculateArea(a,b);
      System.out.println("Area of rectangle: "+rectangleArea);
      System.out.print("Enter the radius of circle : ");
      double c = sc.nextDouble();
      double circleArea=calculateArea(c);
      System.out.println("Area of circle: "+circleArea);
      System.out.print("Enter the  side of square : ");
      double d = sc.nextDouble();
      double sqArea=calculateArea(b);
      System.out.println("Area of square: "+sqArea);
     }
      }
