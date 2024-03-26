package ex05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số hàng của ma trận");
        int r = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào số cột của ma trận");
        int c = Integer.parseInt(scanner.nextLine());
// khởi tạo ma trận số thựuc
        double[][] matrix = new double[r][c];

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
// tính tổng và in ra các phần tử chắn
        double sumEven = 0;
        for (int i = 0; i < r ; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] % 2 == 0){
                    System.out.println("phần tử ["+ i +"]phần tử [" + j + "]" + matrix[i][j]);
                    sumEven += matrix[i][j];
                }
            }
        }
        System.out.println("tổng các phàn tử là" + sumEven);
    }
}
