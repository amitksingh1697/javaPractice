class MathS2{
	int x,y;
	void add(int a,int b){
		System.out.println("Hello");
		System.out.println("Hi");
		synchronized(this){
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
}

class MyThread1S2 extends Thread{
	MathS2 m;
	MyThread1S2(MathS2 t){
		m=t;
	}
	public void run(){
		m.add(6,4);
	}
}

class MyThread2S2 extends Thread{
	MathS2 m;
	MyThread2S2(MathS2 t){
		m=t;
	}
	public void run(){
		m.add(5,7);
	}
}
 
class Synchronized_Block{
	public static void main(String[] args){
		MathS2 obj=new MathS2();
		MyThread1S2 t1=new MyThread1S2(obj);
		MyThread2S2 t2=new MyThread2S2(obj);
		t1.start();
		t2.start();
	}
}