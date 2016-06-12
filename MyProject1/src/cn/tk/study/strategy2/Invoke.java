package cn.tk.study.strategy2;

public class Invoke {

	public static void main(String[] args) {
		Context context;
		context = new Context(new BackDoor());
		context.operate();
		System.out.println("\n");  
		context.setStrategy(new GivenGreenLight());
		context.operate();
		System.out.println("\n");  
		context.setStrategy(new BlackEnemy());
		context.operate();
		System.out.println("\n");  
	}

}
