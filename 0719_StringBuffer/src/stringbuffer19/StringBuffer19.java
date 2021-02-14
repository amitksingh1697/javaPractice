package stringbuffer19;

public class StringBuffer19 {

    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("Hello Incapp");
        StringBuffer s2=new StringBuffer("Learning Java");
        
        s1.setCharAt(4,'x');
        System.out.println("s1 = "+s1);
        s2.insert(4,"Hi");
        System.out.println("s2 = "+s2);
        s1.append(s2);
        System.out.println("s1 = "+s1);
        s1.delete(2,6);
        System.out.println("s1 = "+s1);
        s1.replace(2,6,"Rajnikant");
        System.out.println("s1 = "+s1);
        s1.reverse();
        System.out.println("s1 = "+s1);
    }
    
}
