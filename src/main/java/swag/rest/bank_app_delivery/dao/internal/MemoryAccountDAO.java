package swag.rest.bank_app_delivery.dao.internal;

import swag.rest.bank_app_delivery.dao.AccountDAO;
import swag.rest.bank_app_delivery.entity.Account;
import swag.rest.bank_app_delivery.entity.AccountType;
import swag.rest.bank_app_delivery.entity.AccountWithdraw;


import java.util.ArrayList;
import java.util.List;

public class MemoryAccountDAO implements AccountDAO {
    public List<Account> accountList = new ArrayList<>();

    @Override
    public List<Account> getClientAccounts(String clientID) {
        return this.accountList;
    }

    @Override
    public void createNewAccount(Account account) {
        accountList.add(account);
        System.out.println("Bank account created");
    }

    @Override
    public void updateAccount(Account account) {
        System.out.println("Not supported yet");
    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        return null;
    }

    @Override
    public AccountWithdraw getClientAccountsWithdrawAccount(String clientID, String accountID) {
        return null;
    }

    @Override
    public Account getClientAccount(String clientID, String accountID) {
        return null;
    }


}
