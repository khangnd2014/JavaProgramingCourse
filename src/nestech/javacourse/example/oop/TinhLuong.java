package nestech.javacourse.example.oop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TinhLuong {
    public static void main(String[] args) {
        List<NhanVien> nhanViens = new ArrayList<>();
        nhanViens.add(new YTa("Nam", "Nguyen", 8000000d));
        nhanViens.add(new YTa("Hai", "Nguyen", 9000000d));
        nhanViens.add(new YTa("Hai", "Nguyen", 8500000d));
        nhanViens.add(new BacSi("Le", "Nguyen", 8000000d));
        nhanViens.add(new GiamDoc("Hoang", "Nguyen", 8000000d));


        Double sum = 0D;
        for (NhanVien nhanVien : nhanViens) {
            if (nhanVien instanceof BacSi) {
                System.out.println("Ho va ten: " + nhanVien.getFullName());
            }
            if (nhanVien.validate(nhanVien.luongCoban)) {
                continue;
            }
            sum += nhanVien.getTongThuNhap();
        }

        System.out.println("Tong luong phai tra: " + sum.longValue());

    }
}
