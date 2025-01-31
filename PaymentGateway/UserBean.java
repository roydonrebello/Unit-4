/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paymentgatewayapp;

/**
 *
 * @author roydo
 */
public class UserBean {
    private String name;
    private String email;
    private String preference;

    // Constructor
    public UserBean(String name, String email, String preference) {
        this.name = name;
        this.email = email;
        this.preference = preference;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    @Override
    public String toString() {
        return "User[name=" + name + ", email=" + email + ", preference=" + preference + "]";
    }
}
