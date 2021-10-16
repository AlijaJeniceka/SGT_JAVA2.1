package lesson4.homeTask;

public class myAtoi {

    public static int myAtoi(String s) {

        int i = 0;
        double res = 0;
        // Check that there is something written at the string s.
        if (s.length() == 0) {
            return 0;
        }
        //Ignore the whitespaces.
        s = s.replaceAll("^\\s+", "");
        //Check if there is - or +;
       boolean isNegative = s.startsWith("-");
       boolean isPositive = s.startsWith("+");
       if (isNegative){
           i++;
       } else if (isPositive){
           i++;
       }

        while( i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <='9'){
            res = res * 10 + (s.charAt(i) - '0');
            i++;
        }
        res = isNegative ? -res : res;
        if (res <= Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        if(res >= Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        return (int) res;
    }
    public static void main(String[] args) {

        String s = "    -990999kns";
        String s1 = "34567889543211524";
        String s2 = "-00123";
        int res = myAtoi(s);
        int res1 = myAtoi(s1);
        int res2 = myAtoi(s2);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
    }
}
