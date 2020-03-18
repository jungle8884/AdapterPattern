package com.AdapterPattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("类适配器模式测试：");
        ITarget target = new ClassAdapter();
        target.request();

        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        target = new ObjectAdapter(adaptee);
        target.request();
    }
}
