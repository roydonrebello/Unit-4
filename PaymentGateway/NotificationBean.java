/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paymentgatewayapp;

/**
 *
 * @author roydo
 */
public class NotificationBean {

    // Simulating sending a notification
    public void sendNotification(UserBean user, TransactionBean transaction) {
        System.out.println("Sending notification to " + user.getEmail() + " about Transaction ID: " + transaction.getTransactionId());
        System.out.println("Transaction Status: " + transaction.getStatus());
    }
}
