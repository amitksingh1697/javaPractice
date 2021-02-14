import java.io.*;
public class StreamFileWriter
{
	public static void main(String args[])throws IOException{
		FileWriter fw=new FileWriter("Pappu.txt");
		String s="India is a good country";
		char ch[]=s.toCharArray();
		fw.write(s);
		fw.close();
	}
}