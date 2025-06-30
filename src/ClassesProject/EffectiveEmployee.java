package ClassesProject;

public class EffectiveEmployee extends Employee {


    public EffectiveEmployee(String name, Integer age, String cpf, Float Salary) {
       super(name, age, cpf, Salary);
    }

    @Override
    public void calculateSalary () {
        setSalary(getSalary() + 500);
        System.out.println("Salary with bonus: " + getSalary());
    }

    public void status () {
        System.out.println("Name: " +  this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Salary: " + this.getSalary());
    }

    /* Tipos de Funcionário:

Efetivo: salário base + bônus fixo

Temporário: salário base + (horas trabalhadas × valor da hora)

 */

}
