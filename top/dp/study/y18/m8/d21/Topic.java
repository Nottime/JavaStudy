package top.dp.study.y18.m8.d21;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Topic<T> {
	private static Topic<? extends Object> topic = null;
	
	private Topic() {};
	
	public static <T> Topic<T> getInstance() {
		Topic<T> topic1 = new Topic<T>();		
	    return topic1;
	}
	
	private Map<String, List<T>> datamap = new HashMap<>();
	private Map<String, Integer> indexMap = new HashMap<>();
    
//	public static void produce(String topic, String message){		
//		 List<String> list = datamap.containsKey(topic) ? datamap.get(topic) : new LinkedList<>();
//		 mapAdd(topic, message, list);
//		 if(indexMap.get(topic) != null) {
//	            indexMap.put(topic, indexMap.get(topic));
//	        }else {
//	            indexMap.put(topic,0);  
//	        }   
//	}
	
	public void produce(String topic, T message){		
		if(datamap.containsKey(topic)) {
			List<T> list = datamap.get(topic);
			mapAdd(topic, message, list);
		    indexMap.put(topic, indexMap.get(topic));
		}else {
			List<T> list = new LinkedList<>();
			mapAdd(topic, message, list);
			indexMap.put(topic, 0);
		}
	}

    public T consume(String topic) {
        if(datamap.containsKey(topic)){
            List<T> list = datamap.get(topic);
            if(list.size() == 0){
                return null;
            }else{  
                   int index = indexMap.get(topic);
                   if(index <= list.size() - 1) {
                       indexMap.put(topic, index+1);
                       return list.get(index);                       
                   }
            }                       
          }
        return null;        
    }
    
//    public static List<String> consume(String topic, int number) {
//        if(datamap.containsKey(topic)){
//            List<String> list = datamap.get(topic);
//            List<String> result = new LinkedList<>();
//            for(int i = 0; i <= number; i++) {
//            	if(list.get(i) == null) {
//            		return result;
//            	}
//            	result.add(list.get(i));
//            }
//          }
//        return null;        
//    }
//    public List<String> consume(String topic, int number) {
//    	List<String> result = new LinkedList<>();
//        for(int i = 0; i <= number; i++) {
//        	String key = consume(topic);
//        	if(key == null) {
//        		return result;
//        	}
//        	result.add(key);
//        }
//		return result;
//    }
    
    public List<T> consume(String topic, int number) {
    	List<T> result = new LinkedList<>();
        for(int i = 0; i <= number; i++) {
        	if(consume(topic) == null) {
        		return result;
        	}
        	result.add(consume(topic));
        }
		return result;
    }
    
    public void reset(String topic) {
        if(datamap.containsKey(topic)){
              indexMap.put(topic, 0);              
            }                                       
    }
       
    private void mapAdd(String topic, T message, List<T> list)
    {
        list.add(message);
        datamap.put(topic, list);              
    }
	
}
