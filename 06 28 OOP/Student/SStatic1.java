class Static1
{
	private long rollno;
	private String name;
	private double fee;
	private int age;
	static String std="5 Sem";
	static String clg="IEC College of Engineering and Technology";
	
	void setData(long r,String n,double f,int a)
	{
		rollno=r;
		name=n;
		fee=f;
		age=a;
	}
	void getData()
	{
		System.out.println(rollno+"\t"+name+"\t"+fee+"\t"+age+"\t"+std+"\t"+clg);
	}
}
class SStatic1
{
	public static void main(String JP[])
	{
		Static1 S1=new Static1();
		Static1 S2=new Static1();
		Static1 S3=new Static1();
		Static1 S4=new Static1();
		Static1 S5=new Static1();
		Static1 S6=new Static1();
		
		S1.setData(1509010010,"Abhishek Rai",102000,19);
		S2.setData(1509010015,"Aaditya Tripathi",102000,22);
		S3.setData(1509010018,"Aishwarya Verma",102000,18);
		S4.setData(1509010039,"Anshkika Kumari",82000,19);
		S5.setData(1509010050,"Ashutosh Saraswat",72000,20);
		S6.setData(1509010229,"Virali Bajpai",82000,19);
		
		S1.getData();
		S2.getData();
		S3.getData();
		S4.getData();
		S5.getData();
		S6.getData();
	}
}