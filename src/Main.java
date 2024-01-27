import java.util.ArrayList;
import java.util.List;
import models.Food;
import models.Order;

public class Main {
    public static void main(String[] args) {
        Food item1 = new Food(100.0, "Plain Rice", 1);
        Food item2 = new Food(80.0, "Chicken Curry", 1);
        Food item3 = new Food(150.0, "Butter Chicken", 1);

        List<Food> FoodList = new ArrayList<Food>();
        FoodList.add(item1);
        FoodList.add(item2);
        FoodList.add(item3);

        Order myOrder = new Order(5401, FoodList);
        myOrder.getFoodDetails();

    }
}
