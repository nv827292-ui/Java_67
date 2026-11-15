package obj;

public class Book {
	private int pages;
	public void setPages(int x) {
		if(x>0) {
			pages=x;
		}
	}
	public int getPages() {
		return pages;
	}
	public static void main(String[] args) {
		Book b1=new Book();
		b1.setPages(7);
		int m=b1.getPages();
		System.out.println("The pages are "+m);
	}

}
