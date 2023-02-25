package cas4_p;

import java.util.ArrayList;
import java.util.List;

public class TelephoneBook {
    private List<Contact> contacts;

    public TelephoneBook() {
        contacts = new ArrayList<>();
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void updateContact(int index, String newNumber) {
        contacts.get(index - 1).setPhoneNumber(newNumber);
    }

    public void updateContact(int index, String name, String newNumber) {
        Contact contact = contacts.get(index - 1);
        contact.setName(name);
        contact.setPhoneNumber(newNumber);
    }

    public void print() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ")" + contacts.get(i).print());
        }
    }
}
