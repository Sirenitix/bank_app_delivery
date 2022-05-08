package swag.rest.bank_app_delivery.service;

import swag.rest.bank_app_delivery.configuration.AdditionalConfiguration;
import swag.rest.bank_app_delivery.entity.AccountType;
import swag.rest.bank_app_delivery.service.internal.AccountListingServiceImpl;

public class BankCore {
    static long id = 1;
    long lastAccountNumber = 1;
    AccountCreationService accountCreation;

    public BankCore(AccountCreationService accountCreationService) {
        this.accountCreation = accountCreationService;
    }

    public void createNewAccount(AccountType accountType, String clientID){
        accountCreation.create(accountType, id, clientID, lastAccountNumber);
        this.incrementLastAccountNumber();
    }

    void incrementLastAccountNumber(){
        lastAccountNumber++;
    }


}
