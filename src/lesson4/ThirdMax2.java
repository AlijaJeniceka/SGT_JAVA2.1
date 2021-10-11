package lesson4;

public class ThirdMax2 {
    //not working correctly
    public static void main(String[] args) {
        int [] array = { -2, 2 , -3, 16, 8 };
        int min = array[0];
        for (int item:array
             ) {
            if(min > item){
                min = item;
            }
        }
        int max1 = min;
        int max2 = min;
        int max3 = min;

        for (int item:array
             ) {
            if( item > max1 && item != max1){
                max3 = max2;
                max2 = max1;
                max1 = item;
            }
        }
        System.out.println(max3);
    }
}
