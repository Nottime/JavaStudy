package top.dp.study.y18.m7.d12;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class Test7 {
	public static void main(String[] args) {
        Long setCost = setFor();
		Long listCost =listRemove();
		if(setCost < listCost) {
			System.out.println("set '难受'");
		}
		
		if(setCost > listCost) {
			System.out.println("list ����");
		}
		
		if(setCost == listCost) {
			System.out.println("set,list ����൱�Ķ���");
		}
	}

	private static Long listRemove() {
		List<Long> listIds1 = new LinkedList<>();
		List<Long> listIds2 = new LinkedList<>();
		Long num = 1L;
		for(int i = 0; i < 10000 ; i++) {
			listIds1.add(num++);
		}
		listIds1.add(1000001L);
		num = 1L;
		for(int i= 0; i < 10000; i++) {
			listIds2.add(num);
		}
		Long begin = System.currentTimeMillis();		
		listIds1.removeAll(listIds2);
		listIds1.addAll(listIds2);
		Long cost = System.currentTimeMillis() - begin;
		System.out.println("listremove ���ѵ�ʱ�� ��"+cost);
		System.out.println("list ���ȣ�"+listIds1.size());
		return cost;
	}

	private static Long setFor() {
		List<Long> ids = new LinkedList<>();
		List<Long> listIds1 = new LinkedList<>();
		List<Long> listIds2 = new LinkedList<>();
		Long num = 1L;
		for(int i = 0; i < 10000 ; i++) {
			listIds1.add(num++);
		}
		listIds1.add(1000001L);
		num = 1L;
		Long begin = System.currentTimeMillis();
		Set<Long> set = new HashSet<>();
		set.clear();
		set.addAll(listIds1);
		set.addAll(listIds2);
		for(Long brandId : set) {
			ids.add(brandId);
		}
		
		Long cost = System.currentTimeMillis() - begin;
		System.out.println("set ���ѵ�ʱ�� ��"+cost);
		System.out.println("list ���ȣ�"+ids.size());
		return cost;
	}
	
	

}
