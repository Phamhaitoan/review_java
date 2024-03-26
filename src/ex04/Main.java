package ex04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập độ dài của mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        System.out.println("nhạp các phần tử của mảng");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int max =  array[0];
        int min =  array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }
        //            in ra giá trị lớn nhất
        System.out.println("giá trị lớn nhất là:" + max);
        System.out.println("giá trị nhỏ nhất là:" + min);
    }
}
