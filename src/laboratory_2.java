import java.util.Scanner;
public class laboratory_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x в диапозоне |x|<1:");
        double x = in.nextDouble();
        if(Math.abs(x)>=1){
            System.out.println("Введите число меньше 1");
        }
        else {
            System.out.println("Введите n:");
            int n = in.nextInt();

            double sum = 0;
            int verh = 1;
            int niz = 1;
            for (int i = n; i > 0; i--) {
                for (int j = 1; j == n; j++) {
                    if (j % 2 == 0) {
                        niz = j * niz;
                    } else {
                        verh = j * verh;
                    }
                }
                sum += (verh * (2 * i - 1) * Math.pow(x, (2 * i + 1))) / (niz * 2 * i * (2 * i + 1));
            }
            System.out.println(Math.PI / 2 - sum);
        }
    }
}
