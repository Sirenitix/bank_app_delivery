package swag.rest.bank_app_delivery.service.internal;

import swag.rest.bank_app_delivery.dao.AccountDAO;
import swag.rest.bank_app_delivery.entity.Account;
import swag.rest.bank_app_delivery.entity.AccountType;
import swag.rest.bank_app_delivery.entity.AccountWithdraw;
import swag.rest.bank_app_delivery.service.AccountListingService;

import java.util.List;

public class AccountListingServiceImpl implements AccountListingService {

    AccountDAO accountDAO;

    public AccountListingServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public Account getClientAccount(String clientID, String accountID) {
        return null;
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        return null;
    }

    @Override
    public List<Account> getClientAccounts(String clientID) {
        return accountDAO.getClientAccounts(clientID);
    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        return null;
    }
}
