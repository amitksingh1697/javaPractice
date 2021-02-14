package arrayp1d17a;

public class ArrayP1D17A {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=4;
        int d=7;
        
        System.out.print(a+"  ");
        System.out.print(b+"  ");
        System.out.print(c+"  ");
        System.out.print(d+"  ");
        System.out.println();
                
        int A[]=new int[]{10,20,4,7};
        
        for(int x : A){
            System.out.print(x+"  ");
        }
        System.out.println();
    }
    
}
