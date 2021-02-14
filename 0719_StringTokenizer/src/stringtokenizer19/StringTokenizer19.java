package stringtokenizer19;

import java.util.StringTokenizer;
public class StringTokenizer19 {

    public static void main(String[] args) {
        
        String s1="Incredible India.";
        String s2="I love my india , I can do anything for my nation.";
        String s3="Har Har Mahadev";
        StringTokenizer st1=new StringTokenizer(s1," ");
        System.out.println();
        StringTokenizer st2=new StringTokenizer(s2," ,");
        System.out.println();
        StringTokenizer st3=new StringTokenizer(s3,"a");
        
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken());
        }
        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }
        while(st3.hasMoreTokens()){
            System.out.println(st3.nextToken());
        }
    }    
}
