package java_midterms;

public class Main_sharepointer {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        // 테스트
        printer.printTriangle(3);
        System.out.println("----------");
        printer.printTriangle(5);
        System.out.println("----------");
        printer.printTriangle(10);
    }
}
