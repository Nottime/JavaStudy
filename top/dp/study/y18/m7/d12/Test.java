package top.dp.study.y18.m7.d12;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test {
    public static void main(String[] args)
    {
        Map<String,String> map = new HashMap<>();
        map.put("key1", "do");
        map.put("key2", "everything");
        map.put("key3", "or");
        map.keySet().size();
        for(String key : map.keySet()) {
           System.out.println(key + map.get(key));          
        }
        
        
        map.entrySet().size();
        for(Entry<String, String> entry : map.entrySet()) {
        	System.out.println(entry.getKey() + entry.getValue());
        }
        
    }

}
