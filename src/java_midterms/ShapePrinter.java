package java_midterms;

public class ShapePrinter {
    public void printTriangle(int height) {
        // 코드를 입력하세요.
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
