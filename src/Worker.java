public class Worker extends Human {
    public Worker(String name, int birthYear, int salary) {
        super(name, birthYear, salary);
    }

    @Override
    public void printInfo() {
        System.out.println("Работник: " + getName() + " родилась в " + getBirthYear() + " году и имеет зарплату " + getSalary() + " рублей.");
    }
}