import java.util.Scanner;
public class laboratory_5 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сколько чисел нужно отсортировать");
        int num = in.nextInt();
        int[] sortArr = new int[num];
        System.out.println("Введите числа");
        int k;
        for (int i = 0; i < sortArr.length; i++) {
            sortArr[i] = in.nextInt();
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                if (sortArr[j + 1] < sortArr[j]) {
                    k = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = k;
                }
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print(sortArr[i] + " ");
        }
    }
}
