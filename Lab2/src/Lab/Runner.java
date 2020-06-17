package Lab;
import Lab.Matrix;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Matrix m = new Matrix();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put dimension of the matrix [n][n]");
        int n = scanner.nextInt();
        m.workMatrix(n);
    }
}
