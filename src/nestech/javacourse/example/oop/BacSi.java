package nestech.javacourse.example.oop;

public class BacSi extends NhanVien {
    public BacSi(String firstName, String lastName, Double luongCoBan) {
        super.firstName = firstName;
        super.lastName = lastName;
        super.luongCoban = luongCoBan;
    }

    @Override
    double getTongThuNhap() {
        return super.getLuongCoban() + super.getLuongCoban() * 20 / 100;
    }
}
