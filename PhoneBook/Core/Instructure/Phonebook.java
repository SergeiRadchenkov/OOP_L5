package PhoneBook.Core.Instructure;

import java.util.ArrayList;
import java.util.List;

import PhoneBook.Core.Models.Contact;

public class Phonebook {

    private List<Contact> contacts;

    public Phonebook() {
        contacts = new ArrayList<Contact>();
    }

    public boolean add(Contact contact) {
        boolean flag = false;
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            flag = true;
        }
        return flag;
    }

    public Contact getContact(int index) {
        return contains(index) ? contacts.get(index) : null;
    }

    public boolean remove(Contact contact) {
        boolean flag = false;
        if (contacts.indexOf(contact) != -1) {
            contacts.remove(contact);
            flag = true;
        }
        return flag;
    }

    private boolean contains(int index) {
        return contacts != null
                && contacts.size() > index;
    }

    public List<Contact> getContacts() {
        return contacts;
    }


    public int count() {
        return contacts.size();
    }
}
