package top.rocyuan.hf1.behavior.impl;

import top.rocyuan.hf1.behavior.IQuackBehavior;

public class Squeak implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
