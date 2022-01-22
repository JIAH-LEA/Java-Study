import java.util.Arrays;

public class ArrayEx10 {

    public static void main(String[] args){

        int[] numArr = new int[10];

        for( int i = 0; i < numArr.length; i++){
            numArr[i] = (int)(Math.random() * 10);
        }
        System.out.println(Arrays.toString(numArr));

        // 버블정렬 알고리즘(오름차순) : 근접한 값(첫번째 부터 n-1에 대해)과의 크기 비교
        // 반복횟수 : arr.length-1
        for( int i = 0; i < numArr.length-1; i++){

            boolean flag = false;

            for( int j = 0; j < numArr.length-1-i; j++){

                if( numArr[j] > numArr[j+1] ) {

                    int temp = numArr[j];
                    numArr[j] = numArr[j + 1];
                    numArr[j + 1] = temp;
                    flag = true;

                }
            }

            if(!flag) // 정렬이 완료되었으면 for문 그만 돌려!
                break;

            System.out.println(Arrays.toString(numArr));
        }
    }
}
