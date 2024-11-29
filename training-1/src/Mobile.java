import java.util.ArrayList;

public class Mobile {
    private String phoneNumber;
    ArrayList<Contact> contacts;

    public Mobile(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.contacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) == -1) {
            contacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact contact, Contact newContect){
        int position = findContact(contact);
        if(position != -1) {
            contacts.set(position, newContect);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position != -1) {
            contacts.remove(position);
            return true;
        }
        return false;
    }

    public int findContact(Contact contact) {
        return contacts.indexOf(contact);
    }

    public int findContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". " + contacts.get(i));
        }
    }
}
