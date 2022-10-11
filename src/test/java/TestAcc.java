import org.example.accounts.Account;
import org.example.accounts.CheckingAccount;
import org.example.accounts.CreditAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestAcc {

    private Account checkingAccount = new CheckingAccount();
    private Account creditAccount = new CreditAccount();

    @Test
    @DisplayName("Проверка установки допустимого баланса дебетового счета")
    void setCheckingBalance() {
        checkingAccount.setAccountBalance(1000);
        Assertions.assertEquals(1000, checkingAccount.getAccountBalance());
    }

    @Test
    @DisplayName("Проверка установки недопустимого баланса дебетового счета")
    void setCheckingBalanceMinus() {
        checkingAccount.setAccountBalance(-1000);
        Assertions.assertEquals(0, checkingAccount.getAccountBalance());
    }

    @Test
    @DisplayName("Проверка задания недопустимого баланса кредитному счету")
    void setCreditBalancePositive() {
        creditAccount.setAccountBalance(0);
        Assertions.assertEquals(0, creditAccount.getAccountBalance());
    }
}

