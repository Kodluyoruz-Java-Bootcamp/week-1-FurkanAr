package org.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Real Madrid");
        set.add("Inter");
        set.add("Bayern Münih");
        set.add("Braga");
        set.add("Monaco");
        set.add("Monaco");

        System.out.println("Set: "+ set);
        System.out.println("Eleman var mı? "+set.contains("Roma"));
        set.remove("Bayern Münih");
        System.out.println("Set: "+ set);
        set.clear(); //öğeleri temizler
        System.out.println("Set: "+ set);

        System.out.println("-----------------------");

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(15);
        hashSet.add(25);
        hashSet.add(0);
        hashSet.add(35);
        hashSet.add(5);
        System.out.println("Set: "+ hashSet);
        System.out.println("5 var mı "+ hashSet.contains(5));
        System.out.println("Boyutu: "+ hashSet.size());
        hashSet.remove(5); //5 i sil
        System.out.println("Set: "+ hashSet);

    }
}
