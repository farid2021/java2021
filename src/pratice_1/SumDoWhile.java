package pratice_1;

public class SumDoWhile {
    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 50, 40, 10};
        int i = 0;
        int sum = 1;
        do {
            System.out.print(sum);
        } while (i <= 1000);
        {
            sum = sum + i;
            ++i;
        }
    }
}
