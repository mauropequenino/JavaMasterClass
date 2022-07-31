package arrays.challenge57;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contacts> myContacts = new ArrayList<Contacts>();

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contacts>();
    }

    public boolean addNewContact(Contacts contact){
        if(findContacts(contact.getName()) >= 0){
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }
    private int findContacts(Contacts contact){
        return this.myContacts.indexOf(contact);
    }

    public boolean updateContact(Contacts oldContact, Contacts newContact){
        int foundPosition = findContacts(oldContact);
        if (foundPosition < 0){
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contacts contact){
        int foundPosition = findContacts(contact);
        if(foundPosition < 0){
            System.out.println(contact.getName() + " was not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was deleted");
        return true;
    }
    private int findContacts(String contactName){
        for(int i=0; i<this.myContacts.size();i++){
            Contacts contact = this.myContacts.get(i);
            if(contact.getName().equalsIgnoreCase(contactName)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contacts contact){
        if(findContacts(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contacts queryContact(String contact){
        int position = findContacts(contact);
        if (position >=0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact list: ");
        for (int i = 0;i<myContacts.size();i++){
            System.out.println((i+1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
