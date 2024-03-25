import java.util.Scanner;
class pgm14
{
public static void main (String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String str=sc.next();
int length=str.length();
System.out.println("Length of the string:"+length);
String word=str.toUpperCase();
System.out.println("Uppercase string: " + word);
  String replacedStr = str.replace('o', '0');
  System.out.println("String after replacing 'o' with '0': " + replacedStr);
  System.out.println("Enter the string to insert into  the string buffer:");
  String sb=sc.next();
  StringBuffer stringBuffer = new StringBuffer(sb);
  System.out.println("Enter the string to append into  the string buffer:");
  String sa=sc.next();
  stringBuffer.append(sa);
  System.out.println("StringBuffer after append operation: " + stringBuffer);
  stringBuffer.reverse();
  System.out.println("Reversed StringBuffer: " + stringBuffer);
    }
}

