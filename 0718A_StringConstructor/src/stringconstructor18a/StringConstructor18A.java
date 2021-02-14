package stringconstructor18a;

public class StringConstructor18A {

    public static void main(String[] args) {
        
        char a[]={'A','b','h','i','s','h','e','k'};
//      char a[]="Abhishek";
        String s1=new String("Radhe Krishna.");
        String s2=new String();
        String s3=new String(a);
        String s4=new String(a,4,2);
        String s5=new String(s1);
        String s6="Hee Hee";
        
        System.out.println(a);
//      System.out.println(s1[2]);
        System.out.println(s1);
        System.out.println(s1.toUpperCase());
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }  
}
