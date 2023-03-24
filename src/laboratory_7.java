import java.util.Scanner;
public class laboratory_7 {

    class Calc {
        double a;
        double b;
        double x;
        double y;

        Calc(double[] array) {
            this.a = array[0];
            this.b = array[1];
            this.x = array[2];
        }

        double formula1() {
            y = 3 * x + 5;
            return 0;
        }

        double formula2() {
            if (a - b != 0) {
                y = (a + b) / (a - b);
            } else {
                System.out.println("На ноль делить нельзя");
            }
            return 0;
        }

        double formula3() {
            if (b != 0) {
                double c = a * x / b;
                if (c % 1 == 0) {
                    int n = 1;
                    for (int i = 1; i <= c; i++) {
                        y = n * i;
                    }
                }
                else {}
            }
            else {
                System.out.println("Ошибка");
            }
            return 0;
        }
        class MAIN {
            public static double[] filler() {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите числа");
                double[] result = new double[3];
                for (int i = 0; i < 3; i++) {
                    result[i] = in.nextDouble();
                }
                return result;
            }

            public void main(String args[]) {
                Calc calc1 = new Calc(filler());
                Calc calc2 = new Calc(filler());
                Calc calc3 = new Calc(filler());
                Calc[] arr = {calc1, calc2, calc3};

                for (Calc i : arr) {
                    System.out.println(i.formula1());
                    System.out.println(i.formula2());
                    System.out.println(i.formula3());
                }
            }
        }
    }
}

