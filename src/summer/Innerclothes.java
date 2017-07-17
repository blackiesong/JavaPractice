package summer;

public class Innerclothes {
	class clothes{
		private String material;
		private int size;
		private String color;
		public String getColor() {
			return color;
		}
		public void setColor(String color){
			this.color=color;
		}
		
	}
	static class coat extends Innerclothes.clothes{
		public coat(Innerclothes o) {
			o.super();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Innerclothes o=new Innerclothes();
		coat s=new coat(o);
		s.setColor("red");
		System.out.println("ÑÕÉ«ÊÇ£º"+s.getColor());
	}
}
