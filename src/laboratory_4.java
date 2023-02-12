import java.util.Scanner;
public class laboratory_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите одномерный массив:");
        int mass = in.nextInt();
        int[] num = new int[mass];
        for(int i = 0; i < mass; i++){
            num[i] = in.nextInt();
        }
        int min = num[0];
        for(int i = 0; i < mass; i++){
            if(min > num[i]){
                min = num[i];
            }
        }
        double srd = 0;
        for(int i = 0; i < mass; i++){
            srd += num[i];
        }
        srd = srd/mass;
        double sum = srd + min;
        System.out.println("Минимальое значение:"+min);
        System.out.println("Среднее арифметическое значение:"+srd);
        System.out.println("Сумма:"+sum);
    }
}
