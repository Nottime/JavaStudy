package top.dp.study.y18.m8.d21;


public class TopicTest {
    public static void main(String[] args) {	
		Producer pro = new Producer("1");
//		pro.Produce("I");
//		pro.Produce("have");
//		pro.Produce("an");
//		pro.Produce("apple");
//		Consumer con = new Consumer("1");
//		System.out.println(con.consume());
//		System.out.println(con.consume());
//		System.out.println(con.consume());
//		System.out.println(con.consume());
//		System.out.println(con.consume());
//		System.out.println(con.consume());
//		System.out.println(con.consume());
//		con.reset();
//		System.out.println(con.consume());
//		I
//		have
//		an
//		apple
//		null
//		null
//		null
//		I		
		
//		Consumer con = new Consumer("1");
//        System.out.println(con.consume());
		//null
		
    pro.produce("I");
    pro.produce("have");
    pro.produce("an");
    pro.produce("apple");
    Consumer con = new Consumer("1");
    System.out.println(con.consume());
    System.out.println(con.consume());
    System.out.println(con.consume());
    System.out.println(con.consume());
    System.out.println(con.consume());
    pro.produce("balance");
    System.out.println(con.consume());
    System.out.println(con.consume());
    System.out.println(con.consume());
    pro.produce("balance");
    pro.produce("balance");
    System.out.println(con.consume());
    System.out.println(con.consume());
    System.out.println(con.consume());
    con.reset();
    System.out.println(con.consume());
    System.out.println(con.consume());
    System.out.println(con.consume());
    System.out.println(con.consume());
    System.out.println(con.consume());
    System.out.println(con.consume());
//    I
//    have
//    an
//    apple
//    null
//    balance
//    null
//    null
//    balance
//    balance
//    null
//    I
//    have
//    an
//    apple
//    balance
//    balance

	}

}
