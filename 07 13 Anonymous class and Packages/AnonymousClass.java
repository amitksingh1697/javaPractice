class AnonymousC
{
	void m1(){
		System.out.println("Overridden Method");
	}
}
class AnonymousClass
{
	public static void main(String[] CSP){
		AnonymousC A=new AnonymousC(){
			void m1(){
				System.out.println("Overriding Method");
			}
		};
		A.m1();
	}
}