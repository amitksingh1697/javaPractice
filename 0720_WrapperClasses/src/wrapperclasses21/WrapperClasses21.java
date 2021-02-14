package wrapperclasses21;

public class WrapperClasses21 {

    public static void main(String[] args) {
//      By default Byte(1),Short(2) Here 1 & 2 will take 4 byte memory as int type
//      Wrapping of data is called boxing classes also.

        byte b=1;
        Byte B=new Byte(b);
        int i=5;
        Integer I=new Integer(6);
        float f=5.69f;
        Float F=new Float(6.23f);
        boolean bo=(4 < 3);
        Boolean BO=new Boolean(4 > 3);        
        char c='$';
        Character C=new Character('&');
        
        Object O[]=new Object[]{b,B,i,I,f,F,bo,BO,c,C};// Upcasting in Object class
        for(Object x: O){
            System.out.println(x);
        }
        
    }
}