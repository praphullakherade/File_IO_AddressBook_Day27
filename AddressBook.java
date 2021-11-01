package com.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook extends ContactDetails{
    List<ContactDetails> contactDetails = new ArrayList<>();
    ContactDetails person = new ContactDetails();
    Scanner scanner = new Scanner(System.in);
    public void addNewContact() {

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
        contactDetails.add(person);
        printContact();
    }

    public void editContact() {
        System.out.println("Enter the first name of person to edit contact");
        String editName = scanner.next();
        boolean edited=false;
        for(int i = 0; i < contactDetails.size(); i++) {
            String name = contactDetails.get(i).getFirstName();
            if (name.equalsIgnoreCase(editName)) {
                contactDetails.remove(i);
                addNewContact();
                edited=true;
                break;
            }
        }
        if(!edited){
            System.out.println("This name does not exist");
        }
    }

    public void deleteContact(){
        System.out.println("Enter the first name of person to delete contact");
        String deleteName = scanner.next();
        boolean deleted=false;
        for(int i = 0; i < contactDetails.size(); i++) {
            String name = contactDetails.get(i).getFirstName();
            if (name.equalsIgnoreCase(deleteName)) {
                contactDetails.remove(i);
                printContact();
                deleted=true;
                break;
            }
        }
        if(!deleted){
            System.out.println("This name does not exist");
        }
    }

    public void printContact() {
        System.out.println("Contact Details");
        for (int i = 0; i < contactDetails.size(); i++) {
            System.out.println("Name         : " + contactDetails.get(i).getFirstName()+ " " + contactDetails.get(i).getLastName() + "\n"
                    + "Address      : " + contactDetails.get(i).getAddress()   + "\n"
                    + "City         : " + contactDetails.get(i).getCity()      + "\n"
                    + "State        : " + contactDetails.get(i).getState()     + "\n"
                    + "ZipCode      : " + contactDetails.get(i).getZipCode()   + "\n"
                    + "MobileNumber : " + contactDetails.get(i).getMobileNumber()  + "\n"
                    + "EmailId      : " + contactDetails.get(i).getEmailId()   + "\n");
        }
    }
}