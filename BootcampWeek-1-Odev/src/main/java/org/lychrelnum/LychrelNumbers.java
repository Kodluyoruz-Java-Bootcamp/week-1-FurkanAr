package org.lychrelnum;

import java.util.*;

public class LychrelNumbers {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        TreeMap<Integer, ArrayList<Long>> mapArray = new TreeMap<>();

        final int maxNumber = 100;
        long sum = 0;
        final int iteration = 100;

        for(int i = 10; i < maxNumber; i++) {
            ArrayList<Long> arrayList = new ArrayList<>();
            sum = i;
            for(int j = 1; j < iteration; j++) {
                sum = sum+reverse(sum);
                arrayList.add(sum);
                mapArray.put(i,arrayList);
                if(isPalindrome(sum)){
                    map.put(i,j);
                    break;
                }
            }
        }
        Integer max = map.values().stream().max(Integer::compare).get();
        System.out.println("Steps: "+ max);
        for (Integer key: map.keySet())
            if (max.equals(map.get(key)))
                System.out.println("Number: " + key + " -> Steps: " + mapArray.get(key));

    }

    private static long reverse(long number) {
        long reversed = 0;
        while (number > 0) {
            long remainder = number % 10;
            reversed = (reversed * 10) + remainder;
            number = number / 10;
        }
        return reversed;
    }

    private static boolean isPalindrome(long number) {
        return number == reverse(number);
    }

}
