package lesson8.task1;

public class Main {
    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        ChildClass childClass = new ChildClass();

        //1 - method of parent class by object of parent class
        ParentClass.whatClassIsThis();

        //2-method od child class by object of child class
        childClass.whatClassIsThisOne();

        //3 - method of parent class by object of child class
        childClass.whatClassIsThis();
    }
}
