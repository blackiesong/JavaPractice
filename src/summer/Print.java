package summer;

import java.util.Scanner;

public class Print {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner reader=new Scanner(System.in);
		System.out.println("ÇëÊäÈë´òÓ¡ÄÚÈİ");
		String content=reader.next();
		Printhead ph=new Printhead();
		ph.strike(content);	
	}
	static class Printhead{
		public void strike(String s){
			System.out.println("Striking words");
			System.out.println(s);
		}
	}
}
