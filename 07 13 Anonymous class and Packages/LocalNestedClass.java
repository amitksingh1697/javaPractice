class LocalNClassA
{
	int x=10;
	void m1(){
		class A
		{
			int y=20;
			void m2(){
				System.out.println("Hi first Local Nested Class of method 1");
			}
		}
		class B
		{
			int z=30;
			void m3(){
				System.out.println("Hi second Local Nested Class of method 1");
			}
		}
		A a=new A();
		a.m2();
		B b=new B();
		b.m3();
	}
	void m2(){
		class A
		{
			int y=20;
			void m2(){
				System.out.println("Hi first Local Nested Class of method 2");
			}
		}
		A a=new A();
		a.m2();
	}
}
class LocalNestedClass
{
	public static void main(String[] CSP){
		LocalNClassA A=new LocalNClassA();
		System.out.println(A.x);
		A.m1();
		A.m2();
	}
}