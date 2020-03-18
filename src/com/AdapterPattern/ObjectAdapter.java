package com.AdapterPattern;

//对象适配器类
public class ObjectAdapter implements ITarget {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequset();
    }
}
