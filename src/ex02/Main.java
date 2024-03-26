package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập độ dài của mảng: ");
        int N = Integer.parseInt(scanner.nextLine());
        double[] array = new double[N];
        System.out.println("nhạp các phần tử của mảng");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextDouble();
        }
        double sum = 0;
        for (double i : array ){
            sum += i;
        }
        double average = sum/N;
        System.out.println(average);
    }
}
