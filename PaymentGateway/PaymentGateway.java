/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paymentgatewayapp;

/**
 *
 * @author roydo
 */
public class PaymentGateway {

    private PaymentBean payment;
    private TransactionBean transaction;
    private UserBean user;
    private NotificationBean notification;

    public PaymentGateway(UserBean user, PaymentBean payment) {
        this.user = user;
        this.payment = payment;
        this.notification = new NotificationBean();
    }

    // Simulate a payment transaction and process it
    public void processTransaction() {
        // Create a new transaction
        transaction = new TransactionBean(generateTransactionId(), payment.getAmount());

        // Simulate payment processing logic
        System.out.println("Processing payment for: " + user.getName());
        System.out.println("Payment Method: " + payment.getPaymentMethod());

        // After processing, update the transaction status
        transaction.setStatus("Processed");

        // Send notification to user about the transaction
        notification.sendNotification(user, transaction);

        // Output the result
        System.out.println("Transaction successfully processed: " + transaction);
    }

    // Generate a simple transaction ID (in a real-world case, it should be unique and more complex)
    private String generateTransactionId() {
        return "TXN" + System.currentTimeMillis();
    }
}
