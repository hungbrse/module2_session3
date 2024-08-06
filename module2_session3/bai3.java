package module2_session3;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {

        int[] arr1 = new int[10];
        int[] arr2 = new int[7];
        int[] arr3 = new int[arr1.length + arr2.length];
        int index = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr1.length ; i++) {
            System.out.println("nhập index thứ" + i );
            int num = sc.nextInt();
            arr1[i] = num;
        }

        for (int i = 0; i < arr2.length ; i++) {
            System.out.println("nhập index thứ" + i );
            int num = sc.nextInt();
            arr2[i] = num;
        }



        for (int i = 0; i < arr1.length ; i++) {
            arr3[index++] = arr1[i];
        }

        for (int i = 0; i < arr2.length ; i++) {

            arr3[index++] = arr2[i];

        }

        for (int i = 0; i < arr3.length ; i++) {
            System.out.println(arr3[i]);
        }
    }
}
