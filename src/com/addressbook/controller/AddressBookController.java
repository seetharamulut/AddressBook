package com.addressbook.controller;
import com.addressbook.model.*;

import java.util.*;

public class AddressBookController {

    Scanner scan = new Scanner(System.in);
    LinkedList<Person> personList = new LinkedList<Person>();
    HashMap<String,String > cityMap = new HashMap<>();
    HashMap<String,String> stateMap = new HashMap<>();

    public Person getPersonDetails() {
        System.out.println("enter first name");
        String firstName = scan.next();
        System.out.println("enter last name");
        String lastName = scan.next();

        for (Person person : this.personList) {
            if (firstName.equalsIgnoreCase(person.getFirstName()) && lastName.equalsIgnoreCase(person.getLastName())) {
                return person;
            }
        }
        return null;
    }

    public boolean checkPerson(String phoneNumber) {
        for (Person person : this.personList) {
            if (phoneNumber.equalsIgnoreCase(person.getPhoneNumber())) {
                return true;
            }
        }
        return false;
    }

    public void addressDetails(Person person){
        System.out.println("enter address");
        person.setAddress(scan.next());

        System.out.println("enter city");
        person.setCity(scan.next());

        System.out.println("enter state");
        person.setState(scan.next());

        System.out.println("enter zipcode");
        person.setZip(scan.next());

        System.out.println("enter phone number");
        person.setPhoneNumber(scan.next());
    }

    public void addPerson() {
        Person person = new Person();
        System.out.println("enter first name");
        person.setFirstName(scan.next());
        System.out.println("enter last name");
        person.setLastName(scan.next());
        addressDetails(person);
        boolean duplicate=this.checkPerson(person.getPhoneNumber());
        if ( duplicate == false)
        {
            personList.add(person);
            cityMap.put(person.getCity(),person.getFirstName());
            stateMap.put(person.getState(),person.getFirstName());
            System.out.println("added person successfully");
        }
        else{
            System.out.println("details all ready exist");
        }
    }

    public void editPerson() {
        Person personToedit = this.getPersonDetails();
        if (personToedit != null) {
            addressDetails(personToedit);
            personToedit.setPhoneNumber(scan.next());
            System.out.println("details updated");
        }
        else{
            System.out.println("no details found");
        }
    }

    public void deletePerson(){
        Person personToDelete=this.getPersonDetails();
                if(personToDelete != null)
                {
                    this.personList.remove(personToDelete);
                    System.out.println("deleted successfully");
                }
                else
                    System.out.println("invalid details");
    }

    public void sorting() {
        System.out.println("enter type of sort 1)name 2)city 3)state 4)zipcode");
        int option = scan.nextInt();
        switch (option) {
            case 1: this.personList.sort(Comparator.comparing(Person:: getFirstName));
                    break;
            case 2: this.personList.sort(Comparator.comparing(Person:: getCity));
                    break;
            case 3: this.personList.sort(Comparator.comparing(Person:: getState));
                    break;
            case 4: this.personList.sort(Comparator.comparing(Person:: getZip));
                    break;
        }
    }

    public void viewByCityOrCity() {
        System.out.println("enter city or state name");
        String name = scan.next();
        if (cityMap.containsKey(name)) {
            System.out.println(cityMap.get(name));
        } else {
            System.out.println(stateMap.get(name));
        }
    }
    public void searchByCityOrCity() {
        System.out.println("enter city or state name");
        String name = scan.next();
        for (HashMap.Entry<String, String> pair : cityMap.entrySet()) {
            if (cityMap.containsKey(name)) {
                System.out.println(cityMap.get(name));
            }
        }
        for (HashMap.Entry<String, String> pair : stateMap.entrySet()) {
            if (stateMap.containsKey(name)) {
                System.out.println(stateMap.get(name));
            }
        }
    }
}