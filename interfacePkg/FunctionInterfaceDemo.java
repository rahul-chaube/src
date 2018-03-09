package interfacePkg;

public class FunctionInterfaceDemo {
    public static void main(String[] args) {
        ((AgeCalCulator) () -> System.out.println("Age is " + AgeCalCulator.setAge)).getAge();
    }
}
