package arrayforeach17a;

public class ArrayForEach17A {
    public static void main(String[] args) {
        int a[];
        a=new int[4];
        a[0]=2;
        a[1]=3;
        a[2]=9;
        a[3]=6;
        
        for(int x : a){
            System.out.print(x+"  ");
        }       
    }
}
