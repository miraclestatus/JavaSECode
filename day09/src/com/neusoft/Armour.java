package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/6/14 15:31
 */
public class Armour {

    // 装备名称
   private String name;
    // 防御值
    private  int protect;

    public Armour(String name, int protect) {
        this.name = name;
        this.protect = protect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtect() {
        return protect;
    }

    public void setProtect(int protect) {
        this.protect = protect;
    }
}
