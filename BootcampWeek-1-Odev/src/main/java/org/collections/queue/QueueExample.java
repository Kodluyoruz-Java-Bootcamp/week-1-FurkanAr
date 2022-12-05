package org.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new  PriorityQueue<>();
        queue.add("Kitap");
        queue.add("Kalem");
        queue.add("Televizyon");
        queue.add("Dolap");
        queue.add("Ayakkabı");

        System.out.println("Kuyruk: "+ queue);
        System.out.println("Tepe: "+queue.element());
        System.out.println("Tepe: " +queue.peek());
        queue.offer( "Bilgisayar"); // elemanı araya ekler
        System.out.println("Kuyruk: "+ queue);
        queue.poll(); // tepedeki elemanı siler
        System.out.println("Kuyruk: "+ queue);
        queue.remove("Bilgisayar"); // elemanı siler
        System.out.println("Kuyruk: "+ queue);
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
            System.out.println("Eleman: "+ itr.next());
        }


    }
}
