public class Main {
    public static void main(String[] args){
        Mobile mobilePhone = new Mobile("123-456-7890");

        // Create some contact objects
        Contact contact1 = new Contact("Bob", "31415926");
        Contact contact2 = new Contact("Alice", "16180339");
        Contact contact3 = new Contact("Tom", "11235813");
        Contact contact4 = new Contact("Jane", "23571113");

        // Add contacts to the mobile phone
        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.addNewContact(contact3);
        mobilePhone.addNewContact(contact4);

        mobilePhone.printContacts();

        Contact updatedContact = new Contact("Bob", "98765432");
        mobilePhone.updateContact(contact1, updatedContact);

        System.out.println("\nAfter update:");
        mobilePhone.printContacts();

        mobilePhone.removeContact(contact2);

        System.out.println("\nAfter removal:");
        mobilePhone.printContacts();

        Contact queriedContact = mobilePhone.queryContact("Tom");
        if (queriedContact != null) {
            System.out.println("\nQueried Contact: " + queriedContact);
        } else {
            System.out.println("\nContact not found.");
        }
    }
}
