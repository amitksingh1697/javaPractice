package operations;

public class Oper {
    
    public void arrayPrint2D(int a[][]){
        for(int x[] : a){
            for(int y : x){
                System.out.printf("%2d  ",y);
            }
            System.out.println();
        }
    }
    
    public void arrayTri1(int a[][]){
        for(int x=0;x<a.length;x++){
            for(int y=0;y<=x;y++){
                System.out.printf("%2d  ",a[x][y]);
            }
            System.out.println();
        }
    }
    
    public void arrayTri2(int a[][]){
        for(int x=0;x<a.length;x++){
            for(int y=0;y<a.length;y++){
                if(y<3-x){
                    System.out.print("    ");
                }
                else{
                    System.out.printf("%2d  ",a[x][y]);
                }
            }
            System.out.println();
        }
    }
    
    public int arrayMax(int a[][]){
        int M=a[0][0];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(M<a[i][j]){
                    M=a[i][j];
                }
            }
        }
      return M;
    }

    public int arrayTri1Max(int a[][]){
        int M=a[0][0];
        for(int x=0;x<a.length;x++){
            for(int y=0;y<=x;y++){
                if(M<a[x][y]){
                    M=a[x][y];
                }
            }
        }
     return M;
    }
    
    public int arrayTri2Max(int a[][]){
        int M=a[0][0];
        for(int x=0;x<a.length;x++){
            for(int y=0;y<a.length;y++){
                if(y<3-x){}
                else{
                    if(M<a[x][y]){
                        M=a[x][y];
                    }
                }
            }
        }
     return M;
    }
    
}
