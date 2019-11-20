package solid;

import java.util.ArrayList;
import solid.Book;

class StoreBook {

	private ArrayList<Book> books;
	private Book book;
	
	
	public StoreBook() {
		this.books = new ArrayList<>();
	}
	
        /**
        Esta parte viola el primer principio Single Responsibility Principle
        ya que los pagos podrian manejarse en otra clase o clases diferentes 
        para no tener varias responsabilidades en una misma clase.
        
        public void pay(String method, Book book) {
		if(method == "card") {
			pay_card("numberCard", book);
		}else if ( method == "cash") {
			pay_cash( "money", book);
		}
	}
         
	public void pay_card(String card, Book book) {
		/*
		 * change state to true
		 *
	}
	
	public void pay_cash(String money, Book book) {
		/*
		 * change state to true
		 *
	}
	*/
        
        public void sellBook(Book book) {
            /**
             * Maneja el pago y cambia el esta a True
             */
        }
        
	public void removeBooksPurchased(ArrayList<Book> books) {
		/*
		 * store books with state true in new array and remove the original array
		 * 
		 */
	}
        
        void searchBook() {
		/*
		 * Search a book for author or title or category
		 */
	}
        
}