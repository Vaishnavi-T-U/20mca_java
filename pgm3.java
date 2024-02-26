
import java.util.Scanner;
class pgm3
{
  public static void main(String args[])
 {
   int num;
   System.out.println("Enter the number: ");
   Scanner obj=new Scanner(System.in);
   num=obj.nextInt();
   if(num%2==0)
   { 
     System.out.println("The number is even ");   
    }
  else{
     System.out.println("The number is odd "); 
   }
}
}
