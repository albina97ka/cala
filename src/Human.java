public abstract class Human {
    private String name;
    private String surname;
    private String patronymic;
    private int birthYear;
    private double salary;

    public Human(String name, String surname, String patronymic, int birthYear, double salary) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
        this.salary = salary;
    }

    public abstract void talk();

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Patronymic: " + patronymic);
        System.out.println("Birth year: " + birthYear);
        System.out.println("Salary: " + salary);
    }
}

