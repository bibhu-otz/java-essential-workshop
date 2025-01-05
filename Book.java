package javaessentialworkshop;

public class Book {
    int bookId;
    String bookName;
    String bookAuthor;
    String bookPublisher;
    double bookPrice;
    
    public Book(int bookId,String bookName,String bookAuthor,String bookPublisher,double bookPrice) {
    	this.bookId = bookId;
    	this.bookName = bookName;
    	this.bookAuthor = bookAuthor;
    	this.bookPublisher = bookPublisher;
    	this.bookPrice = bookPrice;
    	
    }
    
    public void showBook() {
    	System.out.println("BOOk ID :"+this.bookId);
    	System.out.println("BOOk NAME :"+this.bookName);
    	System.out.println("BOOk PUBLISHER :"+this.bookPublisher);
    	System.out.println("BOOk AUTHOR :"+this.bookAuthor);
    	System.out.println("BOOk PRICE :"+this.bookPrice);
    	
    }
    
}
