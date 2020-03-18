package com.AdapterPattern;

import java.lang.annotation.Target;

//类适配器类
public class ClassAdapter extends Adaptee implements ITarget {
    public void request() {
        specificRequset();
    }
}
