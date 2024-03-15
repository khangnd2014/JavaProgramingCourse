package nestech.javacourse.example.oop;

public class Nurse extends Employee {
    public Nurse(String firstName,String lastName,double basicSalary) {
        setFirstName(firstName);
        setLastName(lastName);
        setBasicSalary(basicSalary);
    }

    @Override
    double getTotalSalary() {
        return super.getBasicSalary();
    }
}
