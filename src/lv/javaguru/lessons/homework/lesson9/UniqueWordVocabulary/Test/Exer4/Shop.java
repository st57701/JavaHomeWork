package lv.javaguru.lessons.homework.lesson9.UniqueWordVocabulary.Test.Exer4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products = new ArrayList<>();
    private Product orange = new Product("Orange", new BigDecimal(21));
    private Product banana = new Product("banana", new BigDecimal(25));

    public Shop() {

        this.products = products;
    }


    public Shop(List<Product> products) {
        products.add(orange);
        products.add(banana);
        this.products = products;
    }

    public static void main(String[] args) {
        Shop shop1 = new Shop(new ArrayList<>());
        System.out.println(shop1.products);
        shop1.addProduct("tomato", new BigDecimal(33));
        System.out.println(shop1.products);
        Shop shop2 = new Shop();
        System.out.println(shop2.products);
        shop2.addProduct("ginger", new BigDecimal(19));
        System.out.println(shop2.products);
        shop2.products.addAll(shop1.products);
        shop2.products.add(shop2.getBanana());

        System.out.println(shop2.products);
        shop2.removeProductByName("banana");
        System.out.println(shop2.products);
        System.out.println(shop2.getProductByName("tomato"));
        shop2.findProductWithPrice(new BigDecimal(20.5), new BigDecimal(34));


    }

    public void addProduct(String name, BigDecimal price) {
        products.add(new Product(name, price));
        System.out.println("Product " + name + " has added to list");

    }

    public void removeProductByName(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName() == name) {
                products.remove(i);
                System.out.println("Product \"" + name + "\" Removed form list");
            }

        }
    }

    public List<String> getProductByName(String name) {
        List<String> prodcutByName = new ArrayList<>();

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName() == name) {
                prodcutByName.add(products.get(i).toString());
                System.out.print("We have found these product with name \"" + name + "\" :");


            }

        }

        return prodcutByName;
    }

    public void findProductWithPrice(BigDecimal minPrice, BigDecimal maxPrice) {

        for (int i = 0; i < products.size(); i++) {

            if (products.get(i).getPrice().compareTo(minPrice) == 1 && products.get(i).getPrice().compareTo(maxPrice) == -1) {
                System.out.println("Have found products with price between " + minPrice + " and " + maxPrice + " - " + products.get(i).getName() + " " + products.get(i).getPrice());

            }
        }

    }

    public Product getOrange() {
        return orange;
    }

    public Product getBanana() {
        return banana;
    }


}
