package com.addressbook.controller;
import com.addressbook.model.*;

import javax.naming.ldap.SortKey;
import javax.swing.*;
import java.util.*;

public class AddressBookController {

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

    public boolean getPerson(String firstName, String lastName) {
        for (Person person : this.personList) {
            if (firstName.equalsIgnoreCase(person.getFirstName()) && lastName.equalsIgnoreCase(person.getLastName())) {
                return true;
            }
        }
        return false;

    }

    public void addPerson() {
        Person person = new Person();
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

        boolean duplicate=this.getPerson(person.getFirstName(),person.getLastName());
        if ( duplicate == false)
        {
            personList.add(person);
            System.out.println("added person successfully");
        }
        else{
            System.out.println("details all ready exist");
        }

    }

    public void editPerson() {

        Person personToedit = this.getPerson();
        if (personToedit != null) {
            System.out.println("enter address");
            personToedit.setAddress(Sc.next());
            System.out.println("enter city");
            personToedit.setCity(Sc.next());
            System.out.println("enter state");
            personToedit.setState(Sc.next());
            System.out.println("enter zip code");
            personToedit.setZip(Sc.next());
            System.out.println("enter phone number");

            personToedit.setPhoneNumber(Sc.next());
            System.out.println("details updated");
        }
        else{
            System.out.println("no details found");
        }
    }

    public void deletePerson(){
        Person personToDelete=this.getPerson();
                if(personToDelete != null)
                {
                    this.personList.remove(personToDelete);
                    System.out.println("deleted successfully");
                }
                else
                    System.out.println("invalid details");
    }

    public void sortByName(){
        this.personList.sort(Comparator.comparing(Person:: getFirstName));
    }

    public void sortByCity(){
        this.personList.sort(Comparator.comparing(Person:: getCity));
    }

    public void sortByState(){
        this.personList.sort(Comparator.comparing(Person:: getState));
    }

    public void sortByZip(){
        this.personList.sort(Comparator.comparing(Person:: getZip));
    }

    public void printAddressbook(){
        for (Person person : this.personList) {
            System.out.println(""+person.getFirstName());
        }

    }
}