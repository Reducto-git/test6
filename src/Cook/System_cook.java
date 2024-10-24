package Cook;

import customer.TableCustomer;
import customer.WechatCustomer;

import java.util.List;

public class System_cook {
    private int orderNumber = 1;

    public <T> void manageOrder(List<Order> dishes, T customer) {
        // 检查菜品的原料是否足够
        for (Order dish : dishes) {
            if (!dish.check()) {
                System.out.println("取消订单");
                return; // 一旦发现原料不足，取消订单并返回
            }
        }

        // 如果所有菜品都可以烹饪，输出烹饪方法
        for (Order dish : dishes) {
            dish.cook();
        }

        // 根据顾客类型处理送餐
        if (customer instanceof TableCustomer tableCustomer) {
            System.out.println("将餐送到餐桌: " + tableCustomer.tableId);
        } else if (customer instanceof WechatCustomer wechatCustomer) {
            if (wechatCustomer.takeout) {
                System.out.println("外卖送到地址: " + wechatCustomer.address);
            } else {
                System.out.println("堂食，无需送餐");
            }
        }

        System.out.println("订单编号: " + orderNumber++);
    }
}
