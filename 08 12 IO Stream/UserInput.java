import java.io.*;
public class UserInput
{
	public static void main(String args[])throws IOException{
		int n;
		char c;
		System.out.println("Enter a character");
		n=System.in.read();
		c=(char)n;
		System.out.println("You entered a character = "+c);
	}
}