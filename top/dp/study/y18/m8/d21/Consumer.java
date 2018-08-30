package top.dp.study.y18.m8.d21;

import java.util.List;

public class Consumer<T>{
    
//    private static Consumer<> consumer = new Consumer();
//    private Consumer() {};
//    
//    public static Consumer getInstance() {
//        return consumer;
//    }
    
    private String topic;
    
    public Consumer(String topic){
        this.topic =topic;
    }
    
	public T consume(){
	     return (T) Topic.getInstance().consume(this.topic);	  		   
    } 
	
	public  T consume(int number){
        return (T) Topic.getInstance().consume(this.topic,number);             
    } 
	
	public void reset() { 
		Topic.getInstance().reset(this.topic);
	}
}
