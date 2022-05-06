package swag.rest.bank_app_delivery.entity.internal;

import swag.rest.bank_app_delivery.entity.*;
import swag.rest.bank_app_delivery.service.BankCore;
import swag.rest.bank_app_delivery.service.internal.AccountListingServiceImpl;

public class AccountBasicCLI {
    CreateAccountOperationUI createAccountOperationUI;
    BankCore bankCore;
    AccountListingServiceImpl accountListing;

    public AccountBasicCLI(CreateAccountOperationUI createAccountOperationUI, BankCore bankCore, AccountListingServiceImpl accountListing) {
        this.createAccountOperationUI = createAccountOperationUI;
        this.bankCore = bankCore;
        this.accountListing = accountListing;
    }

    public void getAccounts(String clientID){
        System.out.println(accountListing.getClientAccounts(clientID));
    }

    public void createAccountRequest(AccountType clientID){
        bankCore.createNewAccount(clientID, "1");

    }

}
