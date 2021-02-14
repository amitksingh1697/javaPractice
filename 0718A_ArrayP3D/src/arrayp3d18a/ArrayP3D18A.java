package arrayp3d18a;

public class ArrayP3D18A {

    public static void main(String[] args) {
        int a[][][]=new int[][][]{ //size of array block can vary in Java.
                                    {
                                     {2,9},
                                     {3,6,0,7,1},
                                     {9,4,2}
                                    },
                                    {
                                     {9,1,6},
                                     {3,2,8,7}
                                    }
                                 };
        
        for(int x[][] : a){
            for(int y[] : x){
                for(int z : y){
                    System.out.print(z+"  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
}