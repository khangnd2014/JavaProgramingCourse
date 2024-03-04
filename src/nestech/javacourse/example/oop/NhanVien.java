package nestech.javacourse.example.oop;

/*
Viet chuong trinh tinh tien luong cua nhan vien xuat ra man hinh
Nhan vien có 3 title: YTa, Bacsi, Giam Doc
Nhan Vien co Ho va Ten, Luong Co Ban
- Doi voi Bac Si luong= luong co ban + luong co ban *20%
- Doi voi Giam Doc = luong co ban + luong co ban *30 + 5 000 000
* */
public abstract class NhanVien {
    protected String firstName;
    protected String lastName;
    protected double luongCoban;

    private void checkId() {
        //

    }

     String getFullName() {
        return firstName + " " + lastName;
    }

    public double getLuongCoban() {
        return luongCoban;
    }

    abstract double getTongThuNhap();

    protected boolean validate(Double luongCoban) {
        checkId();
        if (luongCoban > 0) {
            return true;
        }
        return false;
    }
}
