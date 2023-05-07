public class Director extends Human {
    private String company;

    public Director(String name, String surname, String patronymic, int birthYear, double salary, String company) {
        super(name, surname, patronymic, birthYear, salary);
        this.company = company;
    }

    public void talk() {
        System.out.println("I am the director of " + company);
    }
}
