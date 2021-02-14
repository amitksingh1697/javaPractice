import java.io.*;
import java.net.*;

public class MyServer
{
	public static void main(String []args){
		try{
			ServerSocket ss=new ServerSocket(1210);
			Socket s=ss.accept();
			DataInputStream din=new DataInputStream(s.getInputStream());
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			System.out.println("Connected.");
			System.out.println("Client Message: "+din.readUTF());
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter a line :");
			String s1=br.readLine();
			dout.writeUTF(s1);
			dout.flush();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}