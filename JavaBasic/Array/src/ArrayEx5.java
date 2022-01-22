public class ArrayEx5 {

    public static void main(String[] args){

            int sum = 0;
            float average;

            int[] score = {100, 90, 88, 92, 90, 60};

            for (int j : score) {
                sum += j;
            }

            System.out.println("총점: "+ sum); // 총점: 520

            average = sum / (float)score.length;

            System.out.println("평균: "+ average); //  평균: 86.666664

    }
}
