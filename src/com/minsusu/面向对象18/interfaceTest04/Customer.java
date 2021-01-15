package com.minsusu.面向对象18.interfaceTest04;


/**
 * 顾客
 */
public class Customer {

    /**
     * 顾客有一份菜单,所以定义为属性
     * 这是解耦合
     */
    private FoodMenu foodMenu;

    @Override
    public String toString() {
        return "Customer{" +
                "foodMenu=" + foodMenu +
                '}';
    }

/*
     * 错误的，偶额度太高

    ChinaCookie chinaCookie;
    AmericaCookie americaCookie;

    // 点中国厨师
    public void _oder(ChinaCookie chinaCookie){
        chinaCookie.shredded();
        chinaCookie.tomatoOmelette();
    }

    // 点美国厨师
    public void _oder(AmericaCookie americaCookie){
        americaCookie.shredded();
        americaCookie.tomatoOmelette();
    }
    */



    /**
     * 无参构造
     */
    public Customer() {
    }

    /**
     * 有参数的构造方法，防止foodMenu.属性 空指针异常
     * @param foodMenu 菜单
     */
    public Customer(FoodMenu foodMenu){
        this.foodMenu = foodMenu;
    }

    /**
     * 顾客点菜的方法
     */
    public void oder(FoodMenu foodMenu){
        foodMenu.tomatoOmelette();
        foodMenu.shredded();
    }

    /*
     * Setter
     */
    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }

    /*
     * Getter
     */
    public FoodMenu getFoodMenu() {
        return foodMenu;
    }
}
