package Lab12a;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Order {
    private int orderCode;
    private Date sendDate;

    public Order(int orderCode, Date sendDate) {
        this.orderCode = orderCode;
        this.sendDate = sendDate;
    }

    public Order() {
        this(-1, new Date());
    }

    public int getOrderCode() {
        return this.orderCode;
    }

    public String getSQLDate() {
        LocalDate localDate = this.sendDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate.getYear() + "-" + localDate.getMonthValue() + "-" + localDate.getDayOfMonth();
    }

    public String toString() {
        return "order code: " + this.orderCode + ", send date: " + this.sendDate.toString();
    }
}
