package top.rocyuan.hf1.behavior.impl;

import top.rocyuan.hf1.behavior.IFlyBehavior;

public class FlyNoWay implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
