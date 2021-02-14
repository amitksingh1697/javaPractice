package vararg21a;

public class VarArg21A {

    public static void main(String[] args) {
        VarArg21A k=new VarArg21A();
        k.m1();
        k.m1(2);
        k.m1(5,3);
        k.m1(25,35,78);
        k.m1(new int[]{5,45,4,1,8,12});
//        k.m1(5,3.2); m can accept only integer type value.
//    int a[]=new int[0];
//    int a[]=new int[-2]; Run time error
        k.m2(2,7,8,6,5);
    }
    
    void m1(int ...x)//var argument
    {
        System.out.println("Hello m1");
        for(int a: x){
            System.out.printf("%2d ",a);
        }
        System.out.println();
    }

    void m2(int y,int ...x)//m2(int ...y,int x); Error
    {
        System.out.println("Hello m2");
        System.out.printf("%2d ",y);      
        for(int a: x){
            System.out.printf("%2d ",a);
        }
        System.out.println();
    }    
}