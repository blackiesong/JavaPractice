package summer;

public class BOOK {
	public String title;
	public String pages;
	public BOOK(String title,String pages){
		this.title=title;
		this.pages=pages;
	}
	public void record(){
		System.out.println("Record knowledge");
	}
public static void main(String[] args) {
	JavaBook book=new JavaBook("s","99");
	System.out.println("�鼮���֣�"+book.title+";�鼮ҳ��Ϊ��"+book.pages);
	book.record();
	
}
}
class JavaBook extends BOOK{
	public JavaBook(String title,String pages){
		super(title, pages);
	}
	@Override
	public void record(){
		System.out.println("Record java knowledge");
	}
}
