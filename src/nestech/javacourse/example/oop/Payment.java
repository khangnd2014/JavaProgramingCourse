package nestech.javacourse.example.oop;

import java.math.BigDecimal;

abstract class Payment {
    abstract void transfer();

    private boolean validateAccount(Integer account) {
        // check so tien >= 0
        return account >= 0 ? true : false;
    }
}
