class COE1
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
class StudCOE1
{
	public static void main(String JP[])
	{
		COE1 S1=new COE1();
		COE1 S2=new COE1();
		COE1 S3=new COE1();
		COE1 S4=new COE1();
		COE1 S5=new COE1();
		COE1 S6=new COE1();
		
		S1.setData(1509010010,"Abhishek Rai",102000,19,"5 Sem","IEC College of Engineering and Technology");
		S2.setData(1509010015,"Aaditya Tripathi",102000,22,"5 Sem","IEC College of Engineering and Technology");
		S3.setData(1509010018,"Aishwarya Verma",102000,18,"5 Sem","IEC College of Engineering and Technology");
		S4.setData(1509010039,"Anshkika Kumari",82000,19,"5 Sem","IEC College of Engineering and Technology");
		S5.setData(1509010050,"Ashutosh Saraswat",72000,20,"5 Sem","IEC College of Engineering and Technology");
		S6.setData(1509010229,"Virali Bajpai",82000,19,"5 Sem","IEC College of Engineering and Technology");
		
		S1.getData();
		S2.getData();
		S3.getData();
		S4.getData();
		S5.getData();
		S6.getData();
	}
}