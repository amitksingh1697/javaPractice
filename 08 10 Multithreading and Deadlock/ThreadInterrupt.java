public class ThreadInterrupt extends Thread
{
	public void run(){
		try{
			Thread.sleep(5000);
			System.out.println("task");
		}catch(Exception e){
			System.out.println(e);
		}
			System.out.println("Thread is running");
	}
	
	public static void main(String []args){
		ThreadInterrupt t=new ThreadInterrupt();
		t.start();
		t.interrupt();
	}
}