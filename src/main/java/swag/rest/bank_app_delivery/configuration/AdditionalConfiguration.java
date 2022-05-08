package swag.rest.bank_app_delivery.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import swag.rest.bank_app_delivery.dao.internal.MemoryAccountDAO;
import swag.rest.bank_app_delivery.service.AccountCreationService;
import swag.rest.bank_app_delivery.service.BankCore;
import swag.rest.bank_app_delivery.service.internal.AccountCreationImpl;

@Configuration
public class AdditionalConfiguration {

    @Bean
    public AccountCreationService accountCreationService(MemoryAccountDAO memoryAccountDAO) {
        return new AccountCreationImpl(memoryAccountDAO);
    }

    @Bean
    public BankCore bankCore(AccountCreationService accountCreation) {
        return new BankCore(accountCreation);
    }

}