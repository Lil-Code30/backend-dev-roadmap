package com.licode.store;

public class OrderServices {

    private PaymentService paymentService;

    public void placeOrder(){
        paymentService.processPayment(100);
    }

    public OrderServices(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
