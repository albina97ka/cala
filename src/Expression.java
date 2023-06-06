import java.util.Scanner;

enum Expression {
    g;
    private double x;
    private double y;
    public double calculate(double x, double y){
        this.x = x;
        this.y = y;
        return (2 * x) + (3 / y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¬ведите значение x: ");
        double x = scanner.nextDouble();

        System.out.print("¬ведите значение y: ");
        double y = scanner.nextDouble();

        Expression expression = Expression.g;
        double result = expression.calculate(x, y);

        System.out.println("–езультат выражени€ 2x + 3/y = " + result);
    }
}
