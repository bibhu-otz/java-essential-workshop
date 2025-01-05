package javaessentialworkshop;

public class ManageBooks {

	public static void main(String[] args) {
		int[] x = new int[4];
		Book book1 ;
		book1 = new Book(100,"Java Programming","Daniel Liang","BPB",1000);
        book1.showBook();
        
        Book book2 ;
		book2 = new Book(101,"C Programming","Y Kanitkar","TMH",700);
        book2.showBook();
        
        Book[] mybooks = new Book[3];
        mybooks[0]=new Book(103,"Java Programming1","Daniel Liang","BPB",1000);
        mybooks[1]=new Book(104,"Java Programming2","Daniel Liang","BPB",1500);
        mybooks[2]=new Book(105,"Java Programming3","Daniel Liang","BPB",2000);
        
        for(Book book : mybooks)
        {
        	book.showBook();
        }
	}

}
