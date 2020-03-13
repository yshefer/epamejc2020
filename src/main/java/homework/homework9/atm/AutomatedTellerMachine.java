package homework.homework9.atm;

import homework.homework9.util.Log;
import org.apache.commons.math3.util.Precision;

public class AutomatedTellerMachine {

    public static final double MIN_SUM = 5.0;
    public static final double MAX_SUM = 50.0;
    public static final int OPERATIONS_COUNT = 3;

    private Account account;
    private final int id;

    private String atmDescription;

    public AutomatedTellerMachine(int id, Account account) {
        this.id = id;
        this.account = account;

        atmDescription = "ATM " + this.id + ": ";
    }

    public int getId() {
        return id;
    }

    public void deposit(User user, double sum) {
        Log.log(user.getName() + " waits for " + atmDescription);
        synchronized (this) {
            Log.log(user.getName() + " got " + atmDescription + "wants to deposit " + Precision.round(sum,2));
            account.deposit(this, sum);
        }
    }

    public void withdraw(User user, double sum) throws IllegalStateException {
        Log.log(user.getName() + " waits for " + atmDescription);
        synchronized (this) {
            Log.log(user.getName() + " got " + atmDescription + "wants to withdraw " + Precision.round(sum,2));
            account.withdraw(this, sum);
        }
    }

}