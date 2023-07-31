package com.design.patterns.behavioral.templatemethod;

public class F1CarOrder extends OrderTemplate{

    // Optional override of hook
    {
        this.isGift = true;
    }

    @Override
    public void doCheckout() {
        System.out.println("Checking out with F1 car");
    }

    @Override
    public void doPayment() {
        System.out.println("Paying 500000 dollars");
    }

    @Override
    public void doReceipt() {
        System.out.println("Receipt generated");
    }

    @Override
    public void doDelivery() {
        System.out.println("Booking tow truck to send car");
    }
}
