import ClassesProject.EffectiveEmployee;
import ClassesProject.EmployeeTemporary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<EffectiveEmployee> EffectList = new ArrayList<>();
        ArrayList<EmployeeTemporary> TempList = new ArrayList<>();

        

        //name, Integer age, String cpf, Float Salary
        // EffectList.add( new EffectiveEmployee("Jose Ribeiro", 22, "111111", 1.500f));
        int option;
        do {

            System.out.println("\n=== EMPLOYEE MENU ===");
            System.out.println("1 - Register permanent employee");
            System.out.println("2 - Register temporary employee");
            System.out.println("3 - List all employees");
            System.out.println("0 - Exit");
            System.out.print("Select an option: ");
            option = sc.nextInt();
            sc.nextLine(); // Clear input buffer

            switch (option) {

                case 1:


                    System.out.println("How many permanent employees will be added?");
                    int n = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Effective Employee:");
                    for (int i = 0; i < n; i++) {
                        System.out.println("Name:");
                        String name = sc.nextLine();

                        System.out.println("Age:");
                        int age = sc.nextInt();
                        sc.nextLine();

                        System.out.println("cpf:");
                        String cpf = sc.nextLine();

                        System.out.println("Salary");
                        float salary = sc.nextFloat();
                        sc.nextLine();

                        System.out.println();

                        EffectList.add(new EffectiveEmployee(name, age, cpf, salary));
                    }

                    break;


                case 2:

                    System.out.println("And how many temporary ones?");
                    int m = sc.nextInt();
                    sc.nextLine();

                    System.out.println();
                    System.out.println("Employee Temporary:");
                    for (int i = 0; i < m; i++) {
                        System.out.println("Name:");
                        String name = sc.nextLine();

                        System.out.println("Age:");
                        int age = sc.nextInt();
                        sc.nextLine();

                        System.out.println("cpf:");
                        String cpf = sc.nextLine();

                        System.out.println("Salary");
                        float salary = sc.nextFloat();

                        System.out.println(" hours worked:");
                        float hoursWorked = sc.nextFloat();
                        sc.nextLine();

                        System.out.println();

                        TempList.add(new EmployeeTemporary(name, age, cpf, salary, hoursWorked));
                    }
                    break;

                case 3:

                    System.out.println("===============Effective Employee:=================");
                    for (EffectiveEmployee test : EffectList) {
                        test.status();
                    }

                    System.out.println();
                    System.out.println();
                    System.out.println("============Employee Temporary===============");
                    for (EmployeeTemporary test : TempList) {
                        test.calculateSalary();
                        test.status();
                    }
                    break;

                case 0:
                    System.out.println("Exiting the system...");
                    break;

                default:
                    System.out.println("❌ Invalid option. Please try again.");


            }
        } while (option != 0);
    }

}