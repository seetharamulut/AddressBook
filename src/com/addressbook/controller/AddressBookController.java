package com.addressbook.controller;
import com.addressbook.model.*;

import java.util.Scanner;

public class AddressBookController {
    Scanner Sc=new Scanner(System.in);

    public void addPerson(){
        Person person = new Person();
        System.out.println("enter firstname");
        person.setFirstName(Sc.next());

    }
}
