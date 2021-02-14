class VariableA
{
	final static int a=10;//static class level variable.
	final int b=20;//non-static class level variable.
	void m1()
	{
		final int c=30;//local variable. It can never be static.
	}
}

class FinalVar1
{
	public static void main(String[] A){
		System.out.println(VariableA.a);
		//VariableA.a=50; Compile Time Error, we can't assign a value to the final variable.
		System.out.println(VariableA.a);
	}
}