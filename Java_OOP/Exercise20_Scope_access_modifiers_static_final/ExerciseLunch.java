package Java_OOP.Exercise20_Scope_access_modifiers_static_final;

public class ExerciseLunch {
    private Double price = null;
    private String nameOfDayEaten = null;
    private int lunchWeightInGrams;

    private static final double MAX_PRICE = 5;

    private int numberOfTimesWeHaveGotPrice = 0;

    private ExerciseLunch(Double price, String nameOfDayEaten) {
        this.price = price;
        this.nameOfDayEaten = nameOfDayEaten;
    }

    public void printMaxPrice() {
        System.out.println(MAX_PRICE);
    }

    private void printLunch() {
        System.out.println("Lunch{" +
                "price=" + price +
                ", nameOfDayEaten='" + nameOfDayEaten + '\'' +
                ", lunchWeightInGrams='" + lunchWeightInGrams + '\'' +
                '}');
    }

    private void setPrice(double price) {
        if (price > MAX_PRICE) {
            System.out.println("Cannot set greater than max price");
        } else {
            this.price = price;
        }
    }

    private Double getPrice() {
        numberOfTimesWeHaveGotPrice = numberOfTimesWeHaveGotPrice + 1;
        return this.price;
    }

    private int getNumberOfTimesWeHaveGotPrice() {
        return this.numberOfTimesWeHaveGotPrice;
    }

    private String getNameOfDayEaten() {
        return nameOfDayEaten;
    }

    private int getLunchWeightInGrams() {
        return lunchWeightInGrams;
    }

    private void setPrice(Double price) {
        this.price = price;
    }

    private void setNameOfDayEaten(String nameOfDayEaten) {
        this.nameOfDayEaten = nameOfDayEaten;
    }

    private void setLunchWeightInGrams(int lunchWeightInGrams) {
        this.lunchWeightInGrams = lunchWeightInGrams;
    }

    private void setNumberOfTimesWeHaveGotPrice(int numberOfTimesWeHaveGotPrice) {
        this.numberOfTimesWeHaveGotPrice = numberOfTimesWeHaveGotPrice;
    }
}
