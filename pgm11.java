import java.util.*;
class pgm11
{
public static void main (String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of strings:");
int num =sc.nextInt();
String[] strings=new String[num];
System.out.println("Enter the strings:");
for(int i=0;i<num;i++)
{
 strings[i] =sc.next();
}
for(int i=0;i<strings.length-1;i++)
{ for(int j=i+1;j<strings.length;j++)
  { if(strings[i].compareTo(strings[j])>0)
    { String t=strings[i];
      strings[i]=strings[j];
      strings[j]=t;}}}
System.out.println("Sorted strings:");
for(String str:strings)
{System.out.println(str);}
sc.close();                             
}} 

