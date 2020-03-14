package homeworks.java.multithreading;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Collector {

    private List<ATM> atms;

    public Collector(List<ATM> atms) {

        super();
        this.atms = atms;

    }

    public void service(ATM atm) {

        BigDecimal cash = BigDecimal.valueOf(500_000.0);
        BigDecimal difference = cash.subtract(atm.getAccount());
        Bank bank = Bank.getInstance();
        bank.serviceOperation(difference);
        atm.service(difference);

    }

}
