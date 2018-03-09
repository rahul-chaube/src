package interfacePkg;

class A implements Cloneable
{
    int i;
    String s;
    public A( int i , String s) {
        this.s=s;
        this.i=i;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class ClonableInterfaceDemo {
    public static void main(String[] args) {
        A a=new A(320,"Rahul Chaube ");
        try {
            A b= (A) a.clone();
            System.out.println( "nAME ");

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
