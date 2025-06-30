package ClassesProject;

public class EmployeeTemporary extends Employee {
    private Float hoursWorked;



    public EmployeeTemporary(String name, Integer age, String cpf, Float Salary, Float hoursWorked) {
        super(name, age, cpf, Salary);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculateSalary () {
        setSalary(getSalary() + (getHoursWorked() * 45 ));
        //salário base + (horas trabalhadas × valor da hora)
        System.out.println("Salary with bonus: " + getSalary());
    }

    public void status () {
        System.out.println("Name: " +  this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Salary: " + this.getSalary());
    }


    public Float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
