package nestech.javacourse.example.oop;

public class Director extends Employee{
    public Director(String firstName,String lastName,double basicSalary) {
        setFirstName(firstName);
        setLastName(lastName);
        setBasicSalary(basicSalary);
    }
    @Override
    double getTotalSalary() {
        return super.getBasicSalary() * super.getBasicSalary()*30/100 + 5000000;
    }
}
