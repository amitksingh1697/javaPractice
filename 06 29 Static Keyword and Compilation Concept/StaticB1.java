class StatB1
{
 static
 {
	 System.out.println("StatB1");
 }
 
	static void show()
	{
		System.out.println("StatB1 show method.");
	}
}

class StaticB1
{
 static
 {
	 System.out.println("StaticB1");
 }
	public static void main(String s[])
	{
		System.out.println("StaticB1 main method.");
		StatB1.show();
		StatB1 a=new StatB1();
	}
}