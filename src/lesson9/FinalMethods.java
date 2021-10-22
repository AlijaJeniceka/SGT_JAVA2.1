package lesson9;

public class FinalMethods {
    private int someVAr;

    //During declaration use initialization
    final int CONSTANT_PI = 3;
   final int CONSTANT_NOINIT; //If you not declare it in initialization, than put the initialization
    //in each constructor.
//    CONSTANT_NOINIT = 5;

    public FinalMethods() {
        CONSTANT_NOINIT = 5;
    }

    //or in argument constructor, but only once!


    public FinalMethods(int someVAr) {
        CONSTANT_NOINIT = 6;
        this.someVAr = someVAr;
    }

    public final void printHello(){
        System.out.println("Hello!");
    }
}
//class ExtendedFinalMethods extends FinalMethods{


    //FINAL methods cannot be overriden
//    @Override
//  public void  printHello() {
//        System.out.println("Bye");
//    }

