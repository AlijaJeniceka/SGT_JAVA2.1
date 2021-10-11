package lesson4;

public class Scopes {
    static final int SOME_CONSTANT = 314;
    static int globalResult = 0;
    public static void main(String[] args) {

        int someNumber = SOME_CONSTANT;
        //Only this - to pass the value as an argument
        //to a method
        int someResult =  multiplyByFive(someNumber);
        System.out.println(someResult);


        //Bad example
        multiplyByFiveGlobal(5);
        multiplyByTwol(2);
        System.out.println(globalResult);


    }
    static int scopeVisible(int someNumber){
        boolean visibleInsideMethod = true;

        return someNumber *2;

    }
    static int multiplyByFive(int number){
        int five = 5;
        globalResult = number *five;
        return number *five;
    }
    //AVOID use global variables
    static void  multiplyByFiveGlobal(int number){
        int five = 5;
        globalResult = number *five;

    }
    static void  multiplyByTwol(int number){
        int two = 2;
        globalResult = number *two;

    }
}
