# Java06-面向对象进阶

## **Task1.继承**

```java
public class Dish {
    private String name;//菜品名称
    private double price;//菜品价格

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
//******************************************************
public class Dish_1 extends Dish{

    public Dish_1(){
        super("番茄炒蛋",10);
    }

    public void profile(){
        System.out.println("番茄炒蛋是普通的大众菜肴，烹调方法比较简单，而且营养搭配合理。色泽鲜艳，口味宜人，深受大众喜爱。其营养价值丰富，具有营养素互补的特点以及健美抗衰老的作用。番茄含有丰富的胡萝卜素、维生素C和B族维生素，番茄红素具有独特的抗氧化能力。鸡蛋含有大量的维生素和矿物质及有高生物价的蛋白质。蛋黄中含有丰富的卵磷脂、固醇类等，对神经系统和身体发育有非常好的作用，深受人们的喜爱。");
    }
}
//******************************************************
public class Dish_2 extends Dish{

    public Dish_2(String name,double price){
        super("西红柿炒鸡蛋",9.9);
    }

    public void profile(){
        System.out.println("西红柿炒鸡蛋是普通的大众菜肴，烹调方法比较简单，而且营养搭配合理。色泽鲜艳，口味宜人，深受大众喜爱。其营养价值丰富，具有营养素互补的特点以及健美抗衰老的作用。番茄含有丰富的胡萝卜素、维生素C和B族维生素，番茄红素具有独特的抗氧化能力。鸡蛋含有大量的维生素和矿物质及有高生物价的蛋白质。蛋黄中含有丰富的卵磷脂、固醇类等，对神经系统和身体发育有非常好的作用，深受人们的喜爱。");
    }
}
```

