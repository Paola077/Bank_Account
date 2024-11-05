import org.example.Account;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    void when_account_is_created_balance_is_zero() {

        Account account = new Account();

        double balance = account.getBalance();
        assertEquals(0, balance);
    }


    @Test
    void createAccount() {

        Account account = new Account(1000);

        double balance = account.getBalance();
        assertEquals(1000, balance);
    }

    @Test
    void when_deposit_account_must_be_sum_in_balance() {

        Account account = new Account(1000);

        account.deposit(500);

        double balance = account.getBalance();
        assertEquals(1500, balance);
    }

    @Test
    void when_deposit_account_must_be_the_same_if_amount_is_negative() {

        Account account = new Account(1000);

        account.deposit(-500);

        double balance = account.getBalance();
        assertEquals(1000, balance);
    }

    @Test
    void withdrawMoney_HAPPYPATH() {
        Account account = new Account(1000);

        account.withdraw(200);

        double balance = account.getBalance();
        assertEquals(800, balance);
    }

    @Test
    void withdrawMoney_when_the_amount_is_less_than_balance() {
        Account account = new Account(1000);

        assertThrows(IllegalArgumentException.class, () -> account.withdraw(2000));

        double balance = account.getBalance();
        assertEquals(1000, balance);
    }

    @Test
    void check_balance_account() {
        Account account = new Account(1000);

        double balance = account.getBalance();
        assertEquals(1000, balance);

    }

    @Test
    void the_account_must_be_should_the_deposit_and_withdraw() {
        Account account = new Account(1000);

        account.deposit(300);
        account.withdraw(100);
        account.withdraw(100);
        account.deposit(200);

        double balance = account.getBalance();
        assertEquals(1300, balance);

    }

}











