public class Thread_isInterrupted extends Thread
{
	public void run(){
		for(int i=1;i<=2;i++){
			if(Thread.interrupted()){
				System.out.println("Code for interrupted thread");
			}else{
				System.out.println("Code for normal thread");
			}
		}//end for the loop
	}
	
	public static void main(String []args){
		Thread_isInterrupted t1=new Thread_isInterrupted();
		Thread_isInterrupted t2=new Thread_isInterrupted();
		t1.start();
		t1.interrupt();
		t2.start();
	}
}