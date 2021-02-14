import java.io.*;
public class BufferedReaderWriter_InputStreamReader_PrintWriter
{
	public static void main(String[] args)throws Exception{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		FileWriter fw1=new FileWriter("incapp.txt");
		FileWriter fw2=new FileWriter("hello.txt");
		BufferedWriter bw=new BufferedWriter(fw1);
		PrintWriter pw=new PrintWriter(fw2);
		String s=" ";
		
		while(!s.equals("stop")){
			s=br.readLine();
			bw.write(s);bw.write("\n");
			bw.flush();
			pw.println(s);
			pw.flush();
		}
		br.close();
		fw1.close();
		fw2.close();
		pw.close();
		
		FileReader fr=new FileReader("incapp.txt");
		BufferedReader br2=new BufferedReader(fr);
		String s1=" ";
		while(s!=null){
			s=br2.readLine();
			if(s!=null)
				System.out.print(s);
		}
		fr.close();
		br2.close();
	}
}