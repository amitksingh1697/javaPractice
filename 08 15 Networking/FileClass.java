import java.io.*;
public class FileClass
{
	public static void main(String []args){
		File f1=new File("Test");
	//	File f1=new File("e:\\exam");
	//	File f1=new File("e:\\exam","demo.txt");
	//	File f1=new File(f,"demo.txt");
		if(f1.exists()){
			System.out.println("Existing");
			if(f1.isDirectory()){
				System.out.println("and it is a directory.");
				String arr[]=f1.list();
				int i;
				for(i=0;i<arr.length;i++){
					System.out.println("Existing");
				}
			}else{
				System.out.println("and it is a file.");
				File nf=new File("Hello.txt");
				f1.renameTo(nf);
			}
		}else{
			System.out.println("Not Existing.");
		}
	}
}