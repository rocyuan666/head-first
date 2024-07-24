package top.rocyuan.hf1.entity;

import top.rocyuan.hf1.behavior.impl.FlyNoWay;
import top.rocyuan.hf1.behavior.impl.MuteQuack;
import top.rocyuan.hf1.parent.Duck;

public class RedHeadDuck extends Duck {

    public RedHeadDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("外观是红头");
    }
}
