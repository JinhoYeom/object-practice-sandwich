package com.greedy.sandwichkiosk;

import java.util.Scanner;

public class Drink {

	String[] drinkmenu = new String[] {"1.아메리카노",  "2.콜라", "3.제로콜라", "4.사이다", "5.환타"};
	
	Scanner sc = new Scanner(System.in);
	Order order = new Order();
	
	public void drinkMenu() {
		for (int i = 0; i < drinkmenu.length; i++) {
			System.out.print(drinkmenu[i] + " ");
		}
		System.out.print("음료를 선택하세요(0울 누르시면 취소합니다.) : ");
		int no = sc.nextInt();
		
		switch(no) {
			case 0 : 
				System.out.println("음료 선택을 취소하셨습니다.");
				return;
			case 1 : 
				System.out.println("아메리카노를 선택하셨습니다.");
				order.orderPlus("아메리카노");
				break;
			case 2 :
				System.out.println("콜라를 선택하셨습니다.");
				order.orderPlus("콜라");
				break;
			case 3 :
				System.out.println("제로콜라를 선택하셨습니다.");
				order.orderPlus("제로콜라");
				break;
			case 4 :
				System.out.println("사이다를 선택하셨습니다.");
				order.orderPlus("사이다");
				break;
			case 5 :
				System.out.println("환타를 선택하셨습니다.");
				order.orderPlus("환타");
				break;
			default : 
				System.out.println("잘못된 번호를 선택하셨습니다.");
				break;
		}
	}

}
