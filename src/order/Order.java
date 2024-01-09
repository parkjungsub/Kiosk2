package order;

import product.Menu;

import java.util.ArrayList;
public class Order {
    ArrayList<Menu> orderlist = new ArrayList<Menu>();
    public void setMenu(Menu order){ //장바구니 담기
        this.orderlist.add(order);
    }
    public void getMenu(){ //장바구니 출력
        for(int i = 0 ; i < orderlist.size() ;i++ ){
            System.out.println(orderlist.get(i).getName() + " " +);
        }
    }
    public ArrayList<Menu> getOrderList(){
        return orderlist;
    }

    public void listClear(){
        orderlist.clear();
    }
}
