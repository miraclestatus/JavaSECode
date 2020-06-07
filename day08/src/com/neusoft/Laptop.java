package com.neusoft;

/**
 * @author Eric Lee
 * @date 2020/6/7 18:46
 */
public class Laptop {
    public void run(){
        System.out.println("笔记本运行中");
    }
    public void useUSB(USB usb){
        // 判断是否有usb设备
        if(usb != null){
            usb.open();
            if (usb instanceof Mouse){
                Mouse mouse = (Mouse) usb;
                mouse.click();
            }else if (usb instanceof KeyBoard){
                KeyBoard keyBoard = (KeyBoard) usb;
                keyBoard.input();
            }
            usb.close();
        }

    }
    public void shutDown(){
        System.out.println("笔记本关闭");
    }

}
