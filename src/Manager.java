public class Manager extends Human {
    public Manager(String name, int birthYear, int salary) {
        super(name, birthYear, salary);
    }

    @Override
    public void printInfo() {
        System.out.println("Начальник отдела: " + getName() + " родился в " + getBirthYear() + " году и имеет зарплату " + getSalary() + " рублей.");
    }
}