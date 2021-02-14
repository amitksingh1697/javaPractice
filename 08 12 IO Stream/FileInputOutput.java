import java.io.*;
public class FileInputOutput
{
	public static void main(String args[])throws IOException{
		FileInputStream fin=new FileInputStream("Hello.txt");
		FileOutputStream fout=new FileOutputStream("Hi.txt");
		int n;
		while((n=fin.read())!=-1){
			fout.write((char)n);
		}
		fin.close();
		fout.close();
	}
}