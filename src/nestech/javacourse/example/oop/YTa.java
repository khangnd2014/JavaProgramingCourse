package nestech.javacourse.example.oop;

public class YTa extends NhanVien {
    public YTa(String firstName, String lastName, Double luongCoBan) {
        super.firstName = firstName;
        super.lastName = lastName;
        super.luongCoban = luongCoBan;
    }
    @Override
    double getTongThuNhap() {
        return super.getLuongCoban();
    }
}
