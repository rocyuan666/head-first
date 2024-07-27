package top.rocyuan.hf1.entity;

import top.rocyuan.hf1.behavior.impl.FlyNoWay;
import top.rocyuan.hf1.behavior.impl.MuteQuack;
import top.rocyuan.hf1.parent.Duck;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("外观是绿头鸭子");
    }
}
