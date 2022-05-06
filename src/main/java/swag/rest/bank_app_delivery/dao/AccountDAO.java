package swag.rest.bank_app_delivery.dao;

import swag.rest.bank_app_delivery.entity.*;


import java.util.List;

public interface AccountDAO {
    List<Account> getClientAccounts(String clientID);
    void createNewAccount(Account account);
    void updateAccount(Account account);
    List<Account> getClientAccountsByType(String clientID, AccountType accountType);
    AccountWithdraw getClientAccountsWithdrawAccount(String clientID, String accountID);
    Account getClientAccount(String clientID, String accountID);

}
