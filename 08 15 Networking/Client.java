import java.io.*;
import java.net.*;

public class Client
{
	public static void main(String []args){
		try{
			Socket s=new Socket("localhost",1210);
			DataInputStream din=new DataInputStream(s.getInputStream());
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Connected.");
			while(true){
				System.out.print("Client : ");
				String s1=br.readLine();
				dout.writeUTF(s1);
				dout.flush();
				System.out.println("Server : "+din.readUTF());
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}