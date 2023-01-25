package com.greedy.sandwichkiosk;

import java.util.Scanner;

public class SandwichDTO {

	Scanner sc = new Scanner(System.in);
	
	Order order = new Order();
	Drink drink = new Drink();
	
	int num = 0;
	
	String[] sandwich = {"1.로스트치킨", "2.비엘티", "3.에그마요", "4.참치", "5.폴드포크"}; 
	
	String[] bread = {"플랫브래드", "허니오트", "위트", "하티", "플랫브래드"};
	String[] main = {"닭가슴살", "베이컨", "계란", "참치", "바베큐"};
	String[] vegetable = {"양상추", "양상추", "양상추", "양파", "양파"};
	String[] source = {"칠리", "랜치", "마요네즈", "마요네즈", "바베큐"};
	
	String[][] recipe = {bread,main,vegetable,source};

	public void sandMenu() {
		for (int i = 0; i < sandwich.length; i++) {
			System.out.print(sandwich[i] + " ");
		}
		System.out.println();
		System.out.print("샌드위치를 선택하세요(0을 누르면 취소합니다.) : ");
		int no = sc.nextInt();
		
		switch(no) {
		case 0 : 
			System.out.println("샌드위치 선택을 취소하셨습니다.");
			return;
		case 1 : 
			System.out.println("로스트치킨을 선택하셨습니다.");
			order.orderDecide(num);
			break;
		}
	}

}
