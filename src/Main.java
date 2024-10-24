import Cook.System_cook;
import customer.TableCustomer;
import customer.WechatCustomer;
import kitchen.Dish;
import kitchen.Dish_1;
import kitchen.Dish_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System_cook restaurantSystem = new System_cook();

        // 创建一些菜品
        Dish dish1 = new kitchen.Dish_1();
        Dish dish2 = new kitchen.Dish_2();

        // 创建顾客
        TableCustomer tableCustomer = new TableCustomer(5);
        WechatCustomer wechatCustomerTakeout = new WechatCustomer("123 Main St", true);
        WechatCustomer wechatCustomerDineIn = new WechatCustomer("456 Elm St", false);

        // 管理订单（堂食）
        System.out.println("堂食顾客点单:");
        restaurantSystem.manageOrder(Arrays.asList(dish1, dish2), tableCustomer);

        // 管理订单（外卖）
        System.out.println("\n外卖顾客点单:");
        restaurantSystem.manageOrder(Arrays.asList(dish1, dish2), wechatCustomerTakeout);

        // 管理订单（堂食）
        System.out.println("\n堂食顾客点单:");
        restaurantSystem.manageOrder(Arrays.asList(dish1, dish2), wechatCustomerDineIn);
    }
}