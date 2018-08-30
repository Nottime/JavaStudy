package top.dp.study.y18.m7.d12;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
//		for(int i= 0; i < list.size(); i++) {
//			
//				list.remove(i);
//			
//		}		
//		System.out.println(list);// [2,4]
		
		
//		for(int i = list.size() - 1; i >= 0; i--) {
//			
//				list.remove(0);
//			
//		}
//		System.out.println(list);// []
		
		
		for (int i = list.size() - 1; i >= 0; i--) {
			
				list.remove(i);
			
		}
		System.out.println(list);// []
		
	}

}
