package operations;

import java.util.Arrays;

public class Oper {
    
    public void print(int a[]){
        for(int y : a){
            System.out.print(y+"  ");
        }
        System.out.println();
    }
    
    public int sum(int a[]){
        int s=0;
//        for(int x=0;x<a.length;x++){
//            s+=a[x];
//        }
        for(int x : a){
            s+=x;
        }
       return s;
    }
    
    public int min(int[] a){
        int m=a[0];
        for(int x : a){
            if(x<m){
                m=x;
            }
        }
        return m;
    }
    
    public int max(int[] a){
        int M=a[0];
        for(int x : a){
            if(x>M){
                M=x;
            }
        }
        return M;
    }
    
    public void freq(int[] a){
        Arrays.sort(a);
        int temp=a[0];
        for(int i=0;i<a.length;i++){
            int count=0;
            while(temp==a[i]){
                count++;
                i++;
            }
            System.out.println("No of "+temp+" is = "+count);
            temp=a[i];
            i--;
        }
    }   
}
