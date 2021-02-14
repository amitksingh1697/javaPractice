class Shared
{
	int flag=0,data=0;
	synchronized void submit(){
		flag=1;
		try{
			Thread.sleep(200);
		}catch(Exception e){
			System.out.println(e);
		}
		data=13932;
		System.out.println("Value Submitted");
		notify();
	}
	
	synchronized int withdraw(){
		if(flag==0){
			try{
				System.out.println("wait block");
				wait();
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
            return data;
        }
}

class MyThread1 extends Thread
{
	Shared s;
	MyThread1(Shared t){
		s=t;
	}
	public void run(){
		System.out.println(s.withdraw());
	}
}

class MyThread2 extends Thread
{
	Shared s;
	MyThread2(Shared t){
		s=t;
	}
	public void run(){
		s.submit();
	}
}

class InterThread_Communication
{
	public static void main(String[] s){
		Shared obj=new Shared();
		MyThread1 t1=new MyThread1(obj);
		MyThread2 t2=new MyThread2(obj);
		t1.start();
		t2.start();
	}
}