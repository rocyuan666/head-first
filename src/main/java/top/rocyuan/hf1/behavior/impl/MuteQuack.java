package top.rocyuan.hf1.behavior.impl;

import top.rocyuan.hf1.behavior.IQuackBehavior;

public class MuteQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
