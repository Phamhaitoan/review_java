package ex06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số phần tử cảu mảng");
        int n = scanner.nextInt();
        int[] array = new int[n];
//        nhập các giá trị của maảng
        System.out.println("hãy nhập các giá trị");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
//        nhập gái trị cần tìm
        System.out.println("nhập giá trị cần tìm");
        int findNumber = scanner.nextInt();
//        tìm chỉ số va tổng
        int sum = 0;
        System.out.println("chỉ số các phần tử có giá trị bằng " + findNumber + ":");
        for (int i = 0; i < n; i++) {
            if (array[i] == findNumber){
                System.out.print(i + "");
                sum += array[i];
            }
        }
        System.out.println("\n Tổng các phần tử có giá trị bằng" + findNumber + "là :" + sum);

    }
}
