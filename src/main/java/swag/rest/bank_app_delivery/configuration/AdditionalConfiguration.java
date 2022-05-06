package swag.rest.bank_app_delivery.configuration;


import swag.rest.bank_app_delivery.dao.AccountDAO;
import swag.rest.bank_app_delivery.dao.internal.MemoryAccountDAO;
import swag.rest.bank_app_delivery.entity.CreateAccountOperationUI;
import swag.rest.bank_app_delivery.entity.internal.AccountBasicCLI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import swag.rest.bank_app_delivery.service.AccountCreationService;
import swag.rest.bank_app_delivery.service.AccountListingService;
import swag.rest.bank_app_delivery.service.BankCore;
import swag.rest.bank_app_delivery.service.MyCLI;
import swag.rest.bank_app_delivery.service.internal.AccountCreationImpl;
import swag.rest.bank_app_delivery.service.internal.AccountListingServiceImpl;

import java.util.Scanner;

@Configuration
public class AdditionalConfiguration {

    @Bean
    public AccountCreationService accountCreationService(MemoryAccountDAO memoryAccountDAO) {
        return new AccountCreationImpl(memoryAccountDAO);
    }

    @Bean
    public BankCore bankCore(AccountCreationService accountCreationService) {
        return new BankCore(accountCreationService);
    }

}