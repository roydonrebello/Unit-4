/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paymentgatewayapp;

/**
 *
 * @author roydo
 */
public class TransactionBean {
    private String transactionId;
    private double amount;
    private String status;

    // Constructor
    public TransactionBean(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.status = "Pending"; // Default status
    }

    // Getter and Setter methods
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transaction[ID=" + transactionId + ", amount=" + amount + ", status=" + status + "]";
    }
}
