/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contactbook;

/**
 *
 * @author roydo
 */
import java.util.ArrayList;
import java.util.List;

public class ContactBook {
    private List<ContactBean> contacts;

    // Constructor
    public ContactBook() {
        contacts = new ArrayList<>();
    }

    // Add a contact
    public void addContact(ContactBean contact) {
        contacts.add(contact);
    }

    // Remove a contact
    public void removeContact(ContactBean contact) {
        contacts.remove(contact);
    }

    // List all contacts
    public List<ContactBean> getContacts() {
        return contacts;
    }
}
