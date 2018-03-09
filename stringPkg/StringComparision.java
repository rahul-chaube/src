package stringPkg;

public class StringComparision {

    public static void main(String[] args) {
        String s1="Ram";
        String s2="Ram";
        String s3=new String("Ram");
        String s4=new String("Ram");
        String s5="shyam";
        String nulls1=null;
        String nulls2=null;

        System.out.println("Comparing string with Equals");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s5));

        System.out.println("Comparing String with == ");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s5);

        System.out.println("Comparing string with compareTo ");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s5));
    }
}
