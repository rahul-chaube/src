package stringPkg;

public class StringDemo {
    public static void main(String[] args) {
        String s="GreeksforGreek";
        System.out.println("String length "+s.length());
        //return the character at indexOf
        System.out.println("Character at 3rd position"+s.charAt(3));
        //return the substring from ith index from end of string
        System.out.println("SubString "+s.substring(5));
        // return the substring from i to j-1 index
        System.out.println("Substring 3-5 "+s.substring(3,5));
        //concatenate string2 to the end of the string 1
        String s1="rahul"; String s2="chaube";
        System.out.println("Concatenate "+s1.concat(s2));
        //return the index withing the string of
        // the first occurrence of the specified
        // string starting at the specified string
        String s4="Learn share Lear";
        System.out.println("Index of share "+s.indexOf("share"));
        //Return the index withing the string of the first
        // character occurrence of the specified string.
        // starting at specified index .
        System.out.println("Index of a ="+s4.indexOf('a',3));
        //checking equality of string
        boolean out="Greek".equals("greek");
        System.out.println("Checking Equality "+out);
        //Converting case
        String word2="Rahul Chaube";
        System.out.println("Changing to uppercase "+word2.toUpperCase());
        //Converting case
        System.out.println("Changing to Lowercase "+word2.toLowerCase());
        //Trimming the word
        String word3="  Learn share Learn  ";
        System.out.println(word3.trim());
        //Replacing character
        String str1="freeksforfreeks";
        System.out.println("Original String "+str1);
        String str2=str1.replace("f","g");
        System.out.println("Replace f with g -> "+str2);
    }
}
