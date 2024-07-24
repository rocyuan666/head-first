package top.rocyuan.hf1.behavior.impl;

import top.rocyuan.hf1.behavior.IQuackBehavior;

public class Quack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
