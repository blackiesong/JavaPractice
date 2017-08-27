package summer;

public class Plant {
	public String shape="ÍÖÔ²ÐÎ";
	private static String color="°×É«";
	private String grow="";
	public static void main(String[] args) {
		Fruit f=new Fruit();
		f.print();
		new Apple().main(args);
	}
	static class Fruit{
		String taste;
		boolean iron;
		Fruit(){
			this.taste="suan";
			this.iron=true;
		}
		public void print(){
			System.out.println(new Plant().shape);
			System.out.println(new Plant().grow);
			System.out.println(color);
		}
	}
}
 class Apple extends Plant.Fruit{
	Apple(String taste){
		this.taste=taste;
	}
	Apple(){
		super();
	}
	public static void main(String[] args) {
		Apple apple=new Apple("tian");
		System.out.println(apple.taste);
		System.out.println(apple.iron);
	}
}
