package models;
import models.Food;

import java.util.ArrayList;
import java.util.List;

public class Order {
    int accountId;
    List<Food> foodList = new ArrayList<Food>();

    public Order(int accountId, List<Food> foodList) {
        this.accountId = accountId;
        this.foodList = foodList;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    public void getFoodDetails(double Discount){
        double totalPrice = 0;
        for (Food food : foodList) {
            System.out.println(" x" + food.getQuantity() +" " + food.getName()+": " + "Rs." + food.getFoodPrice());
            totalPrice += food.getFoodPrice() * food.getQuantity();

        }
        System.out.println("The Total Price is: " +"Rs." +totalPrice);
        double discounted = totalPrice+(Discount/100 * totalPrice);
        System.out.println("The Discounted Price is: " + "Rs." +discounted);
    }

}