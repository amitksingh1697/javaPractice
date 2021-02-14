//Problem of Synchronization in this program
class MathS{
	int x,y;
	void add(int a,int b){
		x=a;
		y=b;
		try{
			Thread.sleep(100);
		}catch(Exception e){
			System.out.println(e);
		}
		int s=x+y;
		System.out.println("Addition = "+s);
	}
}

class MyThread1S extends Thread{
	MathS m;
	MyThread1S(MathS t){
		m=t;
	}
	public void run(){
		m.add(6,4);
	}
}

class MyThread2S extends Thread{
	MathS m;
	MyThread2S(MathS t){
		m=t;
	}
	public void run(){
		m.add(5,7);
	}
}
 
class Problem_Synchronization{
	public static void main(String[] args){
		System.out.println("Hello main.");
		MathS obj=new MathS();
		MyThread1S t1=new MyThread1S(obj);
		MyThread2S t2=new MyThread2S(obj);
		System.out.println("Start thread A.");
		t1.start();
		System.out.println("Start thread B.");
		t2.start();
		System.out.println("Bye main.");
	}
}