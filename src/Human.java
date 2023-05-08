public abstract class Human {
    private String name;
    private int birthYear;
    private int salary;

    public Human(String name, int birthYear, int salary) {
        this.name = name;
        this.birthYear = birthYear;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getSalary() {
        return salary;
    }

    public abstract void printInfo();
}
