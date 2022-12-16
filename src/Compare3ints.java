

public class Compare3ints {

    public static int findTheBiggestOf3(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        if (b > c) {
            return b;
        }
        return c;
    }

    public static int findTheSmallestOf3(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        }
        if (b < c) {
            return b;
        }
        return c;
    }

}
