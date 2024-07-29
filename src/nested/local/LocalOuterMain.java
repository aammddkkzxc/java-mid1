package nested.local;

public class LocalOuterMain {
    public static void main(String[] args) {
        LocalOuterV3 local = new LocalOuterV3();
        Printer printer = local.process(3);
        printer.print();
    }
}
