package lesson4.homeTask;

public class ToRoman {

    public static String toRoman(int inputNum){
     //Integer array with arabic numerals
    int[] arabic = { 1000,  900,  500,  400,  100,   90,
            50,   40,   10,    9,    5,    4,    1 };
    //String array with romans numerals
    String[] romans = { "M",  "CM",  "D",  "CD", "C",  "XC",
            "L",  "XL",  "X",  "IX", "V",  "IV", "I" };
    //The result string with romans
    String romanNum = "";
    String error = "The number must be range from 1 to 3999";
    if (inputNum < 1 || inputNum > 3999){
        return error;
    }
    //loop
        for (int i = 0; i < arabic.length; i++) {
            int number = inputNum / arabic[i];

            for (int j = 0; j < number; j++) {
                romanNum += romans[i];
            }
            inputNum = inputNum % arabic[i];
        }
    return romanNum;
}
    public static void main(String[] args) {
        int inputNum = 1994;
        String romanNum = toRoman(inputNum);
        System.out.println(romanNum);

        int inputNum1 = 58;
        String romanNum1 = toRoman(inputNum1);
        System.out.println(romanNum1);

        int inputNum2 = 59999;
        String romanNum2 = toRoman(inputNum2);
        System.out.println(romanNum2);
    }
}
