import java.io.*;
public class FileReaderWriter
{
	public static void main(String args[])throws IOException{
		FileWriter fw=new FileWriter("Pappu.txt");
		String s="Shri Krishna";
		char ch[]=s.toCharArray();
		fw.write(ch);
		for(int i=0;i<ch.length;i++){fw.write(ch[i]);}
		fw.close();
		FileReader fr=new FileReader("Pappu.txt");
		int n=0;
		while((n=fr.read())!=-1){
			System.out.print((char)n);
		}
		fr.close();
	}
}