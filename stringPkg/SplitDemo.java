package stringPkg;

import java.util.Scanner;

public class SplitDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter The Regular Expression ");
            String regExp=scanner.nextLine();
            System.out.println("Enter your String ");
            String string=scanner.nextLine();
            System.out.println("Enter Split Limit ");
            int limit= scanner.nextInt();
            scanner.nextLine();

            String  [] arrstr=string.split(regExp,limit);
            for(String str:arrstr)
            {
                System.out.println(str);
            }


        }
    }
}
