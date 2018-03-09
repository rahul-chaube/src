package regExpPkg;

import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HashelTest {

    public static void main(String[] args) {
        Console console=System.console();
        if (console==null)
        {
            System.out.println("Console Not found ");
            System.exit(1);

        }
        while(true)
        {
            Pattern pattern=Pattern.compile(console.readLine("Enter your regexp "),Pattern.CASE_INSENSITIVE);

            Matcher matcher=pattern.matcher(console.readLine("Enter input string to search "));
            boolean found=false;
            console.format("Total count ======== %d \n\n\n ",matcher.groupCount());
            while (matcher.find())
            {
                console.format("I found text " +
                        "\"%s\" starting at " +
                           "index %d and ending at index %d.%n",matcher.group(),matcher.start(),matcher.end());
                        found=true;
                        console.format("\n\n**************** \n\n");
            }
            if (!found)
                console.format("No match found\n************************ \n\n\n");
        }
    }
}
