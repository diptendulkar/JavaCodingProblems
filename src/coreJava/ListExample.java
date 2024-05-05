package coreJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListExample {

    public static void main(String[] args) throws Exception {

        Set<Contact> contacts = new HashSet<>();

        contacts.add(new Contact("A1", "aa@gmail.com", "bangalore1", 1197253424l));
        contacts.add(new Contact("A2", "ab@gmail.com", "bangalore2", 2197253424l));
        contacts.add(new Contact("A3", "ac@gmail.com", "bangalore3", 3197253424l));
        contacts.add(new Contact("A4", "ad@gmail.com", "bangalore4", 4197253424l));
        contacts.add(new Contact("A5", "ae@gmail.com", "bangalore5", 5197253424l));

        Contact c1 = new Contact("A3", "ad@gmail.com", "bangalore4", 4197253424l);
        Contact c2 = new Contact("A6", "a6@gmail.com", "bangalore4", 6197253424l);

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        contacts.add(c1);
        contacts.add(c2);

        print(contacts);

        // addRecord(c1, contacts);

    }

    public static void addRecord(Contact c1, List<Contact> contacts) {
        boolean duplicateCheck = false;
        for (Contact c : contacts) {

            // if (c1.email.equals(c.email) || c1.phoneNo == c.phoneNo)
            //  if(c.equals(c1))
            {
                System.out.println("Duplicate record!!");
                duplicateCheck = true;
                break;
            }
        }
        if (!duplicateCheck)
            contacts.add(c1);
    }

    public static void print(Set<Contact> contacts) {
        for (Contact c : contacts) {
            System.out.println(c.name + " " + c.email + " " + c.address + " " + c.phoneNo);
        }
    }


}

class Contact {
    String name;
    String email;
    String address;
    long phoneNo;

    public Contact(String name, String email, String address, long phoneNo) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNo = phoneNo;
    }


    @Override
    public boolean equals(Object obj) {

        Contact c = (Contact) obj;
        if (this.phoneNo == c.phoneNo)
            return true;
        if (this.email.equals(c.email))
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return this.email.hashCode();
    }
}



