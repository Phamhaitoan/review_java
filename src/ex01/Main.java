package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập độ dài của mảng: ");
        int N = Integer.parseInt(scanner.nextLine());
        int[] array = new int[N];
        System.out.println("nhập các phần tử của mảng:");
        for (int i = 0; i < array.length; i++) {
            array[i]= scanner.nextInt();
        }
       for(int i : array){
           System.out.println(i);
       }
    }
}
