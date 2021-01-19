package com.minsusu.异常.综合案例;

/**
 * 测试入口
 */
public class ExceptionTest08 {
    public static void main(String[] args) {
        // 创建武器
        Weapon tank = new Tank();
        Weapon tank1 = new Tank();
        Weapon tank2 = new Tank();
        Weapon tank3 = new Tank();
        Weapon archibald = new Archibald();
        Weapon airfreighter = new Airfreighter();
        // 创建军队
        Army army = new Army(6);
        try {
            army.addWeapon(tank);
            army.addWeapon(tank1);
            army.addWeapon(tank2);
            army.addWeapon(tank3);
            army.addWeapon(archibald);
            army.addWeapon(airfreighter);
        } catch (AddWeaponException e) {
            String ex = e.getMessage();
            System.out.println(ex);
        }

        army.attackAll();
        army.movieAll();

    }
}
