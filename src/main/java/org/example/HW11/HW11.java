package org.example.HW11;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HW11 {
    public static void main(String[] args) {
        Map<Integer, String> userPerson= new HashMap<>();
        userPerson.put(12, "Valera" );
        userPerson.put(18, "Lera" );
        userPerson.put(20, "Lora" );
        userPerson.put(120, "Tor" );
        userPerson.put(8, "Alex" );
        userPerson.put(23, "Mike" );

        dataList(userPerson);
    }
    public static void dataList(Map<Integer, String> getValue){
        Map<Integer, String> uniqGetValye= new TreeMap<>(getValue);

        for (Map.Entry<Integer, String > result: uniqGetValye.entrySet()){
            System.out.println(result);
        }
    }
}
