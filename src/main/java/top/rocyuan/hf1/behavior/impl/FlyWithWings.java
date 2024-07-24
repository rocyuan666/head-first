package top.rocyuan.hf1.behavior.impl;

import top.rocyuan.hf1.behavior.IFlyBehavior;

public class FlyWithWings implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("会飞");
    }
}
