public class ArrayEx6 {

    public static void main(String[] args){

        int[] score = { 45, 24, 100, 64, 73, 97};

        int max = score[0];
        int min = score[0];

        for (int j : score) {

            if (j > max)
                max = j;

            else if (j < min)
                min = j;
        }

        System.out.println("max: "+ max); // max: 100
        System.out.println("min: "+ min); // min: 24

    }
}
