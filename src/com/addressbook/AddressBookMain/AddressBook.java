package com.addressbook.AddressBookMain;
import com.addressbook.controller.*;

import java.util.Arrays;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book Program");
        Scanner Scan=new Scanner(System.in);

        AddressBookController addressBookController = new AddressBookController();

        while(true) {

            System.out.println("Choose what to do");
            System.out.println("1) add a person");
            System.out.println("2) edit person");
            System.out.println("3) delete a person");
            System.out.println("4) sort addressbook");
            System.out.println("5) view person by city or state name");
            System.out.println("6) search for person in city or state");
            System.out.println("7) exit");
            int choice = Scan.nextInt();

            switch (choice) {
                case 1: addressBookController.addPerson();
                        break;
                case 2: addressBookController.editPerson();
                        break;
                case 3: addressBookController.deletePerson();
                        break;
                case 4: addressBookController.sorting();
                        break;
                case 5: addressBookController.viewByCityOrCity();
                        break;
                case 6: addressBookController.searchByCityOrCity();
                        break;
                case 7: return;
            }
        }

    }
}
