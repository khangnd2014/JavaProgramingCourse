package nestech.javacourse.example.oop;


/*
* Viết chương trình tính lương của nhân viên,
* Nhân viên có 3 chức vụ: Y Tá, Bác Sĩ, Giám đốc
* Nhân Viên có họ tên, lương cơ bản
* Đối với bác sĩ lương = lương cơ bản + lương cơ bản * 20%
* Đối với giám đốc lương = lương cơ bản + lương cơ bản * 30% + 5 000 000 */
public abstract class Employee {
    private String firstName;
    private String lastName;
    protected double basicSalary;

    public String getFullName() {
        return firstName + lastName;
    }

    abstract double getTotalSalary();

    public String getFirstName() {
        return firstName;
    }

    boolean validate(double basicSalary) {
        if (basicSalary < 0) {
            return false;
        }
        return true;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
}


