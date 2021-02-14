import java.util.Scanner;
import java.io.*;
public class ScannerClass
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a;
		double b;
		String s;
		System.out.println("Enter a number :");
		a=sc.nextInt();
		System.out.println("Enter a double value :");
		b=sc.nextDouble();
		System.out.println("Enter a String :");
		s=sc.next();
		System.out.println("Here is output : ");
		System.out.println(a+" "+b+" "+s);
	}
}