public class solution {

    public static int factorial(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }

    public static void main(String[] args) {
        int a = 2;
        int result = factorial(a);
        System.out.println(result);
    }
}
