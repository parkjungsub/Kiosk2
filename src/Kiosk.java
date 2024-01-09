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
      //  while (true) {
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
                    if (select == 1) { //장바구니 담기
                       order.setMenu(productData.getBurgerData(option));//todo 장바구니에 담는 기능 구현해야함
                         order.getMenu();
                        break;
                    } else if (select == 2) {// 장바구니 담기 취소

                        break;
                    }
                case 5:
                    order.listClear();
            }
      //  }
    }
}
