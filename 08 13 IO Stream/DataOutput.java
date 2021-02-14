import java.io.*;
public class DataOutput
{
	public static void main(String []args)throws IOException{
		FileOutputStream fout=new FileOutputStream("Incapp.txt");
		DataOutputStream dout=new DataOutputStream(fout);
		dout.writeChar('j');
	}
}