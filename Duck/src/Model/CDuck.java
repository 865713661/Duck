package Model;

public class CDuck extends Duck {

	public CDuck(String name) {
		super(name);
		this.quackBehavior=new QuackBehaviorImpl3();
		this.flyBehavior=new FlyBehaviorImpl3();
	}

}
