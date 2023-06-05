import java.io.*;

public class MyClass implements Serializable {
    private double x;
    private double y;

    public MyClass(double x) {
        this.x = x;
        this.y = x - Math.sin(x);
    }

    public void calculate() {
        this.y = x - Math.sin(x);
    }

    public double getY() {
        return y;
    }

    public void saveToFile() {
        try {
            FileOutputStream fileOut = new FileOutputStream("savedData.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
            System.out.println("Данные сохранены в savedData.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static MyClass loadFromFile() {
        MyClass obj = null;
        try {
            FileInputStream fileIn = new FileInputStream("savedData.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            obj = (MyClass) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("Класс MyClass не найден");
            c.printStackTrace();
            return null;
        }
        return obj;
    }

    public static void main(String[] args) {
        MyClass obj;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        System.out.print("Введите число: ");
        try {
            double x = Double.parseDouble(reader.readLine());
            obj = new MyClass(x);
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("Результат: " + obj.getY());
        while (true) {
            System.out.print("Введите одну из команд (save, upload, exit): ");
            try {
                input = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
            switch (input) {
                case "save":
                    obj.saveToFile();
                    break;
                case "upload":
                    obj = MyClass.loadFromFile();
                    if (obj == null) {
                        System.out.println("Не удалось загрузить данные из savedData.ser");
                        return;
                    }
                    System.out.println("Результат: " + obj.getY());
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Недопустимая команда");
            }
        }
    }
}