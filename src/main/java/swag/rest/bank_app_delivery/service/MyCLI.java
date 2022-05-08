package swag.rest.bank_app_delivery.service;

import swag.rest.bank_app_delivery.entity.*;

import java.util.Scanner;

public class MyCLI implements CLIUI {

    private Scanner scanner;

    public MyCLI() {
        this.scanner = new Scanner(System.in);;
    }

    public Scanner getScanner() {
        return scanner;
    }

    double requestClientAmount(){
        return 0;
    }

    String requestClientAmountNumber() {
        return null;
    }


    @Override
    public AccountType requestAccountType() {
        return AccountType.valueOf(scanner.nextLine());
    }
}
