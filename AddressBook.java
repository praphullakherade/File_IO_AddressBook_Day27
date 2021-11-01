package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList arrayList = new ArrayList();
    ContactDetails person = new ContactDetails();
    public void addNewContact() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String firstName = scanner.next();
        System.out.println("Enter Last Name : ");
        String lastName = scanner.next();
        System.out.println("Enter Address : ");
        String address = scanner.next();
        System.out.println("Enter City : ");
        String city = scanner.next();
        System.out.println("Enter State : ");
        String state = scanner.next();
        System.out.println("Enter ZipCode : ");
        int zipCode = scanner.nextInt();
        System.out.println("Enter Mobile Number : ");
        long mobileNumber = scanner.nextLong();
        System.out.println("Enter EmailId : ");
        String emailId = scanner.next();
        person = new ContactDetails(firstName, lastName, address, city, state, zipCode, mobileNumber, emailId);
        arrayList.add(person);
        printContact();
    }

    public void printContact() {

        for(int i=0;i<arrayList.size();i++) {

            System.out.println("Contact Details");
            System.out.println("Name         : " + person.getFirstName() + " " + person.getLastName() + "\n"
                    + "Address      : " + person.getAddress()   + "\n"
                    + "City         : " + person.getCity()      + "\n"
                    + "State        : " + person.getState()     + "\n"
                    + "ZipCode      : " + person.getZipCode()   + "\n"
                    + "MobileNumber : " + person.getMobileNumber()  + "\n"
                    + "EmailId      : " + person.getEmailId()   + "\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner userInput = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        while(true){

            System.out.println("Enter 1 to add new contact \nEnter 2 to Exit");
            int getUserInput = userInput.nextInt();
            switch (getUserInput){
                case 1 :
                    addressBook.addNewContact();
                    break;
                case 2 :
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid user input");
                    continue;
            }
        }
    }

}