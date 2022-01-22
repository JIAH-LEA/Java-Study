import java.util.Arrays;

public class ArrayEx7 {

    public static void main(String[] args) {

        int[] numArr = new int[10];

        for(int i = 0; i < numArr.length; i++){

            numArr[i] = i;
            System.out.print(numArr[i]);
        } // 0123456789
        System.out.println();

        for(int j = 0; j < numArr.length; j++){

            int n = (int)(Math.random()*10); //임의의 정수 0-9
            int temp = numArr[j];
            numArr[j] = numArr[n];
            numArr[n] = temp;

        }

        System.out.println(Arrays.toString(numArr)); // [1, 7, 5, 2, 4, 3, 6, 0, 8, 9]

    }
}
