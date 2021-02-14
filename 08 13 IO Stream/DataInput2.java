import java.io.*;
public class DataInput2
{
	public static void main(String []args)throws IOException{
		FileInputStream fin=new FileInputStream("hello.txt");
		DataInputStream din=new DataInputStream(fin);
		String s=din.readLine();
		while(s!=null){
			System.out.println(s);
			s=din.readLine();
		}
	}
}