package lesson4;

public class Initialization {
    public static void main(String[] args) {
        //BAD EXAMPLE, DON'T DO LIKE THIS!!!!!!
        String boopOrWoop;
        boopOrWoop = boop();



        //GOOD, DO LIKE THIS!
        String woopOrBoop = woop();
    }
    static String boop() {
        return "boop";

    }
    static String woop() {
        return "woop";

    }
}
