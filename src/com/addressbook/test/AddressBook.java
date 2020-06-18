package com.addressbook.test;
import com.addressbook.controller.*;

import java.util.Arrays;

public class AddressBook {
    public static void main(String[] args) {
     AddressBookController addressBookController = new AddressBookController();

        System.out.println("Welcome To Address Book Program");
        addressBookController.addPerson();
    }
}
