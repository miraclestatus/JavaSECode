package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/6/14 15:30
 */
public class Weapon {
    // 武器名字
    private String name;
    // 伤害值
    private int hurt;

    public Weapon(String name, int hurt) {
        this.name = name;
        this.hurt = hurt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }
}
