package com.minsusu.异常.综合案例;

/**
 * 军队
 */
public class Army {
    private Weapon[] weapons; // 军队有多种武器

    public Army() {

    }

    public Army(int count) {
        // 初始化武器数组的数量
        this.weapons = new Weapon[count];
    }


    /**
     * 添加武器
     *
     * @param weapon
     */
    public void addWeapon(Weapon weapon) throws AddWeaponException {
        for (int i = 0; i < this.weapons.length; i++) {
            if (null == this.weapons[i]) {
                this.weapons[i] = weapon;
                System.out.println(weapon+"：添加成功");
                return;
            }
        }
        // 添加满了，抛出异常提示信息
        throw new AddWeaponException("武器已达上限");
    }

    /**
     * 让所有可以攻击的武器攻击
     */
    public void attackAll() {
        for (int i = 0; i < this.weapons.length; i++) {
            if (this.weapons[i] instanceof Shootable) {
                ((Shootable) this.weapons[i]).shoot(); //向下转型
            }
        }
    }


    /**
     * 让所有可以移动的武器移动
     */
    public void movieAll() {
        for (int i = 0; i < this.weapons.length; i++) {
            if (this.weapons[i] instanceof Movieable) {
                ((Movieable) this.weapons[i]).movie(); //向下转型
            }
        }
    }
}


