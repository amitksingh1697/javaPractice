import java.io.*;
public class StreamFileReader
{
	public static void main(String args[])throws IOException{
		FileReader fis=new FileReader("Kaushik.txt");
		int n;
		while((n=fis.read())!=-1)
			System.out.print((char)n);
		fis.close();
	}
}