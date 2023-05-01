import java.util.Scanner;

public class calculate {
    public double calculat1(double x) {
        return 3 * x + 5;
    }

    public double calculat2(double a, double b) {
        return (a + b) / (a - b);
    }

    public double calculat3(double a, double x, double b) {
        double ax = a * x;
        double result = 1;

        for (double i = ax / b; i > 0; i--) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        calculate calc = new calculate();

        System.out.print("Выражение 3x+5, введите значение для x: ");
        double x = scanner.nextDouble();
        double y1 = calc.calculat1(x);
        System.out.println("Y1 = " + y1);

        System.out.print("Выражние (a+b)/(a-b), введите значение для a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите значение для b: ");
        double b = scanner.nextDouble();
        double y2 = calc.calculat2(a, b);
        System.out.println("Y2 = " + y2);

        System.out.print("Выражение (ax/b)!, введите значение для a: ");
        a = scanner.nextDouble();
        System.out.print("Введите значение для b: ");
        b = scanner.nextDouble();
        System.out.print("Введите значение для x: ");
        x = scanner.nextDouble();
        double y3 = calc.calculat3(a, b, x);
        System.out.println("Y3 = " + y3);

    }
}

