package org.mylist;

import java.util.ArrayList;

public class MyList{
    private  ArrayList<String> list = new ArrayList<>(5);
    public MyList() {
    }

    public void add(String item){
        increase();
        if(item.toUpperCase().startsWith("C"))
            list.add(item);
    }
    public void print(){
        System.out.println(list);
    }

    public void increase(){
        if (list.size()==5)
            list.ensureCapacity(+7);
    }

    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add("Ceren");
        myList.add("cem");
        myList.add("cengiz");
        myList.add("Cem");
        myList.add("Seren");
        myList.add("Funda");

        myList.print();
    }



}
