package summer;

public class Qiege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="张三吃快点回家吃吃饭";
		String st[]=str.split("吃");
		
		for (int i = 0; i < st.length; i++) {
			System.out.println("切割后的第"+(i+1)+"部分是"+st[i]);
		}
	}

}
