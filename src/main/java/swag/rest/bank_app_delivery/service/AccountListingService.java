package swag.rest.bank_app_delivery.service;

import swag.rest.bank_app_delivery.entity.*;

import java.util.List;

public interface AccountListingService {
    Account getClientAccount(String clientID, String accountID);
    AccountWithdraw getClientWithdrawAccount(String clientID, String accountID);
    List<Account> getClientAccounts(String clientID);
    List<Account> getClientAccountsByType(String clientID, AccountType accountType);
}
