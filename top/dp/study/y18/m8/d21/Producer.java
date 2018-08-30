package top.dp.study.y18.m8.d21;

public class Producer<T>{
private String topic;

//    private String topic;
//    
//    private static Producer producer;
//    private Producer(){};
//    
//    public static Producer getInstance() {
//        if(producer == null) {
//            producer = new Producer();
//        }
//        return producer;
//    }
   
    public Producer(String topic)
    {
        this.topic = topic;
    }
    
    public void produce(T message){   
    	Topic.getInstance().produce(this.topic, message);
//        Topic.produce(this.topic, message);                 
  }
}
