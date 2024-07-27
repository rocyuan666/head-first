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
        System.out.println("运行过程中改变行为");
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.performFly();

        System.out.println("=========================");

        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        System.out.println("运行过程中改变行为");
        redHeadDuck.setQuackBehavior(new Quack());
        redHeadDuck.performQuack();

        System.out.println("=========================");

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        System.out.println("运行过程中改变行为");
        rubberDuck.setQuackBehavior(new Squeak());
        rubberDuck.performQuack();
    }
}
