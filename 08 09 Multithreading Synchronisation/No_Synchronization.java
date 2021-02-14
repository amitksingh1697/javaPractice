//No problem of Synchronization in this program
class Math{
	int x,y;
	void add(int a,int b){
		x=a;
		y=b;
		try{
			Thread.sleep(5000);
		}catch(Exception e){
			System.out.println(e);
		}
		int s=x+y;
		System.out.println("Addition = "+s);
	}
}

class MyThread1 extends Thread{
	Math m;
	MyThread1(Math t){
		m=t;
	}
	public void run(){
		m.add(6,4);
	}
}

class MyThread2 extends Thread{
	Math m;
	MyThread2(Math t){
		m=t;
	}
	public void run(){
		m.add(5,7);
	}
}
 
class No_Synchronization{
	public static void main(String[] args){
		System.out.println("Hello main.");
		Math obj1=new Math();
		Math obj2=new Math();
		MyThread1 t1=new MyThread1(obj1);
		MyThread2 t2=new MyThread2(obj2);
		System.out.println("Start thread A.");
		t1.start();
		System.out.println("Start thread B.");
		t2.start();
		System.out.println("Bye main.");
	}
}