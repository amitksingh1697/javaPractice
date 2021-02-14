package array2doper18;

import operations.Oper;

public class Array2DOper18 {

    public static void main(String[] args) {
        int[][] a={{1,2,3,4},{8,7,6,5},{9,10,11,12},{16,15,14,13}};
        Oper p=new Oper();
        p.arrayPrint2D(a);
        System.out.println();
        p.arrayTri1(a);
        System.out.println();
        p.arrayTri2(a);
        System.out.println();
        System.out.println("Maximum in the 2D Array = "+p.arrayMax(a));
        System.out.println("Maximum in the 2D ArrayTri1 = "+p.arrayTri1Max(a));
        System.out.println("Maximum in the 2D ArrayTri2 = "+p.arrayTri2Max(a));
    }    
}
