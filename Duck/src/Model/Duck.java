package Model;

public abstract class Duck {
	
       public Duck(String name){
    	   this.Name=name;
       }
	
		private String Name;
	 
		   QuackBehavior quackBehavior;
		   FlyBehavior flyBehavior;
		
		   public void performQuack() {
		     quackBehavior.quack();
		   }
		   public void performFly() {
			   flyBehavior.fly();
		   }
		   
		   public void setQuackBehavior(
		         QuackBehavior behavior) {
		      this.quackBehavior = behavior;
		   }
		public void setFlyBehavior(FlyBehavior flyBehavior) {
			this.flyBehavior = flyBehavior;
		}
	       public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
}
