package module2_session3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};

        System.out.println("Nhập số cần xóa:");
        int deleteValue = sc.nextInt();

        // Tạo mảng mới có cùng kích thước với mảng cũ
        int[] newArray = new int[array.length];
        int k = 0; // Biến đếm cho mảng mới

        // Sao chép các phần tử không phải là deleteValue vào mảng mới
        for (int i = 0; i < array.length; i++) {
            if (array[i] != deleteValue) {
                newArray[k++] = array[i];
            }
        }

        // In các phần tử hợp lệ của mảng mới
        for (int i = 0; i < k; i++) {
            System.out.print(newArray[i] + "\t");
        }
    }
}
