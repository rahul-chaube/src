package stringPkg;

public class IntegerToStringConversionDemo {
    public static void main(String[] args) {
        int a=123;
        int b=-123;
        String str1=Integer.toString(a);
        String str2=Integer.toString(b);
        System.out.println("String 1 =" +str1);
        System.out.println("String 2 =" +str2);

        // String.ValueOf()

        String str3=String.valueOf(a);
        System.out.println("String 3 "+str3);
        System.out.println("String 4"+String.valueOf(123));

        //toString

        System.out.println("String 5"+new Integer(123).toString());

        //conversion into Binary

        int c= 10;
        System.out.println("Binary "+Integer.toBinaryString(c));
        System.out.println("Hexadecimal "+Integer.toHexString(c));
        System.out.println("Octal     "+Integer.toString(c,7));

    }
}
