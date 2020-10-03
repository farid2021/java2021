package pratice_1;

public class SumOfArray {
    public static void main( String args[]){
        int[] array = {10, 30, 20, 50, 40, 10 };
        int sum = 0;
        for(int num : array){
            sum = sum + num;

        }
        System.out.println("Сумма элементов массива равна:" + sum);
    }

}
