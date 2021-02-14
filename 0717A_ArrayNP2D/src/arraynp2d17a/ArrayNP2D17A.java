package arraynp2d17a;

import A.A;
import B.B;
public class ArrayNP2D17A {

    public static void main(String[] args) {
        A a[]=new A[]{new A(),new A(),new A()};
        A b[]=new A[]{new A(),new A(),new A()};
        A c[]=new A[]{new A(),new A(),new A()};
        
        a[0].m1();
        a[1].m1();
        a[2].m1();
        System.out.println();
        b[0].m1();
        b[1].m1();
        b[2].m1();
        System.out.println();
        c[0].m1();
        c[1].m1();
        c[2].m1();
        System.out.println();
        
        
        B x[][]=new B[][]{
                           {new B(),new B(),new B()},
                           {new B(),new B(),new B()},
                           {new B(),new B(),new B()}
                         };
        for(B p[] : x){
            System.out.println();
            for(B q: p){
                  q.m1();
            }
        }   
    }
}
