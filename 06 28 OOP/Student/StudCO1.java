class CO1
{
	long rollno;
	String name;
	float fee;
	int age;
	String std;
	String clg;
}
class StudCO1
{
	public static void main(String JP[])
	{
		CO1 S1=new CO1();
		CO1 S2=new CO1();
		CO1 S3=new CO1();
		CO1 S4=new CO1();
		CO1 S5=new CO1();
		CO1 S6=new CO1();
		
		S1.rollno=1509010010;
		S1.name="Abhishek Rai";
		S1.fee=102000;
		S1.age=19;
		S1.std="5 Sem";
		S1.clg="IEC College of Engineering and Technology";
		
		S2.rollno=1509010015;
		S2.name="Aaditya Tripathi";
		S2.fee=102000;
		S2.age=22;
		S2.std="5 Sem";
		S2.clg="IEC College of Engineering and Technology";
		
		S3.rollno=1509010016;
		S3.name="Aishwarya Verma";
		S3.fee=102000;
		S3.age=18;
		S3.std="5 Sem";
		S3.clg="IEC College of Engineering and Technology";
		
		S4.rollno=1509010039;
		S4.name="Anshika Kumari";
		S4.fee=82000;
		S4.age=19;
		S4.std="5 Sem";
		S4.clg="IEC College of Engineering and Technology";
		
		S5.rollno=1509010050;
		S5.name="Ashutosh Saraswat";
		S5.fee=72000;
		S5.age=20;
		S5.std="5 Sem";
		S5.clg="IEC College of Engineering and Technology";
		
		S6.rollno=1509010229;
		S6.name="Virali Bajpai";
		S6.fee=82000;
		S6.age=19;
		S6.std="5 Sem";
		S6.clg="IEC College of Engineering and Technology";
		
		System.out.println(S1.rollno+"\t"+S1.name+"\t"+S1.fee+"\t"+S1.age+"\t"+S1.std+"\t"+S1.clg);
		System.out.println(S2.rollno+"\t"+S2.name+"\t"+S2.fee+"\t"+S2.age+"\t"+S2.std+"\t"+S2.clg);
		System.out.println(S3.rollno+"\t"+S3.name+"\t"+S3.fee+"\t"+S3.age+"\t"+S3.std+"\t"+S3.clg);
		System.out.println(S4.rollno+"\t"+S4.name+"\t"+S4.fee+"\t"+S4.age+"\t"+S4.std+"\t"+S4.clg);
		System.out.println(S5.rollno+"\t"+S5.name+"\t"+S5.fee+"\t"+S5.age+"\t"+S5.std+"\t"+S5.clg);
		System.out.println(S6.rollno+"\t"+S6.name+"\t"+S6.fee+"\t"+S6.age+"\t"+S6.std+"\t"+S6.clg);										
	}
}