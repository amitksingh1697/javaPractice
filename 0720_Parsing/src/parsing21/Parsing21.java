package parsing21;

public class Parsing21 {

    public static void main(String[] args) {
//      Conversion of simple data into objects by using Wrapper classes called Boxing
      
        String a="104";
        System.out.println(a+2);
        int b=Integer.parseInt(a);
        System.out.println(b+2);
        System.out.println();
        
        String A="12.6";
        System.out.println(A+2);
        double B=Double.parseDouble(A);
        System.out.println(B+2);
        System.out.println();
        
        int c=12;
        System.out.println(c+4);
        String C=String.valueOf(c);
        System.out.println(C+4);
        System.out.println();
        
        
        double d=12.6;
        System.out.println(d);
        String D=String.valueOf(d);
        System.out.println(D+2);
        System.out.println();
    }
}
