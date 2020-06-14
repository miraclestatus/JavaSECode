package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/6/14 15:25
 */
public class YinYongTypeTest01 {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("M4A1", 1212);

        Armour armour = new Armour("三级甲", 555);

        Role role = new Role();
        // 设置武器属性
        role.setWp(weapon);

        // 设置盔甲属性
        role.setAr(armour);
        role.attack();
        role.wear();

    }


}
