import java.util.Scanner;
import java.util.Arrays;
class pgm12
{
public static void main (String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String word=sc.next();
char[] arr=word.toCharArray();
Arrays.sort(arr);
String str= new String(arr);
System.out.println("Orginal string:"+word);
System.out.println("Sorted string:"+str);
}}

