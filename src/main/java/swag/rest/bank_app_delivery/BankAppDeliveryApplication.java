package swag.rest.bank_app_delivery;


import swag.rest.bank_app_delivery.entity.AccountType;
import swag.rest.bank_app_delivery.entity.internal.AccountBasicCLI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import swag.rest.bank_app_delivery.service.MyCLI;

import java.util.Scanner;


public class BankAppDeliveryApplication {


    public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("props.xml");
            System.out.println("Welcome to CLI bank serviceEnter operation number:\n" +
                    "1 - show accounts\n" +
                    "2 - create account\n" +
                    "3 - deposit\n" +
                    "4 - withdraw\n" +
                    "5 - transfer\n" +
                    "6 - this message\n" +
                    "7 - exit");
            while (true) {
                try {
                AccountBasicCLI accountBasicCLI = context.getBean(AccountBasicCLI.class);
                MyCLI myCLI = context.getBean(MyCLI.class);
                switch (myCLI.getScanner().nextLine()) {
                    case "1":
                        accountBasicCLI.getAccounts("1");
                        break;
                    case "2":
                        System.out.println("Choose account type: [CHECKING, SAVING, FIXED]");
                        accountBasicCLI.createAccountRequest(myCLI.requestAccountType());
                        break;
                    case "7":
                        System.out.println("Application closed");
                        return;
                    default:
                        System.out.println("Wrong input!");
                }
            } catch (Exception e){
                    System.out.println("Wrong input! " + e.getMessage());
                }
        }

    }
}

