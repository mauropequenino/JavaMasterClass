package arrays.challenge57;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner (System.in);
    private static MobilePhone moblilePhone = new MobilePhone("8222222");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\nEnter action: (6 - to show available actions)");
            int action = sc.nextInt();
            sc.nextLine();

            switch (action){
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    moblilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }
    private static void startPhone(){
        System.out.println("Staring phone ...");
    }
    private static void addNewContact(){
        System.out.print("Enter new contact name: ");
        String name = sc.nextLine();
        System.out.print("Enter new contact phone number: ");
        String phoneNumber = sc.nextLine();
        Contacts newContact = Contacts.createContact(name,phoneNumber);
        if(moblilePhone.addNewContact(newContact)){
            System.out.println("New contact added: name = " + name + ", phone = " + phoneNumber);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }
    private static void updateContact(){
        System.out.print("Enter existing contact name: ");
        String name = sc.nextLine();
        Contacts existingContactRecord = moblilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.print("Enter new contact name: ");
        String newName = sc.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newNumber = sc.nextLine();
        Contacts newContact = Contacts.createContact(newName, newNumber);
        if(moblilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Successfully update record");
        } else {
            System.out.println("Error updating record");
        }
    }
    private static void removeContact() {
        System.out.print("Enter existing contact name: ");
        String name = sc.nextLine();
        Contacts existingContactRecord = moblilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }
        moblilePhone.removeContact(existingContactRecord);
    }

    public static void queryContact(){
        System.out.print("Enter existing contact name: ");
        String name = sc.nextLine();
        Contacts existingContactRecord = moblilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " -> " + existingContactRecord.getPhoneNumber());
    }
    private static void printActions(){
        System.out.println("\nAvailable action:\npress");
        System.out.println("0 - to shutdown\n" +
                "1 - to print contact\n" +
                "2 - to add a new contact\n" +
                "3 - to update existing an existing contact\n" +
                "4 - to remove an existing contact\n" +
                "5 - query if an existing contact exists\n" +
                "6 - to print a list of available actions\n");
        System.out.println("Choose your actions: ");
    }













}
