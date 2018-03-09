package exceptionPackage;

public class MyExceptionClass extends Exception{
    public static int accono[]={1001,1002,1003,1004,1005};
    private static String name[]={"Rahul","swati","jayesh","Anjali","Yasmeen"};
    private static double bal[]={1000.00,12000.0,5600.00,999.000,1100.00};
    MyExceptionClass(){}
    MyExceptionClass(String str){super(str);}

    public static void main(String[] args) {
        try {
            for (int i = 0; i <accono.length ; i++) {
                System.out.println(accono[i]+"\t"+name[i]+"\t"+bal[i]);
                if (bal[i]<1000)
                {
                    MyExceptionClass ms=new MyExceptionClass("Balance is less than 1000");
                    throw ms;
                }
            }

        }catch (MyExceptionClass e)
        {
            System.out.println( (e.getCause() instanceof MyExceptionClass) +" "+e.getMessage());
        e.printStackTrace();
        }
    }
}
