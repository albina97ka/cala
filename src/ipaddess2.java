import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ipaddess2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите IP-адрес: ");
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            try (PrintWriter writer = new PrintWriter(new FileWriter("ip_addresses.txt", true))) {
                writer.println(input);
                System.out.println("IP-адрес записан в файл.");
            } catch (IOException e) {
                System.err.println("Ошибка записи в файл.");
            }
        } else {
            try (PrintWriter writer = new PrintWriter(new FileWriter("ip_addresses.txt", true))) {
                writer.println("Некорректный IP-адрес: " + input);
                System.out.println("Некорректный IP-адрес записан в файл.");
            } catch (IOException e) {
                System.err.println("Ошибка записи в файл.");
            }
        }
    }
}