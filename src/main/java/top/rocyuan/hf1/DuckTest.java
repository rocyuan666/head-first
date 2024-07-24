package top.rocyuan.hf1;

import top.rocyuan.hf1.behavior.impl.FlyWithWings;
import top.rocyuan.hf1.behavior.impl.Quack;
import top.rocyuan.hf1.behavior.impl.Squeak;
import top.rocyuan.hf1.entity.MallardDuck;
import top.rocyuan.hf1.entity.RedHeadDuck;
import top.rocyuan.hf1.entity.RubberDuck;

public class DuckTest {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.performFly();

        System.out.println("=========================");

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        redHeadDuck.setQuackBehavior(new Quack());
        redHeadDuck.performQuack();

        System.out.println("=========================");

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.setQuackBehavior(new Squeak());
        rubberDuck.performQuack();
    }
}
