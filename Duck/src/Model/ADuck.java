package Model;

public class ADuck extends Duck{

	public ADuck(String name) {
		super(name);
		this.quackBehavior=new QuackBehaviorImpl1();
		this.flyBehavior=new FlyBehaviorImpl1();
		
	}

}
