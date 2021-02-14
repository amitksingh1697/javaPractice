class Ram1
{
	public static void main(String[] args)
	{
		new Ram2();
		/*  Compiler searches the "class Ram2" first in this program to compile
			when it not found then compiler searches the bytecode of "class Ram2"
			into the parallel folder. if it found then "Ram1.java" will be compile.
			
			but unfortunately bytecode also doesn't exist in it. then it start searching
			"Ram2.java" file into the parallel folder.
			
			if "Ram2.java" exists into the parallel folder start compiling it
			but if it found that there is no class of name "Ram2" then it will give
			error that "Bad source file."
			
			if "Ram2.java" exists into the parallel folder start compiling it
			it found the class of name "Ram2" then it will compile it first completely
			after creation of bytecode "Ram2.class" "Ram1.class" will create.
			
			there is also a condition that "class Ram2" is saved into a file which haven't 
			name "Ram2.java". then our compiler will not compile that code. it's error.
		*/
	}
}