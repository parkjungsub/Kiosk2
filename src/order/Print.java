package order;

import data.ProductData;
import product.Menu;

public class Print {
    ProductData productData = new ProductData();


    public void printProduct(Menu menu) {
        for (int i = 0; i < productData.getBeers().size(); i++) {
            System.out.println((i + 1) + ". " + productData.getBeers().get(i).getName() + "   | W " + productData.getBeers().get(i).getPrice() + "| " + productData.getBeers().get(i).getExplanation());
        }
    }

    public void printBeers() {
        for (int i = 0; i < productData.getBeers().size(); i++) {
            System.out.println((i + 1) + ". " + productData.getBeers().get(i).getName() + "   | W " + productData.getBeers().get(i).getPrice() + "| " + productData.getBeers().get(i).getExplanation());
        }
    }

    public void printDrinks() {
        for (int i = 0; i < productData.getDrinks().size(); i++) {
            System.out.println((i + 1) + ". " + productData.getDrinks().get(i).getName() + "   | W " + productData.getDrinks().get(i).getPrice() + "| " + productData.getDrinks().get(i).getExplanation());
        }
    }

    public void printBurgers() {
        for (int i = 0; i < productData.getBurgers().size(); i++) {
            System.out.println((i + 1) + ". " + productData.getBurgers().get(i).getName() + "   | W " + productData.getBurgers().get(i).getPrice() + "| " + productData.getBurgers().get(i).getExplanation());
        }
    }

    public void printShakes() {
        for (int i = 0; i < productData.getShakes().size(); i++) {
            System.out.println((i + 1) + ". " + productData.getShakes().get(i).getName() + "   | W " + productData.getShakes().get(i).getPrice() + "| " + productData.getShakes().get(i).getExplanation());
        }
    }

    public void getBurger(int i) {
        System.out.println(productData.getBurgers().get(i).getName() + "   | W " + productData.getBurgers().get(i).getPrice() + "| " + productData.getBurgers().get(i).getExplanation());
    }

    public void getBeer(int i) {
        System.out.println(productData.getBeers().get(i).getName() + "   | W " + productData.getBeers().get(i).getPrice() + "| " + productData.getBeers().get(i).getExplanation());
    }

    public void getDrink(int i) {
        System.out.println(productData.getDrinks().get(i).getName() + "   | W " + productData.getDrinks().get(i).getPrice() + "| " + productData.getDrinks().get(i).getExplanation());
    }

    public void getShake(int i) {
        System.out.println(productData.getShakes().get(i).getName() + "   | W " + productData.getShakes().get(i).getPrice() + "| " + productData.getShakes().get(i).getExplanation());
    }
}
