package interfacePkg;

public class AnonymousDemo {
    public static void main(String[] args) {
        Age age=new Age() {
            @Override
            public void getAge() {
                System.out.println("User Age is "+x);
            }

            @Override
            public void setAge(int age) {
                System.out.println("Set Age is "+age);
            }
        };
        age.getAge();
        age.setAge(45);
    }
}
