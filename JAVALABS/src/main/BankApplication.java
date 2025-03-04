package main;

import banking.BankingSystem;
import utils.PinValidator;
import java.io.Console;

public class BankApplication {
    public static void main(String[] args) {
        Console console = System.console();


        String accountNumber = console.readLine("Enter Account Number: ");
        String pin = new String(console.readPassword("Enter PIN: "));

        PinValidator validator = new PinValidator();
        PinValidator.Rules rules = validator.new Rules();

        if (!rules.isValid(pin)) {
            System.out.println("Invalid PIN. PIN must be exactly 4 digits.");
            return;
        }

        if (BankingSystem.LoginProcessor.authenticate(accountNumber, pin)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid account number or PIN.");
        }
    }
}
