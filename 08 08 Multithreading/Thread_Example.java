class A_ex extends Thread{
	public void run(){
		System.out.println("From thread A : 1");
		System.out.println(Thread.currentThread().getName());
		System.out.println("From thread A : 3");
		System.out.println("From thread A : 4");
		System.out.println("From thread A : 5");
		System.out.println("Exiting from A.");
	}
}

class B_ex extends Thread{
	public void run(){
		System.out.println("From thread B : 1");
		System.out.println("From thread B : 2");
		System.out.println("From thread B : 3");
		stop();
		System.out.println("From thread B : 4");
		System.out.println("From thread B : 5");
		System.out.println("Exiting from B.");
	}
}

class C_ex extends Thread{
	public void run(){
		System.out.println("From thread C : 1");
		try{
			sleep(5000);//value is in miliseconds
		}catch(Exception ex){
			System.out.println(ex);
		}
		System.out.println("From thread C : 2");
		System.out.println("From thread C : 3");
		System.out.println("From thread C : 4");
		System.out.println("From thread C : 5");
		System.out.println("Exiting from C.");
	}
}

class Thread_ex{
	public static void main(String[] args){
		System.out.println("Hello main.");
		A_ex a=new A_ex();
		B_ex b=new B_ex();
		C_ex c=new C_ex();
		System.out.println("Start thread A.");
		a.start();
		System.out.println("Start thread B.");
		b.start();
		System.out.println("Start thread C.");
		c.start();
		System.out.println("Bye main.");
	}
}