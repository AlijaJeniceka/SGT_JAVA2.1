package lesson9;

public final class FinalClasses {

    private int someInt;

    /**
     *
     * @param anotherInt
     * @return
     */
    public int multiplyBySomeInt(int anotherInt){
        return someInt * anotherInt;
    }
}
//We cannot extend Final classes

//class ExtendedFinalClasses extends FinalClasses{}
