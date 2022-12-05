package org.collections.list;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Liste: "+ list);
        System.out.println("Boyutu: "+ list.size());
        System.out.println("İlk eleman: "+list.get(0));
        System.out.println("5 sayısı var mı? "+ list.contains(5));
        System.out.println("2. indeksi sil: "+list.remove(2));
        System.out.println(list);
        System.out.println("5 sayısının indeksi: "+list.indexOf(5));
        list.clear(); //listeyi temizler
        System.out.println(list);

        System.out.println("-----------------------");

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Cem");
        linkedList.add("Ceren");
        linkedList.add("Kemal");
        linkedList.add("Gizem");
        linkedList.add("Akif");
        System.out.println("Liste: " + linkedList);
        System.out.println("Boyutu: "+ linkedList.size());
        System.out.println("Listeler aynı mı? " +linkedList.equals(list));
        System.out.println("2. eleman " +linkedList.get(2));
        System.out.println("2. elemanı sil " + linkedList.remove(2));
        System.out.println("Liste: " + linkedList);
        System.out.println("Akif bu listede var mı? " +linkedList.contains("Akif"));

        List<String> newList = new LinkedList<>();
        newList.add("Simge");
        newList.add("Faruk");
        System.out.println("Yeni Liste: " + newList);
        linkedList.addAll(newList);
        System.out.println("Birleşmiş Liste: " + linkedList);

        System.out.println("-----------------------");

        Stack<Integer> stack = new Stack<>();
        stack.push(6);
        stack.push(20);
        stack.push(30);
        stack.push(12);
        stack.push(2);
        System.out.println("Stack: " + stack);
        System.out.println("Tepe = " + stack.peek());
        System.out.println("Stack boş mu? "+stack.isEmpty());
        System.out.println("6 nerede? " + stack.search(6));
        stack.set(0,15); // ilk değeri 15 yap
        System.out.println("Stack: " + stack);
        System.out.println("Tepedeki silince= " + stack.pop());


        Stack<Integer> newStack = new Stack<>();
        newStack.push(6);
        newStack.push(20);
        newStack.push(30);
        newStack.push(12);
        newStack.push(2);
        System.out.println("Stack yeni stacki kapsıyor mu? " + stack.containsAll(newStack));



    }
}
