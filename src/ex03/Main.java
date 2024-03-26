package ex03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        nhập số hàng và cột cuủa ma trận
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số hàng của ma trận");
        int r = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào số cột của ma trận");
        int c = Integer.parseInt(scanner.nextLine());
//       khơởi tạo ma trận
        int[][] matrix = new int[r][c];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("matrix[%d][%d] = ",i,j);
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
