package com.addressbook;

public class AddressBook {

    private class Contact {
        String firstName, lastName, address, city, state, emailId;
        int zipCode;
        long mobileNumber;
    }

    public void printContact() {
        Contact person = new Contact();
        person.firstName = "Praphulla";
        person.lastName = "Kherade";
        person.address = "Bhandup";
        person.city = "Mumbai";
        person.state = "Maharashtra";
        person.zipCode = 407478;
        person.mobileNumber = 8542157565L;
        person.emailId = "prafullkherade9gmail.com";
        System.out.println("Contact Details");
        System.out.println("Name         : "  + person.firstName + " " + person.lastName + "\n"
                + "Address      : "  + person.address + "\n"
                + "City         : "  + person.city + "\n"
                + "State        : "  + person.state + "\n"
                + "ZipCode      : "  + person.zipCode + "\n"
                + "MobileNumber : "  + person.mobileNumber + "\n"
                + "EmailId      : "  + person.emailId + "\n" );
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.printContact();
    }

}
