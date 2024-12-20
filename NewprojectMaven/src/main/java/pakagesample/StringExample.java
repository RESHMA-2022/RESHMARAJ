package pakagesample;

public class StringExample {
public static void main(String args[])
{
	String name="java";
	String name2="selenium";
	String name3="JAVA";
	String name4="java";
System.out.println(name.equals(name2));
System.out.println(name.equals(name3));
System.out.println(name.equals(name4));
//equalsIgnoreCase
System.out.println(name.equalsIgnoreCase(name3));
//valuOf
int a=5;
String s=String.valueOf(a);
System.out.println(s);
//isEmpty()
String s1="";
System.out.println(s1.isEmpty());
}

}


