package A;

public class A {
    private int a[][]=new int[][]{{2,8,9,6},{1,5,4,7},{4,0,6,2}};
    
    public void m1(){
        for(int x[] : a){
            System.out.println();
            for(int y : x){
                System.out.print(y+" ");
            }
        }
    }
    
    public void m2(){
        System.out.println();
        System.out.println();
      for(int x : a[0]){
          System.out.print(x+" ");
      }  
      System.out.println();
      
      for(int x : a[1]){
          System.out.print(x+" ");
      }  
      System.out.println();
      
      for(int x : a[2]){
          System.out.print(x+" ");
      }  
    }
    
}
