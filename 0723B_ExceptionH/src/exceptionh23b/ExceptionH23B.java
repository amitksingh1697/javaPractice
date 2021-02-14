package exceptionh23b;

public class ExceptionH23B {

    public static void main(String[] args) {
        System.out.println("Hello Incapp.");
        int n=20,number;
        System.out.println("n = "+n);
        
        try{
            number=n/0;// Airthmetic Exception
        }catch(ArithmeticException e){
            System.out.println("A number can't be divided by 0");
        }
        
//      number=number+n; statements which are related to the try block statements must be in that block,
        
        System.out.println("Are pagle ye toh chal gya.");
    }
}
