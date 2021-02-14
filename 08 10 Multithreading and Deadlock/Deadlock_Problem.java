//ctrl+c used to stop execution
class MyThread1DP extends Thread
{
	String r1,r2;
	MyThread1DP(String s1,String s2){
		r1=s1;
		r2=s2;
	}
	public void run(){
		synchronized(r1){
			System.out.println("Thread 1: resource 1 locked");
			try{
				Thread.sleep(400);
			}catch(Exception e){
				System.out.println(e);
			}
			synchronized(r2){
				System.out.println("Thread 1: resource 2 locked");				
			}
		}
	}
}

class MyThread2DP extends Thread
{
	String r1,r2;
	MyThread2DP(String s1,String s2){
		r1=s1;
		r2=s2;
	}
	public void run(){
		synchronized(r2){
			System.out.println("Thread 2: resource 2 locked");
			try{
				Thread.sleep(400);
			}catch(Exception e){
				System.out.println(e);
			}
			synchronized(r1){
				System.out.println("Thread 2: resource 1 locked");				
			}
		}
	}
}

public class Deadlock_Problem//main class name must be same as file name when it's public
{
	public static void main(String []a){
		String resource1="Hello";
		String resource2="Abhishek";
		MyThread1DP t1=new MyThread1DP(resource1,resource2);
		MyThread2DP t2=new MyThread2DP(resource1,resource2);
		t1.start();
		t2.start();
	}
}