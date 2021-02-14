class MathS1{
	int x,y;
	synchronized void add(int a,int b){
		x=a;
		y=b;
		try{
			Thread.sleep(400);
		}catch(Exception e){
			System.out.println(e);
		}
		int s=x+y;
		System.out.println("Addition = "+s);
	}
}

class MyThread1S1 extends Thread{
	MathS1 m;
	MyThread1S1(MathS1 t){
		m=t;
	}
	public void run(){
		m.add(6,4);
	}
}

class MyThread2S1 extends Thread{
	MathS1 m;
	MyThread2S1(MathS1 t){
		m=t;
	}
	public void run(){
		m.add(5,7);
	}
}
 
class Synchronization{
	public static void main(String[] args){
		System.out.println("Hello main.");
		MathS1 obj=new MathS1();
		MyThread1S1 t1=new MyThread1S1(obj);
		MyThread2S1 t2=new MyThread2S1(obj);
		System.out.println("Start thread A.");
		t1.start();
		System.out.println("Start thread B.");
		t2.start();
		System.out.println("Bye main.");
	}
}