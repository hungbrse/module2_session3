package module2_session3;

public class bai8 {
    public static void main(String[] args) {

        String chuoi ="anhyeuem321 abcxyz";


        char kyTu = 'a';

        int count = 0;


        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
        }

        System.out.println(count);


    }
}
