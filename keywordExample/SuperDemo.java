package keywordExample;

  class Parent{
    Parent()
    {
        System.out.println("Parent is called me ");
    }
}
public class SuperDemo extends Parent{
      SuperDemo()
      {
          System.out.println("I am Child demo ");
      }
    public static void main(String[] args) {
       SuperDemo superDemo=new SuperDemo();
    }
  }
