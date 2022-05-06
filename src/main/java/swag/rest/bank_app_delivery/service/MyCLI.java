package swag.rest.bank_app_delivery.service;

import swag.rest.bank_app_delivery.entity.*;

import java.util.Scanner;

public class MyCLI implements CLIUI {

    private Scanner scanner;

    public MyCLI(Scanner scanner) {
        this.scanner = scanner;
    }

    public MyCLI() {
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
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
