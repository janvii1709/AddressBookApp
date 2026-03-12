package com.adressbookapp.service;
import com.adressbookapp.model.AddressBook;
import com.adressbookapp.model.ContactPerson;
public class AddressBookService {
    AddressBook addressBook = new AddressBook();
    public void addContact(ContactPerson person) {
        addressBook.getContacts().add(person);
    }
    public void displayContacts() {
        for (ContactPerson person : addressBook.getContacts()) {
            person.display();
            System.out.println("--------------------");
        }
    }
}