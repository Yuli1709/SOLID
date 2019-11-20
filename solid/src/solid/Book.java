/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

import java.util.ArrayList;

/**
 *
 * @author CltControl
 */
public class Book {
    	String title;
	String author;
	String category;
	float price;
	boolean state;
	
	public Book(String title, String author, String category,float price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
		state = false;
		
	}

	String getTitle() {
		return title;
	}
	void setTitle(String title) {
		this.title = title;
	}
	String getAuthor() {
		return author;
	}
	void setAuthor(String author) {
		this.author = author;
	}
        
        /**
         * Este metodo estaría mejor ubicado en la clase StoreBook para
         * satisfacer mejor el punto 1, Single Responsibility Principle
	void searchBook() {
		/*
		 * Search a book for author or title or category
		 *
	}
        */

}


