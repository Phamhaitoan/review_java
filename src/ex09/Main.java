package ex09;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        // Khai báo mảng
        int[] arr = new int[n];

        // Nhập giá trị của các phần tử của mảng
        System.out.println("Nhập giá trị của các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử thứ %d: ", i + 1);
            arr[i] = scanner.nextInt();
        }

        // Nhập chỉ số phần tử cần xóa
        System.out.print("Nhập chỉ số phần tử cần xóa: ");
        int deleteIndex = scanner.nextInt();

        // Kiểm tra chỉ số xóa có hợp lệ không
        if (deleteIndex < 0 || deleteIndex >= n) {
            System.out.println("Chỉ số không hợp lệ.");
        } else {
            // Xóa phần tử tại chỉ số deleteIndex
            for (int i = deleteIndex; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--; // Giảm số lượng phần tử đi 1
            // In mảng sau khi xóa
            System.out.println("Mảng sau khi xóa:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}


