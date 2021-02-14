class A_in extends Thread{
	public void run(){
		System.out.println("From thread A : 1");
		System.out.println("From thread A : 2");
		System.out.println("From thread A : 3");
		System.out.println("From thread A : 4");
		System.out.println("From thread A : 5");
		System.out.println("Exiting from A.");
	}
}

class B_in extends Thread{
	public void run(){
		System.out.println("From thread B : 1");
		System.out.println("From thread B : 2");
		System.out.println("From thread B : 3");
		System.out.println("From thread B : 4");
		System.out.println("From thread B : 5");
		System.out.println("Exiting from B.");
	}
}

class Thread_in{
	public static void main(String[] args){
		System.out.println("Hello main.");
		A_in a=new A_in();
		a.start();
		//new A_in().start();
		B_in b=new B_in();
		b.start();
		//new B_in().start();
		System.out.println("Bye main.");
	}
}