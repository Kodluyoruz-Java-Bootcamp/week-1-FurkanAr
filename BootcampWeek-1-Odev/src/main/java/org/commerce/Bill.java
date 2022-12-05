package org.commerce;

public class Bill {
    private Order order;

    public Bill(Order order) {
        this.order = order;
    }


    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }




}
