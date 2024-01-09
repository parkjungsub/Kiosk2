import data.ProductData;
import order.Order;
import order.Print;
import screen.MenuIndex;
import screen.ScreenMenu;

import java.util.Map;
import java.util.Scanner;

public class Kiosk {
    ScreenMenu list = new ScreenMenu();
    Scanner sc = new Scanner(System.in);
    ScreenMenu screenMenu = new ScreenMenu();
    ProductData productData = new ProductData();
    Order order = new Order();
    Print print = new Print();
    int select;// 메뉴 들어가는 변수
    int option;

    public void start(){
        while (true) {
            System.out.println(screenMenu.getScreenMenu(MenuIndex.MAIN)); // 처음 메뉴판
            select = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.println(screenMenu.getScreenMenu(MenuIndex.SELECT)); // 버거 메뉴판
                    print.printBurgers();// 버거 리스트 출력
                    option = sc.nextInt(); // 버거 선택
                    System.out.println("\n\n");
                    print.getBurger(option-1);//선택한 버거 리스트 출력
                    System.out.println(screenMenu.getScreenMenu(MenuIndex.CART)); // 장바구니에 담을건지 질문
                    select = sc.nextInt(); // 장바구니 담기
                    if (select == 1) {
                        order.setMenu(productData.getBurgerData(option));// 장바구니 담기
                        break;
                    } else if (select == 2) {// 장바구니 담기 취소
                        System.out.println("진행하던 주문이 취소되었습니다.");
                        break;
                    }
                case 2:
                    System.out.println(screenMenu.getScreenMenu(MenuIndex.SELECT)); // 버거 메뉴판
                    print.printDrinks();// 쉐이크 리스트 출력
                    option = sc.nextInt(); // 쉐이크 선택
                    System.out.println("\n\n");
                    print.getShake(option-1);//선택한 쉐이크 리스트 출력
                    System.out.println(screenMenu.getScreenMenu(MenuIndex.CART)); // 장바구니에 담을건지 질문
                    select = sc.nextInt(); // 장바구니 담기
                    if (select == 1) {
                        order.setMenu(productData.getShakeData(option));// 장바구니 담기
                        break;
                    } else if (select == 2) {// 장바구니 담기 취소
                        System.out.println("진행하던 주문이 취소되었습니다.");
                        break;
                    }
                case 3:
                    System.out.println(screenMenu.getScreenMenu(MenuIndex.SELECT)); // 버거 메뉴판
                    print.printDrinks();// 음료 리스트 출력
                    option = sc.nextInt(); // 음료 선택
                    System.out.println("\n\n");
                    print.getBurger(option-1);//선택한 음료 리스트 출력
                    System.out.println(screenMenu.getScreenMenu(MenuIndex.CART)); // 장바구니에 담을건지 질문
                    select = sc.nextInt(); // 장바구니 담기
                    if (select == 1) {
                        order.setMenu(productData.getDrinkData(option));// 장바구니 담기
                        break;
                    } else if (select == 2) {// 장바구니 담기 취소
                        System.out.println("진행하던 주문이 취소되었습니다.");
                        break;
                    }
                case 4:
                    System.out.println(screenMenu.getScreenMenu(MenuIndex.SELECT)); // 버거 메뉴판
                    print.printBeers();//맥주 리스트 출력
                    option = sc.nextInt(); //맥주 선택
                    System.out.println("\n\n");
                    print.getBeer(option-1);//선택한 맥주 리스트 출력
                    System.out.println(screenMenu.getScreenMenu(MenuIndex.CART)); // 장바구니에 담을건지 질문
                    select = sc.nextInt(); // 장바구니 담기
                    if (select == 1) {
                        order.setMenu(productData.getBeerData(option));//장바구니에 담기
                        break;
                    } else if (select == 2) {// 장바구니 담기 취소
                        System.out.println("진행하던 주문이 취소되었습니다.");
                        break;
                    }
                case 5:
                    order.getMenu();// 장바구니 출력
                case 6:
                    order.listClear();// 장바구니 비우기
                    break;

            }
        }
    }
}
