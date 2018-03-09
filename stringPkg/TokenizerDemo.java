package stringPkg;

import java.util.StringTokenizer;

public class TokenizerDemo {
    public static void main(String[] args) {
        System.out.println("Using Constructor 1 - ");
        StringTokenizer token1=new StringTokenizer("Hello Geeks How are you ");
        while (token1.hasMoreTokens())
            System.out.println(token1.nextToken());

        System.out.println("Using second constructor 2 -");
        StringTokenizer token2=new StringTokenizer("Java : Code : String ",":");
        while (token2.hasMoreTokens())
            System.out.println(token1.nextToken());

        System.out.println(" Using Constructor 3 -");
        StringTokenizer tokenizer=new StringTokenizer("Java :Code : String ",":",true);
    }
}
