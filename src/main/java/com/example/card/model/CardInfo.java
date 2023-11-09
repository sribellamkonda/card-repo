package com.example.card.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CardInfo {

    @NotNull(message = "Card Number is mandatory")
    @Size(min = 15, max = 16, message = "Please enter valid card number")
    private String number;

    @NotNull(message = "First Name is mandatory")
    private String firstName;

    @NotNull(message = "Last Name is mandatory")
    private String lastName;

    @NotNull(message = "Billing Address is mandatory")
    private String billingAddress;

    private String shippingAddress;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }
}