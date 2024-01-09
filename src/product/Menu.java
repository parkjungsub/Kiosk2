package product;

public class Menu {
    private String name;
    private String explanation;
    private  double price;

    public Menu(String name, String explanation, double price){
        this.name = name;
        this.explanation = explanation;
        this.price = price;
    }

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
