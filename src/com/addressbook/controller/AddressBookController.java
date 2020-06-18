package com.addressbook.controller;
import com.addressbook.model.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddressBookController {
    Person person = new Person();

    Scanner Sc = new Scanner(System.in);
    LinkedList<Person> personList = new LinkedList<Person>();

    public Person getPerson() {
        System.out.println("enter first name");
        String firstName = Sc.next();
        System.out.println("enter last name");
        String lastName = Sc.next();

        for (Person person : this.personList) {
            if (firstName.equalsIgnoreCase(person.getFirstName()) && lastName.equalsIgnoreCase(person.getLastName())) {
                return person;
            }
        }
        return null;
    }

    public void addPerson() {

        System.out.println("enter first name");
        person.setFirstName(Sc.next());

        System.out.println("enter last name");
        person.setLastName(Sc.next());

        System.out.println("enter address");
        person.setAddress(Sc.next());

        System.out.println("enter city");
        person.setCity(Sc.next());

        System.out.println("enter state");
        person.setState(Sc.next());

        System.out.println("enter zipcode");
        person.setZip(Sc.next());

        System.out.println("enter phone number");
        person.setPhoneNumber(Sc.next());

        System.out.println("added person successfully");
        personList.add(person);
    }

    public void editPerson() {

        Person persontoedit = this.getPerson();
        if (persontoedit != null) {
            System.out.println("enter address");
            persontoedit.setAddress(Sc.next());
            System.out.println("enter city");
            persontoedit.setCity(Sc.next());
            System.out.println("enter state");
            persontoedit.setState(Sc.next());
            System.out.println("enter zip code");
            persontoedit.setZip(Sc.next());
            System.out.println("enter phone number");
            persontoedit.setPhoneNumber(Sc.next());
        }
    }
}