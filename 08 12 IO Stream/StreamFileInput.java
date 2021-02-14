import java.io.*;
public class StreamFileInput
{
	public static void main(String args[])throws IOException{
		FileInputStream fis=new FileInputStream("Kaushik.txt");
		int n;
		while((n=fis.read())!=-1)
			System.out.print((char)n);
		fis.close();
	}
}