package Day08;

public class BookEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		Book b4 = new Book();
		Book myBook;
		myBook = new Book();
		
		b.name = "홍길동";
		b2.name = "강감찬";
		myBook.name = "오오";
		myBook.Print();
		b.Print();
		b2.Print();
	}

}
