package lesson9;

public class NestedClasses {
    //INNER class
    public class InnerClass{
        public String printInnerClass(){
            System.out.println("This is inner class");
            return "some String returned";
        }
    }
    public String printSmthFromNestedClass(){
        InnerClass inner = new InnerClass();
        return inner.printInnerClass();
    }
}
class MainApplication{
    public static void main(String[] args) {
      //  NestedClasses.InnerClass;
    }
}
