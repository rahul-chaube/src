package stringPkg;

public class FindCharacterInString {
    public static void main(String[] args) {
        String str="GeeksForGeeks is Computer Science Portal";
        //Return index of first occurance of String
        int firstOccurnce=str.indexOf("i");
        System.out.println("First Occurance of charaster 'i 'is "+firstOccurnce);
        int lastOccurnce=str.lastIndexOf("i");
        System.out.println("last Occurance of charaster 'i 'is "+lastOccurnce);
        int firstAfterOccurnce=str.indexOf("i",18);
        System.out.println("First Occurance after of charaster 'i 'is "+firstAfterOccurnce);

        int lastAfterOccurnce=str.lastIndexOf("i",18);
        System.out.println("last Occurance afterof charaster 'i 'is "+lastAfterOccurnce);

        //give the ascii value of character at location 20

        int chat_at=str.charAt(20);
        System.out.println("character at location 20 : "+chat_at);

        System.out.println("  ######################  ");

        String s="software";
        System.out.println("Found Soft "+s.contains("soft"));
        System.out.println("Found War "+s.contains("war"));
        System.out.println("Found wr :? "+s.contains("wr"));
        System.out.println("Statement start with "+s.startsWith("so"));
        System.out.println("Statement End With "+s.endsWith("ware"));

    }
}
