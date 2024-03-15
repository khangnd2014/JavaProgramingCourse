package nestech.javacourse.example.oop;

public class Doctor extends Employee{
    public Doctor(String firstName,String lastName,double basicSalary) {
        setFirstName(firstName);
        setLastName(lastName);
        setBasicSalary(basicSalary);
    }

    @Override
    double getTotalSalary() {
        return super.getBasicSalary() + super.getBasicSalary()*20/100 ;
    }
}
