package series.fun.java.chap02.homework;

import java.util.Scanner;

public class CoffeeShop {

	/*** util ***/
	public static void line() {
		System.out.println("=======================");
	}

	public static int inputData(Scanner keyboard) {
		System.out.print("[입력] : ");
		return keyboard.nextInt();
	}
	
	/*** view ***/
	public static void viewMain() {
		line();
		System.out.println("-----< Java Coffee Store >-----");
		System.out.println("1. 커피 주문");
		System.out.println("2. 매출 관리");
		System.out.println("3. 재고 관리");
		System.out.println("0. 프로그램 종료");
		line();
	}

	public static void viewOrder() {
		line();
		System.out.println("  [  커  피  주  문  ]  ");
		System.out.println("1. 아메리카노\t 3000원");
		System.out.println("2. 에스프레소\t 2700원");
		System.out.println("3. 카페라떼\t 3500원");
		System.out.println("0. 나가기");
		line();
	}

	public static void viewSales() {
		line();
		System.out.println("  [  매  출  관  리  ]  ");
		System.out.println("1. 매출 확인");
		System.out.println("0. 나가기");
		line();
	}

	public static void viewStock() {
		line();
		System.out.println("  [  재  고  관  리  ]  ");
		System.out.println("1. 재고 확인");
		System.out.println("0. 나가기");
		line();
	}

	/***  Controller ***/
	public static int mainController(Scanner keyboard) {
		switch(inputData(keyboard)) {
			case 1: //커피주문
				viewOrder();
				return 1;
			case 2: //매출관리
				viewSales();
				return 2;
			case 3: //재고관리
				viewStock();
				return 3;
			case 0: //프로그램 종료
				return 0;
			default:
				System.out.println("잘못 입력하셨습니다.");
				return 9;
		}
	}

	public static int orderController(int select, int sale, String[] coffee, int[] price, int[] stock) {
		if(select == 0 || !(select >= 1 && select <= 3)) {
			if(select != 0) {
				System.out.println("잘못 입력하셨습니다.");
			}
			return sale;
		}
		select--;
		if(stock[select] != 0) {
			System.out.printf("%s를 주문해주셔서 감사합니다. 결제금액은 %d원 입니다.\n",coffee[select],price[select]);
			stock[select] -= 1;
			return sale+=price[select];
		}else {
			System.out.println("죄송합니다. 재고가 없습니다.");
			return sale;
		}
	}

	public static void salesController(int select, int sale) {
		if(select == 0 || select != 1) {
			if(select != 0) {
				System.out.println("잘못 입력하셨습니다.");
			}
			return;
		}
		System.out.println("매출액은 " + sale + "원 입니다.");
	}
	
	public static void stockController(int select, String[] coffee, int[] stock) {
		if(select == 0 || (select !=1 && select !=2)) {
			if(select != 0) {
				System.out.println("잘못 입력하셨습니다.");
			}
			return;
		}
		System.out.println("현재 재고 상황은...");
		for(int i = 0; i < coffee.length; i++) {
			System.out.printf("\t%s : %d개\n", coffee[i], stock[i]);
		}
	}

	/*** main ***/
	public static void coffeeShopProgram() {
		/* system */
		Scanner keyboard = new Scanner(System.in); //키보드 입력
		boolean isTerminate = false;
		
		/* DB & Model */
		int sale = 0;
		String[] coffee = {"아메리카노","에스프레소","카페라떼"};
		int[] price = {3000, 2700, 3500};
		int[] stock = {10,10,10};
		
		/* 프로그램 실행 */
		while(!isTerminate) {
			viewMain();
			int service = mainController(keyboard); //1:주문, 2:매출, 3:재고, 0:종료, 9:재진입
			switch(service) {
				case 1:
					sale = orderController(inputData(keyboard), sale, coffee, price, stock);
					break;
				case 2:
					salesController(inputData(keyboard), sale);
					break;
				case 3:
					stockController(inputData(keyboard),coffee, stock);
					break;
				case 0:
					isTerminate = true;
					break;
				case 9:
					break;
				default:
					break;
			}//switch
		}//while
		System.out.println("프로그램이 종료됩니다.");
		keyboard.close();
	}//coffeeShopProgram()
	
	public static void main(String[] args) {
		coffeeShopProgram();
	}
	
}

