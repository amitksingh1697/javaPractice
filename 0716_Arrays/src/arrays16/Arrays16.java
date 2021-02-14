package arrays16;

public class Arrays16 {
    
    public static void main(String[] args) {

        int a[];//Array declaration
        a=new int[4];//Memory creation
        a[0]=5;
        a[1]=6;

        System.out.print(a[0]+"  ");
        System.out.print(a[1]+"  ");
        System.out.print(a[2]+"  ");
        System.out.println(a[3]);
        //System.out.println(a[4]); Runtime error(Exception)
        
        for(int i=0;i<4;i++){
            System.out.print(a[i]+"  ");
        }
        System.out.println();

        for(int x : a)// for-each loop
        {
            System.out.print(x+"  ");
        }
        System.out.println();        
        System.out.println("Exit");
    }   
}