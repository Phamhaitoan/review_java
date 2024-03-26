package ex07;

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
//        nhập giá trị và chỉ số cần chèn
        System.out.println("nhập giá trị cần chèn");
        int addValue = scanner.nextInt();
        System.out.println("nhập chỉ số cần chèn");
        int addIndex = scanner.nextInt();
//        thêm chèn giá trị và chỉ sô

        // Thực hiện thêm chèn giá trị addValue và chỉ số addIndex của mảng
        while (addIndex < 0 || addIndex > n) {
            System.out.println("Chỉ số addIndex không hợp lệ, vui lòng nhập lại.");
            System.out.print("Nhập chỉ số muốn chèn phần tử (addIndex): ");
            addIndex = scanner.nextInt();
        }

        // Tạo mảng mới có kích thước lớn hơn 1 và chèn giá trị vào chỉ số addIndex
        int[] newArr = new int[n + 1];
        for (int i = 0, j = 0; i < n + 1; i++) {
            if (i == addIndex) {
                newArr[i] = addValue;
            } else {
                newArr[i] = array[j];
                j++;
            }
        }

        // Hiển thị mảng mới
        System.out.println("Mảng mới sau khi chèn:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }



    }
}