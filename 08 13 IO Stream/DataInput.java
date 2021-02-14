import java.io.*;
public class DataInput
{
	public static void main(String []args)throws IOException{
		FileInputStream fin=new FileInputStream("Incapp.txt");
		DataInputStream din=new DataInputStream(fin);
		System.out.println(din.readChar());
	}
}