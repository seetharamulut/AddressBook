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
            System.out.println("5) sort by city");
            System.out.println("6) sort by state");
            System.out.println("7) sort by zipcode");
            System.out.println("8) view person by city name");
            System.out.println("9) view person by state name");
            System.out.println("10) exit");
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
                case 5: addressBookController.sortByCity();
                        break;
                case 6: addressBookController.sortByState();
                        break;
                case 7: addressBookController.sortByZip();
                        break;
                case 8: addressBookController.viewByCity();
                        break;
                case 9: addressBookController.viewByState();
                        break;
                case 10: return;
            }
        }

    }
}
