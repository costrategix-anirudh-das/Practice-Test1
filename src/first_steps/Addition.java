package first_steps;

public class Addition {
		
	public void add() {
		int a,b;
		a=1;
		b=2;
		System.out.println(a+b);
	}
	
	public void mul() {
		int a,b;
		a=1;
		b=2;
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		Addition obj=new Addition();
		obj.add();
		obj.mul();
	}
}
