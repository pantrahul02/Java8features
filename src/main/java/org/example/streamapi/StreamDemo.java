package org.example.streamapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("jane");
        list.add("marik");
        list.add("eugene");
        list.add("mac");
        list.add("peter");

        //(T t)-> System.out.println(t);

        /*for(String s : list){
            if(s.startsWith("j"))
                System.out.println(s);
        }*/


        list.stream().filter(t-> t.startsWith("m")).forEach(System.out::println);
        //list.forEach(System.out::println);

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");
        map.put(4,"d");

        //map.forEach((k,v)-> System.out.println(k +" "+v));

        //map.entrySet().stream().forEach(obj-> System.out.println(obj));

        map.entrySet().stream().filter(k-> k.getKey() % 2 == 0).forEach(obj-> System.out.println(obj));

    }
}
