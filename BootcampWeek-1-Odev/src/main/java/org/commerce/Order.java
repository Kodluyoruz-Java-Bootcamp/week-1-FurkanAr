package org.commerce;

import java.util.List;

public class Order {
    private Customer customer;
    private List<Product> product;

    public Order(){}


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }


}
