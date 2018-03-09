package reflectionPkg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Test{
    // create private field
    private String s;

    public Test() {
        s="GeeksforGeeks";
    }
    public void method1()
    {
        System.out.println("The String is "+s);
    }
    public void method2(int n)
    {
        System.out.println("The number is "+n);
    }
    private void method3()
    {
        System.out.println("Private method ");
    }
}
public class First {
    public static void main(String[] args) throws NoSuchMethodException {
        Test test=new Test();
        Class cls=test.getClass();

        System.out.println("******************* \n\n Name of the class "+cls.getName());
        Constructor constructor=cls.getConstructor();

        System.out.println("###################  \n\n constructor name is "+constructor.getName());

        System.out.println( "\n methods ");

        Method [] methods=cls.getMethods();
        for(Method method:methods)
            System.out.println(method.getName());
    }
}
