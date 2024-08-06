package module2_session3;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("nhập số hàng");
        int row = sc.nextInt();
        System.out.println("nhập số ");

        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        int sum = 0;
        int sum2 = 0;


        if (row == col ) {
            for(int i = 0; i < row; i++) {
                for (int j = 0 ; j < col; j++) {
                    System.out.println("nhập giá trị index ví trí thứ i là :" + i +" j  là : " + j);
                    arr[i][j] = sc.nextInt();
                }

            }


            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }


            for (int i = 0; i < row; i++) {


                sum = sum + arr[i][i];
                sum2 += arr[i][col - 1 - i]; // Đường chéo phụ

            }

            System.out.println("tổng đường chéo chính " + sum);
            System.out.println("tổng đường chéo phụ " + sum2);
        } else  {
            System.out.println("ma trận không có vuông");
        }


    }
}
