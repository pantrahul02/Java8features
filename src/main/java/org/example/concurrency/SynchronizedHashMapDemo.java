package org.example.concurrency;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SynchronizedHashMapDemo {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String,String>();
        Collections.synchronizedMap(map);

        map.put("India","Delhi");
        map.put("Japan","Tokyo");
        map.put("France","Paris");
        map.put("Russia","Moscow");
        map.put("Pakistan","Islamabad");
        map.put("Srilanka","Colombo");

        Iterator<String> ittr = map.keySet().iterator();
        while(ittr.hasNext()){
            String countyObj = ittr.next();
            //map.put("abc","xyz");
            String capital = map.get(countyObj);
            System.out.println(countyObj+ " "+capital);
        }

        map.entrySet().forEach(entry ->{
            System.out.println(map.keySet());
            map.put("xyz","abc");
            System.out.println(map.get(map.keySet()));
        });

        System.out.println("=================");

       /* map.entrySet().stream().forEach(entry -> {
            entry.getKey()+ " : "+ entry.getValue()
        });
*/
        map.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey().startsWith("P") + " => " + entry.getValue());
        });

        System.out.println("************");

        map.entrySet().stream().filter(entry -> entry.getKey().startsWith("P")).forEach(entry-> System.out.println(entry.getKey() + " "+entry.getValue()));

        System.out.println("=====================");

        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        });
    }
}
