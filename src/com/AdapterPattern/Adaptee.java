package com.AdapterPattern;

// 适配者类：它是被访问和适配的现存组件库中的组件接口。
public class Adaptee {
    public void specificRequset(){
        System.out.println("适配者中的业务代码被调用!");
    }
}
