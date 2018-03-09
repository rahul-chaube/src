package regExpPkg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitDemo {
    public static final String REGEXP="\\D";
    public static final String INPUT="one1two2three3four4five5six";
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
        Pattern pattern=Pattern.compile(REGEXP);


        String item[]=pattern.split(INPUT);
        for (String i:item
             ) {
            System.out.println(i);

        }

    }
}
