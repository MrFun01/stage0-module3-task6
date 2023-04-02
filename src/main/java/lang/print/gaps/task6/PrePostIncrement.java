package lang.print.gaps.task6;

public class PrePostIncrement {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 12;
        int d = 15;

        // use post-increment operator in the mathematical expression
        int x=1;
        x+=a;
        x+=b;
        x+=c;
        x+=d;
        System.out.println("Expected x is 40, x = " + x);
        // print the updated value of a, b, c, and d
        a+=1;
        c+=1;
        System.out.println("The updated value of a = " + a + ", b = " + b + ", c = " + c + " and d = " + d);

    }
}
