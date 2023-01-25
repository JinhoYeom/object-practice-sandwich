package com.greedy.sandwichkiosk;

import java.util.Scanner;

public class Kiosk {
	
	Order order = new Order();
	
	SandwichDTO sand = new SandwichDTO();
	
	Drink drink = new Drink();
	
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("====== 샌드위치 키오스크 ====");
		System.out.println("1. 샌드위치 고르기");
		System.out.println("2. 음료 고르기");
		System.out.println("3. 주문 목록 확인");
		System.out.println("9. 결제하기");
		System.out.print("메뉴 선택 : ");
		int no = sc.nextInt();
		
		switch(no) {
		case 1 : sand.sandMenu();
			     break;
		case 2 : drink.drinkMenu();
				 break;
		case 3 : order.orderList();
			     break;
		case 9 : order.finishOrder();
				 return;
		default : System.out.println("잘못된 번호를 선택하셨습니다.");
		   		  break;
		}
	}
}
}
