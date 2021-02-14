package stringarrayex;

public class StringArrayEx {

    public static void main(String[] args) {
        String s="Abhishek Rai";
        StringOp so=new StringOp();
        System.out.println("String without spaces: "+so.squeeze(s));
        System.out.println();
        so.print1(s);
        so.print2(s);
        so.print3(s);
        so.print4(s);
        so.print5(s);
    
    }
}

class StringOp{

    String squeeze(String s){
        String ns="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=32){//ASCII code of space is 32.
                ns+=s.charAt(i);
            }
        }
        return ns;
    }
    
    void print1(String s){
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length()-i;j++){
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void print2(String s){
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(s.charAt(j)+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void print3(String s){
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(j<i){
                    System.out.print("  ");                
                }
                else{
                    System.out.print(s.charAt(j)+" ");                    
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void print4(String s){
        for(int i=0;i<s.length();i++){
            int k=0;
            for(int j=0;j<s.length();j++){
                if(i>=s.length()-j-1){
                    System.out.print(s.charAt(k)+" ");
                    k++;
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void print5(String s){
        int k=-1;
        for(int i=1;i<=2*s.length()-1;i++){
            if((2*s.length()-1)%2==0){
                if(i<=(2*s.length()-1)/2){
                    k++;
                }
                if(i>(2*s.length()-1)/2+1){
                    k--;
                }
            }else{
                if(i<= 2*s.length()/2){
                    k++;
                }else{
                    k--;
                }
            }
            for(int j=1;j<=s.length();j++){
                if(j<=k){
                    System.out.print(s.charAt(k)+" ");
                    k++;
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    
    void print6(String s){
        char c;
        for(int i=0;i<s.length();i++){
            for(int j=0,k=0;j<s.length();j++){
                
            }
            System.out.println();
        }
        System.out.println();
    }
    
}