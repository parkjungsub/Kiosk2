package order;

import product.Menu;

import java.util.ArrayList;
public class Order {
    ArrayList<Menu> orderlist = new ArrayList<Menu>();
    public void setMenu(Menu order){ //장바구니 담기
        this.orderlist.add(order);
        // order.orderMenu();todo 주문 횟수 새는거 구현
    }
    public void getMenu(){ //장바구니 출력
        for(int i = 0 ; i < orderlist.size() ;i++ ){
            System.out.println(orderlist.get(i).getName() + " | W "+orderlist.get(i).getPrice() + " | " + orderlist.get(i).getExplanation());
        }
    }
    public ArrayList<Menu> getOrderList(){
        return orderlist;
    }

    public void sumOrderList(){
        double sum = 0;

        for (int i = 0; i< orderlist.size();i++){
            sum += orderlist.get(i).getPrice();
        }
        System.out.println("W " + sum);
    }
    public void listClear(){
        //todo 객체의 count 0으로 초기화 시키기
        orderlist.clear(); // 장바구니 비우기
    }
}
