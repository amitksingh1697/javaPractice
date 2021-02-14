import java.io.*;
import java.util.*;
public class CharArrayReaderWriter
{
	public static void main(String [] args)throws IOException{
		CharArrayWriter cw=new CharArrayWriter();
		String s="Incredible INDIA";
		char ch[]=s.toCharArray();
		cw.write(ch);
		FileWriter f=new FileWriter("lalu.txt");
		cw.writeTo(f);
		f.flush();
		System.out.println(cw.toString());
		
		CharArrayReader cr=new CharArrayReader(ch);
		int n=0;
		while((n=cr.read())!=-1)
			System.out.print((char)n);
		cw.close();
		cr.close();
	}
}