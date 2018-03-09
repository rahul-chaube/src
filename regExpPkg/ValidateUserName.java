package regExpPkg;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true)
        {
            String patterne="^[a-zA-Z]\\w{7,30}";
            String input="A\n" +
                    "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
//            System.out.println("Enter Expression ");
//            String regExp=scanner.nextLine();
//            System.out.println("Enter Input line ");
//            String input=scanner.nextLine();
            Pattern pattern=Pattern.compile(patterne);
            Matcher matcher=pattern.matcher(input);
            System.out.println("Matched is "+matcher.matches());


        }
    }
}
