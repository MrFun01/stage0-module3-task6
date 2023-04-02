package lang.print.gaps.task6;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int first = 1;
        int second = 2;
        int eight = 3 + first * second;
        eight+=3;
        System.out.println(eight);//eight is expected to be 8
        boolean firstBool = false;
        boolean secondBool = false;
        boolean thirdBool = true;
        boolean fourthBool = true;
        int varSix = 17;
        varSix-=12;

        System.out.println(firstBool && thirdBool || secondBool && fourthBool || (varSix = 5) < 0);
        System.out.println(varSix);
    }
}
