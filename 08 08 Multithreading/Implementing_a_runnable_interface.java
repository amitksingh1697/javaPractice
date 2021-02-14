class A_im implements Runnable{
	public void run(){
		System.out.println("From thread A : 1");
		System.out.println("From thread A : 2");
		System.out.println("From thread A : 3");
		System.out.println("From thread A : 4");
		System.out.println("From thread A : 5");
		System.out.println("Exiting from A.");
	}
}

class B_im implements Runnable{
	public void run(){
		System.out.println("From thread B : 1");
		System.out.println("From thread B : 2");
		System.out.println("From thread B : 3");
		System.out.println("From thread B : 4");
		System.out.println("From thread B : 5");
		System.out.println("Exiting from B.");
	}
}

class Thread_im{
	public static void main(String[] args){
		System.out.println("Hello main.");
		A_in a=new A_in();
		Thread t1=new Thread(a);
		t1.start();
		B_in b=new B_in();
		Thread t2=new Thread(a);
		t2.start();
		System.out.println("Bye main.");
	}
}