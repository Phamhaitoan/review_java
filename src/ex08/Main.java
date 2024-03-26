package ex08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử cảu mảng");
        int n = scanner.nextInt();
        int[] array = new int[n];
//        nhập các giá trị của mảng
        System.out.println("hãy nhập các giá trị");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        // Nhập giá trị và chỉ số cần cập nhật
        System.out.print("Nhập chỉ số của phần tử cần cập nhật: ");
        int updateIndex = scanner.nextInt();
        System.out.print("Nhập giá trị mới: ");
        int updateValue = scanner.nextInt();
    }
}
