import java.io.*;
public class Serialization implements Serializable
{
	public static int A;
	public String Name;
	public int Age;
	public Serialization(String n,int age,int x){
		Name=n;
		Age=age;
		A=x;
	}
}