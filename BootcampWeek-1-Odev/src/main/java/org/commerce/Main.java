package org.commerce;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Customer cem = new Customer("Cem",25);
        Customer ekrem = new Customer("Ekrem",28);

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(cem);
        customers.add(ekrem);


        Product telefon = new Product("Teknooji", 5000,"Telefon",5);
        Product tv =new Product("Teknooji", 15000,"Tv",10);
        Product ayakkabı = new Product("Gündelik", 1000, "Ayakkabı", 5);

        Order orderCem = new Order();
        orderCem.setCustomer(cem);
        telefon.setStock(telefon.getStock()-4);
        ayakkabı.setStock(ayakkabı.getStock()-4);
        orderCem.setProduct(List.of(telefon,ayakkabı));

        Order orderEkrem = new Order();
        orderEkrem.setCustomer(ekrem);
        tv.setStock(tv.getStock()-8);
        orderEkrem.setProduct(List.of(tv));

        ArrayList<Order> orders = new ArrayList<>();
        orders.add(orderEkrem);
        orders.add(orderCem);

        Bill billCem = new Bill(orderCem);
        Bill billEkrem = new Bill(orderEkrem);

        ArrayList<Bill> bills = new ArrayList<>();
        bills.add(billEkrem);
        bills.add(billCem);

        System.out.println("Müşteri sayısı: "+ customers.size());
        System.out.println("----------------------------");

        for (Order order: orders){
            if(order.getCustomer().getName().equals("Cem"))
                order.getProduct().forEach(s -> System.out.println("Müşteri: "+
                        order.getCustomer().getName() + " Aldığı ürün : "
                                + s.getName() + " adet: " + s.getStock()));
        }

        System.out.println("----------------------------");

        for (Bill bill : bills){
            if(bill.getOrder().getCustomer().getName().equals("Cem") &&
                            (bill.getOrder().getCustomer().getAge()<30 &&
                            bill.getOrder().getCustomer().getAge() >= 25))

                System.out.println("Müşteri: "+ bill.getOrder().getCustomer().getName()
                        + " toplam fatura: " +calc(bill));

        }
        System.out.println("----------------------------");


        for (Bill bill : bills){
            double price = calc(bill);
            if (price>1500)
            {
                bill.getOrder().getProduct().forEach(s -> {
                    System.out.println("Fatura: Ürün : " +
                            s.getName() + " Adet: " + s.getStock() + " Fiyat: " +
                            s.getPrice() + " Kategori : " + s.getCategory());
                });
                System.out.println("Müşteri: "+ bill.getOrder().getCustomer().getName() +
                        " toplam fatura: " + price);
                System.out.println("----------------------------");
            }
        }

    }
    public static double calc(Bill bill){
        double total = 0.0;
        for(Product product: bill.getOrder().getProduct()){
            double price = product.getPrice() * product.getStock();
            total += price;
        }
        return total;
    }

}
