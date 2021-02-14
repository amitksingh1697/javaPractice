package array1doper17;
import java.util.Arrays;
import operations.Oper;
public class Array1DOper17 {

    public static void main(String[] args) {
       
       int a[]={1,2,2,3,5,8,9,0,3,4,6,1,2,7,8,4,9,7,3,6};
       
       Oper p=new Oper();
       System.out.println("Original array");
       p.print(a);
       System.out.println("Sorted array");
       Arrays.sort(a);
       p.print(a);
       System.out.println("Sum of the array = "+p.sum(a));
       System.out.println("Minimum in the array = "+p.min(a));
       System.out.println("Maximum in the array = "+p.max(a));
//       p.freq(a);
    }    
}
