package lesson4;

public class ThirdMaximum {
    public static void main(String[] args) {

        int[] array = {14, -5, 0, -2};

        int max = array[0];
        int min = array[0];
        for ( int item:array ) {
            if (item >= max){
                max = item;
            }
            if(item <= min){
                min = item;

            }}

        int secondMax = min;
        for ( int item :array ) {
            if (item  > secondMax && item < max  ){
                secondMax = item;
            }}

        int thirdMax = min;
        for ( int item :array ) {
            if (item > thirdMax  && item < secondMax){
                thirdMax = item;
            }
        }
        System.out.println("The third maximums is: " + thirdMax);
    }
}
