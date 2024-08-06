package module2_session3;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("hay nhap dong cua mang:");
        int row = sc.nextInt();
        System.out.println("hay nhap cot cua mang:");
        int col = sc.nextInt();
        int[][] array = new int[row][col];
        int max = 0;



        for (int i =0; i < row ; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Hãy nhập giá trị cho index thứ i là : " + i + "và thứ j là : " + j);
                array[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < row ; i ++) {
            for (int j = 0; j < col ; j ++) {
                System.out.print(array[i][j] +"\t");

                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            System.out.println();

        }

        System.out.println("giá trị lớn nhất trong mảng 2 chiều là :" + max);


    }
}
