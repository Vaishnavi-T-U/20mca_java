import java.util.*;
class Rectangle
{ double l,b;
void setData(double a,double c)
{l=a;
b=c; }
void getArea()
{ System.out.println("Area is: "+(l*b));}}
class pgm2
{
public static void main(String args[])
{
/*System.out.println("Enter the length: ");
  Scanner obj=new Scanner(System.in);
  float a=obj.nextFloat();
  System.out.println("Enter the breadth: ");
  float c=obj.nextFloat();*/

  Rectangle ob=new Rectangle();
  ob.setData(12.48,13);
  ob.getArea();
  }}

