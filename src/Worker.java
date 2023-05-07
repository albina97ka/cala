public class Worker extends Human {
    private String position;

    public Worker(String name, String surname, String patronymic, int birthYear, double salary, String position) {
        super(name, surname, patronymic, birthYear, salary);
        this.position = position;
    }

    public void talk() {
        System.out.println("I am a " + position);
    }
}
