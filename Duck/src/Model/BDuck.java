package Model;

public class BDuck extends Duck{

	public BDuck(String name) {
		super(name);
		this.quackBehavior=new QuackBehaviorImpl1();
		this.flyBehavior=new FlyBehaviorImpl1();
	}

}
