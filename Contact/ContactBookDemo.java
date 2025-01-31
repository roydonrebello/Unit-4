/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactbook;

/**
 *
 * @author roydo
 */
public class ContactBookDemo {
    public static void main(String[] args) {
        ContactBook contactBook = new ContactBook();

        // Create new contacts
        ContactBean contact1 = new ContactBean("John Doe", "123-456-7890", "johndoe@example.com");
        ContactBean contact2 = new ContactBean("Jane Smith", "987-654-3210", "janesmith@example.com");

        // Add contacts to the contact book
        contactBook.addContact(contact1);
        contactBook.addContact(contact2);

        // List all contacts
        System.out.println("Contact List:");
        for (ContactBean contact : contactBook.getContacts()) {
            System.out.println(contact);
        }

        // Remove a contact
        contactBook.removeContact(contact1);

        // List remaining contacts
        System.out.println("\nAfter removing John Doe:");
        for (ContactBean contact : contactBook.getContacts()) {
            System.out.println(contact);
        }
    }
}
