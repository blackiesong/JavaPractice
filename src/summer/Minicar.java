package summer;



public class Minicar extends car{

	public static void main(String[] args) {
		Minicar c1=new Minicar();
		System.out.println("父车的颜色是"+c1.color);
		c1.color="blue";
		System.out.println("子车的颜色是"+c1.color);
	}
	

}

class car{
	String color="red";
	public void setColor(String c) {
		this.color=c;
		
	}
}