public class Main10 {
    public static void main(String[] args) {
        Director director = new Director("Орлова София Кирилловна", 2000, 120000);
        Manager manager = new Manager("Русанов Макар Платонович", 1995, 56000);
        Worker worker = new Worker("Тарасова Анастасия Назаровна", 1999, 20000);

        director.printInfo();
        manager.printInfo();
        worker.printInfo();
    }
}
