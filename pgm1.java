import java.util.*;
class demo
{
void display(int l,int n)
{ System.out.println("Sum of "+l+" and "+n+" is: "+(l+n));
}
}
class pgm1
{
public static void main(String args[])
{String s;
do{
 System.out.println("Enter yes/no: ");
 Scanner obj1=new Scanner(System.in);
  s=obj1.nextLine();
  if(s.equals("no"))
  {System.out.println("ok");
  }
   else if(s.equals("yes"))
  {
int a,b;
System.out.println("Enter first number: ");
  Scanner obj=new Scanner(System.in);
  a=obj.nextInt();
  System.out.println("Enter second number: ");
  b=obj.nextInt();
  demo ob=new demo();
  ob.display(a,b);
    //ob.l=20;
 }}while(s.equals("yes")); }}
