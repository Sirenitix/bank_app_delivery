package swag.rest.bank_app_delivery.service;

import swag.rest.bank_app_delivery.entity.*;


public interface AccountCreationService {
    void create(AccountType accountType, long bankID, String clientID, long accountID);
}
