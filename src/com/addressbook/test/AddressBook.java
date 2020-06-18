package com.addressbook.test;
import com.addressbook.controller.*;

import java.util.Arrays;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {

        System.out.println("Welcome To Address Book Program");
        Scanner Sc=new Scanner(System.in);

        AddressBookController addressBookController = new AddressBookController();

        while(true) {

            System.out.println("Choose what to do");
            System.out.println("1) add a person");
            System.out.println("2) edit person");
            System.out.println("3) delete a person");
            System.out.println("4) sort by name");
            System.out.println("5) print names in address book");
            System.out.println("6) exit");
            int choice = Sc.nextInt();
            switch (choice) {
                case 1:
                        addressBookController.addPerson();
                        break;
                case 2: addressBookController.editPerson();
                        break;
                case 3: addressBookController.deletePerson();
                        break;
                case 4: addressBookController.sortByName();
                        break;
                case 5: addressBookController.printAddressbook();
                        break;
                case 6: return;
            }
        }

    }
}
