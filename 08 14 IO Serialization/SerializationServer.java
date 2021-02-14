import java.io.*;
public class SerializationServer
{
	public static void main(String []args)throws Exception{
		ObjectInputStream Oin=new ObjectInputStream(new FileInputStream("incapp.txt"));
		Serialization s=(Serialization)Oin.readObject();
		System.out.println(s.Name);
		System.out.println(s.Age);
		System.out.println(s.A);//prints 0 because there will be create a new static variable
	}
}