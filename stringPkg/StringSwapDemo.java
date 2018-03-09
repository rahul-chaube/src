package stringPkg;

public class StringSwapDemo {
    public static void main(String[] args) {
        String str1="rahul";
        String str2="chaube";
        System.out.println("String before swap : a = "+ str1 + " and b ="+str2);

        str1=str1+str2;

        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println("String after swap : a = "+ str1 + " and b ="+str2);


    }
}
