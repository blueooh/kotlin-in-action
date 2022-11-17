package genericTest;

public class Main {
    public static void main(String[] args) {
        GenericTest genericTest = new GenericTest();
        genericTest.init();
        genericTest.printAll(genericTest.getItems());
        genericTest.printAll2(genericTest.getItems());
    }
}
