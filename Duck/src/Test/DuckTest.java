package Test;

import Model.ADuck;
import Model.BDuck;
import Model.CDuck;
import Model.Duck;
import Model.FlyBehaviorImpl2;


public class DuckTest {
	
	public static void main(String[] args){
		Duck aDuck=new CDuck("火箭鸭");
		System.out.println("我是"+aDuck.getName());
		aDuck.performFly();
		aDuck.swim();
		aDuck.performQuack();
		System.out.println("燃料用光了");
		aDuck.setFlyBehavior(new FlyBehaviorImpl2());
		aDuck.performFly();
		
		System.out.println("");
		
		Duck bDuck=new BDuck("普通鸭");
		System.out.println("我是"+bDuck.getName());
		bDuck.performFly();
		bDuck.swim();
		bDuck.performQuack();
	}

}
