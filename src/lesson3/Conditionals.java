package lesson3;

public class Conditionals {
    public static void main(String[] args) {
        String myName = "Aliya";

        if( myName == "Aliya") {
            System.out.println("Yes indeed!");
        }else {
            System.out.println("Nope, it is not.");

        }

        String whatIsMyName =  myName == "Aliya" ? "It is Aliya" : "It is not Aliya";
        System.out.println(whatIsMyName);
        whatIsMyName =  myName == "Alina" ? "It is Aliya" : "It is not Aliya";
        System.out.println(whatIsMyName);

        System.out.println(oddOrEven1(7));
        System.out.println(oddOrEven2(7));
    }
    static String  oddOrEven1(int number) {
        if (number%2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }
    static String  oddOrEven2(int number) {
        return number % 2 == 0 ? "even" : "odd";
    }

}
