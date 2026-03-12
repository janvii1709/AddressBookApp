package com.adressbookapp;
import com.adressbookapp.model.ContactPerson;
import com.adressbookapp.controller.AddressBookController;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        AddressBookController controller = new AddressBookController();
        controller.addContact();
    }
}