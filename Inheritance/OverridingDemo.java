package Inheritance;

interface Parent1 {
    void m1();
    void m3();
}

interface Parent2 {
    void m2();
    void m4();
}

class subClass implements Parent1, Parent2 {

    @Override
    public void m1() {
        System.out.println("Interface Function 1");

    }

    @Override
    public void m3() {
        System.out.println("Interface Function 1");
    }

    @Override
    public void m2() {
        System.out.println("Interface Function 1");
    }

    @Override
    public void m4() {
        System.out.println("Interface Function 1");

    }
}

class OverridingDemo extends subClass {
    public static void main(String[] args) {

    }


}
