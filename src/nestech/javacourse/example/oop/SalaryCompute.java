package nestech.javacourse.example.oop;

import java.util.ArrayList;
import java.util.List;

public class SalaryCompute {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Nurse("Sang","Le",9000000));
        employees.add(new Nurse("Nghi","Tran",6000000));
        employees.add((new Doctor("Hoang","Pham",15000000)));
        employees.add((new Doctor("Nguyen","Le",30000000)));

        Double sum = 0D;
        for (Employee tempEmployees : employees){
            if (tempEmployees.validate(tempEmployees.basicSalary)) {
                sum += tempEmployees.getTotalSalary();
            }
        }
        System.out.println("Total salary have to pay: " + sum.longValue());
    }
}
