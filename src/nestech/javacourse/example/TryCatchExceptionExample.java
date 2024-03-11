package nestech.javacourse.example;

import nestech.javacourse.example.oop.ClientNotFoundException;
import nestech.javacourse.example.oop.NhanVien;
import nestech.javacourse.example.oop.ThirdPartyNotStableException;

public class TryCatchExceptionExample {
    public static void main(String[] args) {
        try {
            Integer input = Integer.valueOf(args[0]);
            System.out.println("Input: " + input);
            try {
                Integer input2 = Integer.valueOf(args[5]);
                System.out.println("Input: " + input2);
                String test = null;
                System.out.println(test.toString());
                NhanVien nhanVien = getNhanVienFromFileByIdetifineNumber("1234");
//                if (nhanVien == null) {
//                    throw new ClientNotFoundException("Cannot found client", 554433);
//                }
                ///
                nhanVien.getLuongCoban();
            } catch (NullPointerException exception) {
                System.err.println("Test env is null");

                // return http error 401
            } catch (Exception ex1) {
                throw new ThirdPartyNotStableException("Error message 12345", 423423);
            }
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("Khong co gia tri input");
            // return http error code is 400
        } catch (Exception e) {
            System.out.println("");
            // 500 Rule --
        } finally {
            // close
        }

    }

    private static NhanVien getNhanVienFromFileByIdetifineNumber(String idNumber) {
        return null;
    }
}
