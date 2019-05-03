package lv.javaguru.lessons.homework.lesson9.UniqueWordVocabulary.Test.Exer4;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public class Product {
    private String name;
    private  BigDecimal price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
