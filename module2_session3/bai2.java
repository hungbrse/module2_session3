package module2_session3;

import java.util.Arrays;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {

//

        Scanner sc = new Scanner(System.in);

        int[]  array = {10,4,6,7,8,6,0,0,0,0};

        System.out.println("Nhập số cần trèn:");
        int number = sc.nextInt();
        System.out.println("Nhập vị trí cần trèn 0-9:");
        int position = sc.nextInt();

        int countNoValue = 0;

        for (int i = 0; i < array.length; i++) {
            if (position < 0 || position > array.length) {
                System.out.println("Không chèn được phần tử vào mảng");
            }

            if (array[i] == 0) {
                countNoValue++;
            }
        }

        int[] newArr = new int[array.length - countNoValue + 1];

        for (int i = 0; i < newArr.length; i++) {

            if(i < position) {
                newArr[i] = array[i];
            } else if(i == position) {
                newArr[i] = number;
            } else {
                newArr[i] = array[i - 1];

            }
        }

        System.out.println(Arrays.toString(newArr));
    }
}
