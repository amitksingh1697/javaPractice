package boxunboxing21;

public class BoxUnboxing21 {

    public static void main(String[] args) {
        
        int a=40;
        Integer b=new Integer(a);//Boxing
        int c=b.intValue();//Unboxing
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        double A=40;
        Double B=new Double(a);//Boxing
        double C=b.doubleValue();//Unboxing
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
