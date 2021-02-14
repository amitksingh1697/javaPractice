package autoboxing21;

public class Autoboxing21 {

    public static void main(String[] args) {
        int a=40;
        Integer b=new Integer(a);//Boxing
        int c=b.intValue();//Unboxing
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();

        
//      Autoboxing, From JDK 1.5 concept of autoxing comes in existing.
        int A=30;
        Integer B=A;//Boxing
        int C=B;//Unboxing
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);        
    }
}
