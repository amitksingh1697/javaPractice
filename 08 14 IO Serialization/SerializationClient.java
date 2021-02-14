import java.io.*;
public class SerializationClient
{
	public static void main(String []args)throws Exception{
		Serialization e1=new Serialization("Abhishek Rai",20,10);
		ObjectOutputStream Oout=new ObjectOutputStream(new FileOutputStream("incapp.txt"));
		Oout.writeObject(e1);
	}
}