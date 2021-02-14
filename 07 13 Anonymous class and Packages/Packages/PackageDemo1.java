class PackageDemo1
{
	public static void main(String[] CSP){
		P1.A a=new P1.A();
		a.m1();
		System.out.println(a.x);
		P1.B b=new P1.B();
		b.m2();
		System.out.println(b.y);
		
		P2.A c=new P2.A();
		c.m1();
		System.out.println(c.x);
		P2.B d=new P2.B();
		d.m2();
		System.out.println(d.y);
		P2.C e=new P2.C();
		e.m3();
		System.out.println(e.z);
	} 
}