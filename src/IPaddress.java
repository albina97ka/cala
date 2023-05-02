import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPaddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("^(([1-9]|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}([1-9]|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])$");
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            System.out.println("Найденный IP-адрес: " + matcher.group());
        } else {
            System.out.println("IP-адрес не найден");
        }
    }
}
