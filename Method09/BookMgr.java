package Method09;

public class BookMgr {

	private Book[] booklist;

	public BookMgr(Book[] booklist) {
		super();
		this.booklist = booklist;
	}
	
	public void pirntBooklist() {
	for(int i =0; i <booklist.length; i++) {
		Book book = booklist[i];
		System.out.println(book.getTitle());
	}

	}
	public void printTotalprice() {
		int totalprice = 0;
		for(int i =0; i< booklist.length; i++) {
			totalprice += booklist[i].getPrice();
		}
		System.out.println("��ü å ������ ��: " + totalprice);
	}
	
}