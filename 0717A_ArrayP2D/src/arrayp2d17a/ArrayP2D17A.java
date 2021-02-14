package arrayp2d17a;

import A.A;
public class ArrayP2D17A {

    public static void main(String[] args) {
        int a[]={2,8,9,6};
        int b[]={1,5,4,7};
        int c[]={4,0,6,2};
        
        for(int x : a){
            System.out.print(x+" ");
        }
        System.out.println();
        for(int x : b){
            System.out.print(x+" ");
        }
        System.out.println();
        for(int x : c){
            System.out.print(x+" ");
        }
        System.out.println();
        
        A p=new A();
        p.m1();
        p.m2();
    }
    
}
