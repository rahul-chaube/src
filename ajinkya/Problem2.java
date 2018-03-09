package ajinkya;

public class Problem2 {
    public static void main(String[] args) {
        for (int i = 100; i <= 500; i++) {
            if (i%5==0 && i%11==0)
            {
                System.out.println("cool dude" +i);
            }
            else if (i%11==0)
            {
                System.out.println("dude "+i);
            }
            else if (i%5==0 )
            {
                System.out.println("cool "+i);
            }

        }
    }
}
