package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner userInput = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        while (true) {
            System.out.println("Enter 1 to add new contact \nEnter 2 to edit contact " +
                    "\nEnter 3 to delete contact \nEnter 4 to Exit");
            int getUserInput = userInput.nextInt();
            switch (getUserInput) {
                case 1:
                    addressBook.addNewContact();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.deleteContact();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid user input");
                    continue;
            }
        }
    }
}