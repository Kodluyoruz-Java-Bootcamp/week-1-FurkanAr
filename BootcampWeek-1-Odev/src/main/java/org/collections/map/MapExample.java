package org.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(0,"Ankara");
        map.put(1,"Istanbul");
        map.put(2, "Izmir");
        map.put(3, "Bursa");
        map.put(4, "Antalya");

        System.out.println("Map: "+ map);
        System.out.println("0 numaralı keyin değeri: "+map.get(0));
        System.out.println("İstanbul var mı?: "+map.containsValue("Istanbul"));
        System.out.println("5 numaralı keyi getir: "+map.containsKey(5));
        System.out.println("keyler: "+map.keySet());
        System.out.println("value: "+map.values());
        map.remove(0,"Ankara"); // map den sil
        System.out.println("Map: "+ map);
        map.replace(1,"Ankara"); // İstanbulu ankara ile değiş
        System.out.println("Map: "+ map);

        System.out.println("---------------");

        Map<String, Double> hashMap = new HashMap<>();
        hashMap.put("Elif", 75.00);
        hashMap.put("Cem", 80.5);
        hashMap.put("Deniz", 70.0);
        hashMap.put("Funda", 90.75);
        hashMap.put("Ekrem", 100.0);
        hashMap.put("Berat", 85.0);

        System.out.println("Map: "+ hashMap);
        hashMap.remove("Elif"); // Elifi map den sil
        System.out.println("Map: "+ hashMap);
        System.out.println("Değer map de var mı: "+  hashMap.containsValue(70.0));
        System.out.println("Map: "+ hashMap.entrySet());
        System.out.println("Map boş mu: "+ hashMap.isEmpty());
        hashMap.clear(); // mapi temizle
        System.out.println("Map: "+ hashMap);

    }
}
