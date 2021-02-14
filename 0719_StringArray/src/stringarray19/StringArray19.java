package stringarray19;

public class StringArray19 {

    public static void main(String[] args) {
        
        String s1=new String("Abhishek Rai");
        String s2="Rahul";
        String s3=new String(" Abhishek Rai ");
        String s4="Rahul";
        String s5=new String("Vighnaharta");
        String s6;
        
        s6=s1.toLowerCase();
        System.out.println("s6 = "+s6);
        s6=s1.toUpperCase();
        System.out.println("s6 = "+s6);
        s6=s1.replace("shek","Kaushik");
        System.out.println("s6 = "+s6);
        s6=s3.trim();
        System.out.println("s6 = "+s6);
        boolean a=s4.equals(s4);
        System.out.println("a = "+a);
        a=s2.equalsIgnoreCase(s4);
        System.out.println("a = "+a);
        int x=s1.length();
        System.out.println("x = "+x);
        char c=s1.charAt(5);
        System.out.println("a = "+a);
        x=s1.compareTo(s5);
        System.out.println("x = "+x);
        s6=s5.concat(s3);
        System.out.println("s6 = "+s6);
        s6=s1.substring(3);
        System.out.println("s6 = "+s6);
        s6=s1.substring(3,7);
        System.out.println("s6 = "+s6);
        double k=56.4;
        s6=String.valueOf(s1);
        System.out.println("s6 = "+s6);
        x=s1.indexOf("shek");
        System.out.println("x = "+x);
        x=s5.indexOf('e',5);
        System.out.println("x = "+x);        
    }
}