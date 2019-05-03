package lv.javaguru.lessons.homework.lesson4;


public class Stock {
    String company;
    double currentValue;
    private double max;
    private double min;

    public Stock(String company, double currentValue) {
        this.company = company;
        this.currentValue = currentValue;
        max = currentValue;
       // min = currentValue;
    }

    public double updatePrice(double updateValue) {
        currentValue = updateValue;
        if (min < 0) {
            min = currentValue;
            return min;
        } else if (min > currentValue) {
            min = currentValue;
            return min;
        }
        if (currentValue > max) {
            max = currentValue;
            return max;
        }
        return currentValue;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public void printInformation() {
        System.out.println("Current Value " + currentValue + "\nMax " + getMax() + "\nMin = " + getMin() + "\n");
    }
}
