package com;

import java.util.*;

/**
 * Created by alexandr on 10.07.15.
 * {@link http://stackoverflow.com/questions/9919734/selecting-random-key-and-value-sets-from-a-map-in-java}
 * {@link http://crunchify.com/java-how-to-get-random-key-value-element-from-hashmap/}
 * ******************************************************
 * Selecting random key and value sets from a Map in Java
 * Java: How to Get Random Key-Value Element From HashMap
 */
public class MyHashMap {

    public static void main(String[] args) {
        /* Create a hashtable and put some key-value pair */
        HashMap<String, String> companies = new HashMap<>();
        companies.put("eBay", "South San Jose");
        companies.put("Paypal", "North San Jose");
        companies.put("Google", "Mountain View");
        companies.put("Yahoo", "Santa Clara");
        companies.put("Twitter", "San Francisco");

        /* Get a random entry from the HashMap. */
        Object[] crunchifyKeys = companies.keySet().toArray();
        Object             key = crunchifyKeys[new Random().nextInt(crunchifyKeys.length)];
        System.out.println("************ Random Value ************ \n" + key + " :: " + companies.get(key));

        /* Bonus Crunchify Tips: How to Shuffle a List?? Each time you get a different order... */
        List<Map.Entry<String, String>> list = new ArrayList<>( companies.entrySet() );
        System.out.println("\n************ Now Let's start shuffling list ************");
        Collections.shuffle(list);
        for (Map.Entry<String,String> entry:list)
            System.out.println(entry.getKey() + " :: " + entry.getValue());




//        final Map<String, String> monthMap = new HashMap<>();
//        monthMap.put("01", "Jan");
//        monthMap.put("02", "Feb");
//        monthMap.put("03", "Mar");
//        monthMap.put("04", "Apr");
//        monthMap.put("05", "May");
//        monthMap.put("06", "Jun");
//        monthMap.put("07", "Jul");
//        monthMap.put("08", "Aug");
//        monthMap.put("09", "Sep");
//        monthMap.put("10", "Oct");
//        monthMap.put("11", "Nov");
//        monthMap.put("12", "Dec");
//        Object randomName = monthMap.keySet().toArray()[new Random().nextInt(monthMap.keySet().toArray().length)];
//        System.out.println(randomName.toString()+"-"+monthMap.get(randomName));
    }



    public static <K, V>Map<K, V> sampleFromMap(Map<? extends K, ? extends V> source, int n, Random rnd) {
        List<K> chosenKeys = new ArrayList<>();
        int count = 0;
        for (K k: source.keySet()) {
            if (count++ < n) {
                chosenKeys.add(k);
                if (count == n)
                    Collections.shuffle(chosenKeys, rnd);
            } else {
                int pos = rnd.nextInt(count);
                if (pos < n)
                    chosenKeys.set(pos, k);
            }
        }

        Map<K, V> result = new HashMap<>();
        for (K k: chosenKeys) {
            result.put(k, source.get(k));
        }

        return Collections.unmodifiableMap(result);
    }

}
