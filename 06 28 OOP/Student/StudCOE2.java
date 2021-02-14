class COE2
{
	long rollno;
	String name;
	double fee;
	int age;
	String std;
	String clg;
	
	void setData(long r,String n,double f,int a,String s,String c)
	{
		rollno=r;
		name=n;
		fee=f;
		age=a;
		std=s;
		clg=c;
	}
	void getData()
	{
		System.out.println(rollno+"\t"+name+"\t"+fee+"\t"+age+"\t"+std+"\t"+clg);
	}
}
class StudCOE2
{
	public static void main(String JP[])
	{
		COE2 S1=new COE2();
		COE2 S2=new COE2();
		COE2 S3=new COE2();
		COE2 S4=new COE2();
		COE2 S5=new COE2();
		COE2 S6=new COE2();
		
		S1.setData(1509010010,"Abhishek Rai",102000,19,"5 Sem","IEC College of Engineering and Technology");
		S2.setData(1509010015,"Aaditya Tripathi",102000,22,"5 Sem","IEC College of Engineering and Technology");
		S3.setData(1509010018,"Aishwarya Verma",102000,18,"5 Sem","IEC College of Engineering and Technology");
		S4.setData(1509010039,"Anshkika Kumari",82000,19,"5 Sem","IEC College of Engineering and Technology");

		S5.rollno=1509010050;
		S5.name="Ashutosh Saraswat";
		S5.fee=72000;
		S5.age=20;
		S5.std="5 Sem";
		S5.clg="IEC College of Engineering and Technology";

		S6.setData(1509010229,"Virali Bajpai",82000,19,"5 Sem","IEC College of Engineering and Technology");
		
		S1.getData();
		S2.getData();
		S3.getData();
		S4.getData();
		S5.getData();
		S6.getData();
	}
}