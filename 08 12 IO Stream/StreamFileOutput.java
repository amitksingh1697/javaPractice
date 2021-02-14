import java.io.*;
public class StreamFileOutput
{
	public static void main(String args[])throws IOException{
		byte a[]=new byte[80];
		try{
			System.out.println("Enter a line : ");
			System.in.read(a);
			FileOutputStream fos=new FileOutputStream("Rai.txt");
//			FileOutputStream fos=new FileOutputStream("Rai.txt");
			fos.write(a);
			fos.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}