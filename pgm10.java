import java.util.*;
class pgm10{
public static void main (String[] args){
int num,i,tot=0,max=100;
double per;

 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number of subjects: ");
 num= sc.nextInt();
 int[]mark=new int[num];
 System.out.println("Enter the marks of each subject: ");
 for(i=0;i<num;i++)
 {
 mark[i]=sc.nextInt();
 tot+=mark[i];
  }
  per=((double)tot/(num*100))*100;
  System.out.println("Total marks:"+tot);
  System.out.println("Avg: "+per+"%");
  sc.close();
}}




