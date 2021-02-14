package collections0508;

import java.util.*;

public class Collections0508 {

    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(10);
        al.add(10);
        al.add(10);
        al.add(3.2);
        al.add("Ram");
        al.add('k');
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        al.remove("Ram");
        System.out.println(al);
        
        
        HashSet hl=new HashSet();
        hl.add(10);
        hl.add(3.2);
        hl.add("Ram");
        hl.add('k');
        System.out.println(hl);
        hl.remove(2);//It's not working because in hashing there is no indexing.
        System.out.println(hl);
        hl.remove("Ram");
        System.out.println(hl);

    }
}
