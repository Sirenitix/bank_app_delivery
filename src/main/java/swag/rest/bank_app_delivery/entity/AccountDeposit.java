package swag.rest.bank_app_delivery.entity;

public class AccountDeposit extends Account {
    public AccountDeposit() {
    }

    public AccountDeposit(AccountType accountType, long id, String clientID, long bankID, double balance, boolean withdrawAllowed) {
        super(accountType, id, clientID, bankID, balance, withdrawAllowed);
    }
}
