package com.adressbookapp;
import com.adressbookapp.model.ContactPerson;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        ContactPerson person = new ContactPerson(
                "Janhavi",
                "Singh",
                "Delhi Road",
                "Agra",
                "UP",
                "282002",
                "9876543210",
                "janhavi@gmail.com"
        );

        //person.display();
    }
}