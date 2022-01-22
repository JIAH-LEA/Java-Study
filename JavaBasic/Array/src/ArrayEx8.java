public class ArrayEx8 {

    public static void main(String[] args){

        int[] lottoBall = new int[45];

        for( int i = 0; i < lottoBall.length; i++)
            lottoBall[i] = i+1;

        int temp;
        int j;

        for( int i = 0; i < 6; i++){

            j = (int)(Math.random()*45);

            temp = lottoBall[i];
            lottoBall[i] = lottoBall[j];
            lottoBall[j] = temp;

        }

        for( int i = 0; i < 6; i++)
            System.out.printf("lottoNumber[%d]=%d %n", i, lottoBall[i]);

    }
}
