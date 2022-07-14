package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double newSalary=0;
        if (salary <= 10000 && salary >= 0) {
            newSalary = salary - 0.15 * salary;
            System.out.println(newSalary);
        } else if (salary > 10000 && salary <= 20000) {
            newSalary = salary - 0.18 * salary;
            System.out.println(newSalary);
        } else if (salary > 20000) {
            newSalary = salary - 0.2 * salary;
            System.out.println(newSalary);
        } else if (salary < 0){
            System.out.println("wrong input!");
        }
    }
}
