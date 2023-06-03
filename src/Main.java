import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        try {
            Scanner scanner = new Scanner(inputFile);
            PrintWriter writer = new PrintWriter(outputFile);

            boolean inMultilineComment = false; // флаг для отслеживания многострочных комментариев

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                // проверяем, не начинается ли строка с многострочного комментария
                if (line.trim().startsWith("/*")) {
                    inMultilineComment = true;
                }

                if (!inMultilineComment) {
                    // удаляем однострочные комментарии
                    line = line.replaceAll("//.*", "");
                    writer.println(line);
                } else {
                    // проверяем, заканчивается ли строка многострочным комментарием
                    if (line.trim().endsWith("*/")) {
                        inMultilineComment = false;
                    }
                }

                // удаляем любые оставшиеся многострочные комментарии
                if (inMultilineComment) {
                    line = "";
                } else {
                    // удаляем многострочные комментарии внутри строки
                    Pattern pattern = Pattern.compile("/\\*.*?\\*/", Pattern.DOTALL);
                    Matcher matcher = pattern.matcher(line);
                    line = matcher.replaceAll("");
                }

                writer.println(line);
            }

            scanner.close();
            writer.close();

            System.out.println("Комментарии успешно удалены и код записан в файл output.txt");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файлов: " + e.getMessage());
        }
    }
}
