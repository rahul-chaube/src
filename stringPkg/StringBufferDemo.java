package stringPkg;

import com.sun.org.apache.xpath.internal.SourceTree;

public class StringBufferDemo {
    public static void main(String[] args) {
        System.out.println("String Buffered demo\n " +
                "======================== length and capacity  ======================= ");
        StringBuffer sb=new StringBuffer();
        StringBuffer sb1=new StringBuffer("GreeksForGreek");
        StringBuffer sb2=new StringBuffer(20);
        StringBuffer sb3=new StringBuffer ("rahul chaube swati ");

        System.out.println("String Buffer Default size "+sb.capacity());
        System.out.println("String length sb1  "+sb1.length()+" capacity of buffer is "+sb1.capacity());
        System.out.println("String length sb2  "+sb2.length()+" capacity of buffer is "+sb2.capacity());
        System.out.println("String length sb3  "+sb3.length()+" capacity of buffer is "+sb3.capacity());
        System.out.println( " \n\n " +
                "========================= Buffer append  ============================= ");
        StringBuffer sb4=new StringBuffer("GreekFor");
        sb4.append("Greek");
        System.out.println("Appended String is "+sb4);
        sb4.append(1);
        System.out.println("Integer Append is "+sb4);

        System.out.println("\n\n" +
                "======================== Buffer Insert  =============================== ");
        StringBuffer sb5=new StringBuffer("GreeksGreeks");
        sb5.insert(5,"For");
        System.out.println(sb5);

        System.out.println("\n\n " +
                "======================== Buffer Reverse =============================== ");
        StringBuffer sb6=new StringBuffer("GreeksForGreeks");
        System.out.println("Original String is "+sb6);
        sb6.reverse();
        System.out.println( "Reverse String is "+sb6);

        System.out.println("\n\n " +
                "========================= Buffer Delete ================================ ");
        StringBuffer sb7=new StringBuffer("GreeksForGreek");
        sb7.delete(0,5);
        System.out.println(sb7);
        sb7.deleteCharAt(0);
        System.out.println(sb7);

        System.out.println("\n\n " +
                "========================= Buffer Replace ================================ ");
        StringBuffer sb8=new StringBuffer("GeeksForGeeks");
        sb8.replace(5,8,"are");
        System.out.println(sb8);


    }
}
