package swag.rest.bank_app_delivery.entity;

public class FixedAccount extends AccountDeposit{
    public FixedAccount(AccountType accountType, long id, String clientID, long bankID, double balance, boolean withdrawAllowed) {
        super(accountType, id, clientID, bankID, balance, withdrawAllowed);
    }

    @Override
    public String toString() {
        return String.format("Account{id='%03d%06d', clientID='%s', balance=0.0, type='%s'}", super.getBankID(), super.getId(), super.getClientID(), super.getAccountType());
    }
}
