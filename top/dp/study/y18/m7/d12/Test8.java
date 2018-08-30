package top.dp.study.y18.m7.d12;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

public class Test8 {
	public static void main(String[] args) {
		List list  = new LinkedList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.remove(0);
		list.get(0);
		System.out.println(System.currentTimeMillis());
		System.out.println(System.currentTimeMillis()-24*3600000);
		SimpleDateFormat simpleDateFormat  = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		System.out.println(simpleDateFormat.format(System.currentTimeMillis()-24*3600000));
	}

}
