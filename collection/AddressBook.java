package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    ContactDetails person = new ContactDetails();
    List<ContactDetails> contactDetailsList = new ArrayList<>();
    public void addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of contacts you want to enter");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {

            //checking the duplicate contact by contact name
            System.out.println("Enter First Name : ");
            String firstName = scanner.next();
            if (firstName.equals(person.getFirstName())) {
                System.out.println("The entered person is already exist.");
            } else {
                writeContact(firstName);
                System.out.println("contact added Successfully");
            }
        }
    }

    public void writeContact(String firstName) {
        Scanner scanner = new Scanner(System.in);

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
        contactDetailsList.add(person);
    }

    public void editContact() {
        System.out.println("Enter the first name of person to edit contact");
        Scanner scanner = new Scanner(System.in);
        String editName = scanner.next();
        boolean edited = false;
        for (int i = 0; i < contactDetailsList.size(); i++) {
            String name = contactDetailsList.get(i).getFirstName();
            if (name.equalsIgnoreCase(editName)) {
                contactDetailsList.remove(person);
                writeContact(editName);
                edited = true;
                break;
            }
        }
        if (!edited) {
            System.out.println("enter name is incorrect");
        }
    }

    public void deleteContact() {
        System.out.println("Enter the first name of person to delete contact");
        Scanner scanner = new Scanner(System.in);
        String deleteName = scanner.next();
        int i = 0;
        for ( ;i < contactDetailsList.size(); i++) {
            String name = contactDetailsList.get(i).getFirstName();
            if (name.equalsIgnoreCase(deleteName)) {
                break;
            }
        }
        if (i < contactDetailsList.size()) {
            contactDetailsList.remove(i);
            System.out.println("Contact Deleted");
        }else {
            System.out.println("Contact not find");
        }
    }
}