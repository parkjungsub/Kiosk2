package product;

public class Menu {
    private String name;
    private String explanation;
    private  double price;

  //  private int quantity; todo 주문 횟수 새는거 구현

    public Menu(String name, String explanation, double price){
        this.name = name;
        this.explanation = explanation;
        this.price = price;
       // this.quantity = 0; todo 주문 횟수 새는거 구현
    }

//    public void orderMenu(){ todo 주문 횟수 새는거 구현
//        quantity++;
//    }
//    public void orderItem(){ // 카운터를 객체마다 0으로 초기화해줘야함
//        quantity = 0;
//    }

    public String getName() {
        return name;
    }

    public String getExplanation(){
        return explanation;
    }

    public double getPrice(){
        return price;
    }
}
