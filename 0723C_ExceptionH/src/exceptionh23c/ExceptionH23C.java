package exceptionh23c;

public class ExceptionH23C {

    public static void main(String[] args) {
        System.out.println("Hello Incapp.");
        int n=20,number;
        System.out.println("n = "+n);
        
        try
        {
            number=n/0;
            number=number+n;
        }
        catch(Exception e)//Objected into the super class
        {
            System.out.println("A number can't be divided by 0");
        } 
        System.out.println("Are pagle ye toh chal gya.");
    }
}
