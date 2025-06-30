package ClassesProject;

public abstract class Employee extends Person{
private Float salary;

    public Employee(String name, Integer age, String cpf, Float salary) {
        super(name, age, cpf);
        this.salary = salary;
    }

    public abstract void calculateSalary();

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }
}
