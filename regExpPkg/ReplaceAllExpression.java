package regExpPkg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceAllExpression {
    private static String REGEX="<[^>]*>";
    private static String Input="<h1>The dog say meow. All DOG say meow</h1>";
    private static String Replace="";
    public static void main(String[] args) {
        Pattern pattern =Pattern.compile(REGEX,Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(Input);
        Input=matcher.replaceAll(Replace);
        System.out.println(Input);

    }
}
