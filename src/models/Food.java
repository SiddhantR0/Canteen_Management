package models;

public class Food {
    double foodPrice;
    String name;
    int quantity;

    public Food(double foodPrice, String name, int quantity) {
        this.foodPrice = foodPrice;
        this.name = name;
        this.quantity = quantity;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(float foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}