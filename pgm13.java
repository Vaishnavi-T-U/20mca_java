import java.util.Scanner;
class pgm13
{
public static void main (String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of the array:");
int n =sc.nextInt();
int f=0;
int[]arr=new int[n];
System.out.println("Enter the elements of the array:");
for(int i=0;i<n;i++)
{ arr[i]=sc.nextInt();}
System.out.println("Enter the element to search in the array:");
int num =sc.nextInt();
for(int i=0;i<n;i++)
{ if(arr[i]==num)
  { f=1;
    break;}}
 if(f==1)
 { System.out.println("Element found ");}
 else
 {System.out.println("Element not found");}
 }}
