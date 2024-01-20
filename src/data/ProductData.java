package data;

import product.*;

import java.util.ArrayList;
import java.util.List;

public class ProductData {
    private List<Menu> beers = new ArrayList<Menu>();
    private List<Menu> burgers = new ArrayList<Menu>();
    private List<Menu> drinks = new ArrayList<Menu>();
    private List<Menu> shakes = new ArrayList<Menu>();

    public ProductData() {
        initializeData();
    }

    private void initializeData() {
        beers.add(new Menu("ShackMeister Ale", "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 틀별히 양조한 에일 맥주", 9.8));
        beers.add(new Menu("MagpieBrewing Co", "pale Ale,Dreft", 6.8));

        burgers.add(new Menu("ShackBurger ", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9));
        burgers.add(new Menu("SmokeShcak  ", "베이컨, 체리 페퍼에 쉑소스가 토칭된 치즈버거", 8.9));
        burgers.add(new Menu("ShroomBurger", "몬스터 치즈와 체다 치즈로 속을 채운 배지테리안 버거", 9.4));
        burgers.add(new Menu("Cheeseburger", "포테이토 번과 비프페티디, 치즈가 토핑된 치즈버거", 6.9));
        burgers.add(new Menu("Hamburger   ", "비프패티를 기반으로 야채가 들어간 기본버거", 5.4));

        drinks.add(new Menu("Shack-made Lemonade   ", "매장에서 직접 만드는 상큼한 레몬에이드(오리지날/시즈널)", 3.9));
        drinks.add(new Menu("Fresh Brewed Iced Tea", "직접 유기농 홍자를 우려낸 아이스티", 3.4));
        drinks.add(new Menu("Fifty/Fifty           ", "레몬에이드와 아이스티의 만남", 3.5));
        drinks.add(new Menu("Fountain Soda", "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프", 2.7));
        drinks.add(new Menu("Abita Root Beer      ", "청량감 있는 독특한 미국식 무알콜 탄산음료", 4.4));
        drinks.add(new Menu("Bottled Water       ", "지리산 일반대수층으로 만든 프리미엄 생수", 1.0));

        shakes.add(new Menu("Shack            ", "바닐라, 초콜렛, 솔티드 카라멜, 블랙&화이트, 스트로베리, 피넛버터, 커피", 5.9));
        shakes.add(new Menu("Shake of the Week", "특별한 커스터드 플레이버", 6.5));
        shakes.add(new Menu("red Bean Shake  ", "신성한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크", 6.5));
        shakes.add(new Menu("Floats          ", "루트 비어, 퍼플 카우, 크림시클", 5.9));

    }

    public List<Menu> getBeers() {
        return beers;
    }

    public List<Menu> getDrinks() {
        return drinks;
    }

    public List<Menu> getBurgers() {
        return burgers;
    }

    public List<Menu> getShakes() {
        return shakes;
    }


    public Menu getBeerData(int option) {
        return beers.get(option);
    }

    public Menu getBurgerData(int option) {
        return burgers.get(option);
    }

    public Menu getDrinkData(int option) {
        return drinks.get(option);
    }

    public Menu getShakeData(int option) {
        return shakes.get(option);
    }
}
