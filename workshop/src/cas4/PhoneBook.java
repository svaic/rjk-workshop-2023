package cas4;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contacts;

    public PhoneBook() {
        this.contacts = new ArrayList<>();
    }

    public void add(Contact contact) {
        contacts.add(contact);
    }

    public void update(int index, String number) {
        contacts.get(index).setNumber(number);
    }

    public void update(int index, String name, String number) {
        Contact contact = contacts.get(index);
        contact.setName(name);
        contact.setNumber(number);
    }

    public void print() {
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(i + ")" + contacts.get(i).print());
        }
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}
