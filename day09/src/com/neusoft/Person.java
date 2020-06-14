package com.neusoft;

import java.util.Objects;

/**
 * @author Eric Lee
 * @date 2020/6/14 14:18
 */
public class Person {
    private String name;
    private int age;
    private boolean live = true;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 创建内部类
    class Heart {
        public  void  jump(){
            // 直接访问外部成员
            if (live){
                System.out.println("心扑通扑通的在调");
            }else{
                System.out.println("over");
            }
        }
    }
    public boolean isLive(){
        return live;
    }

    public void setLive(boolean live){
        this.live = live;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", live=" + live +
                '}';
    }

//    @Override
//    // 比较原则， name 和 age 相同就是同一个person
//    public boolean equals(Object o) {
//       // 如果对象地址一样，则认为相同
//        if (this == o)
//            return true;
//        // 如果参数为空， 或者类型不一样，则认为不同
//        if (o == null || getClass() != o.getClass())
//            return false;
//        // 转换为当前类型
//        Person person = (Person) o;
//        //  应用类型比较相等使用 java.util.Objects;的equals静态方法 取得结果
//        return age == person.age && Objects.equals(name, person.name);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
