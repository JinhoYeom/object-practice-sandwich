package com.greedy.sandwichkiosk;

import java.util.Scanner;

public class Order {
	
	SandwichDTO sandDTO = new SandwichDTO();
	Scanner sc = new Scanner(System.in);
	
	int value = 0;
	
	String[] orderlist = new String[value];
	
	public void orderDecide(int num) {
		System.out.println("선택한 메뉴의 레시피");
		System.out.println(sandDTO.bread[num] + sandDTO.main[num] + sandDTO.vegetable[num] + sandDTO.source[num]);
		System.out.println("샌드위치 구매를 확정하시겠습니까? y/n");
		char yn = sc.next().charAt(0); 
		
		switch(yn) {
		case 'y' : 
			
		}
	}
	
	public void orderPlus(String order) {
		value++;
		orderlist[value-1] = order;
	}
	
	public void orderList() {
		if(value == 0) {
			System.out.println("아직 주문한 메뉴가 없습니다.");
		}
		System.out.print("주문한 메뉴 목록 : ");
		for (int i = 0; i < orderlist.length; i++) {
			System.out.println(orderlist[i] + " ");
		}
		System.out.println();
	}

}
