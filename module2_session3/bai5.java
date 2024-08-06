package module2_session3;

public class bai5 {
    public static void main(String[] args) {

        int[] arr = {100,112,22233,34,513,1316,700,8,9};


        int min = arr[0];

        for (int i = 1; i < arr.length ; i ++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("giá trị nhỏ nhất là : " + min);
     }
}
