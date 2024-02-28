package nestech.javacourse.example.oop;

public class GiamDoc extends NhanVien {
    public GiamDoc(String firstName, String lastName, Double luongCoBan) {
        super.firstName = firstName;
        super.lastName = lastName;
        super.luongCoban = luongCoBan;
    }
    @Override
    double getTongThuNhap() {
        return super.getLuongCoban() + super.getLuongCoban() * 30 / 100 + 5000000;
    }
}
