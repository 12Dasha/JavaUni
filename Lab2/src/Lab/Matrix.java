package Lab;
import java.util.Scanner;
public class Matrix {

    public void workMatrix(int n) {
         String[][] matrixone = new String[n][n];
        String matrix[][] = new String[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                matrix[i][j] = String.valueOf((int)Math.round((Math.random()*2*n)-n));
                matrixone[i][j] = matrix[i][j];
            }
        System.out.println("Вот ваша матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = Integer.valueOf(matrixone[i][j]);
                System.out.printf("%d", value);
                value = 0;
                System.out.print("   ");
            }
            System.out.println('\n');
        }
        int r = 0;
        int a = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = Integer.valueOf(matrixone[i][j]);
                r += Math.abs(value);
            }
            if(r>a)
                a=r;
        }
        System.out.println("Норма введенной матрицы равна: ");
        System.out.println(a);
    }
}
