package module2_session3;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập số hàng của mảng");
        int row = sc.nextInt();

        System.out.println("nhập số cột của ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];


        for (int i = 0 ; i < row ; i ++) {
            for (int j = 0 ; j < col ; j++) {
                System.out.println("Hãy nhập giá trị cho index thứ i là : " + i + "và thứ j là : " + j);
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.print(arr[i][j] +"\t");
            }
            System.out.println();
        }

        System.out.println("nhập vị trí cột muốn  tính tổng từ 0 đến " + (col-1));

        int cot = sc.nextInt();
        int sum = 0;

        if (cot >= 0 && cot < col) {
            for (int i = 0; i < row ; i ++) {
                        sum = sum + arr[i][cot];
                }
            }
        System.out.println("tổng của cột " + cot + "là" + sum);
        }
}
