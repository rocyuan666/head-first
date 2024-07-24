package top.rocyuan.hf1.parent;

import top.rocyuan.hf1.behavior.IFlyBehavior;
import top.rocyuan.hf1.behavior.IQuackBehavior;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public abstract void display();
    public void swim() {
        System.out.println("游泳");
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
