package com.addressbook.test;
import com.addressbook.controller.*;

import java.util.Arrays;
import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {

        Scanner Sc=new Scanner(System.in);

        AddressBookController addressBookController = new AddressBookController();

        while(true) {
            System.out.println("Welcome To Address Book Program");

            System.out.println("Choose what to do");
            System.out.println("1) add a person");
            System.out.println("2) edit person");
            System.out.println("3) delete a person");
            System.out.println("4) exit");
            int choice = Sc.nextInt();
            switch (choice) {
                case 1:
                    addressBookController.addPerson();
                    break;
                case 2:
                    addressBookController.editPerson();
                    break;
                    case 3: addressBookController.deletePerson();
                            break;
                    case 4: return ;
            }
        }

    }
}
