package com.root.service;

import java.util.ArrayList;
import java.util.List;

import com.root.model.Book;

public class BookService implements IBookService {
	
	public static List<Book> bookStore = new ArrayList<Book>();
	static
	{
		bookStore.add(new Book("ISB-04-01","Java Programming","Head First"));
		bookStore.add(new Book("ISB-04-02","C++ Programming","Head First"));
		bookStore.add(new Book("ISB-04-03","C Programming","Head First"));
		bookStore.add(new Book("ISB-04-04","Python Programming","Head First"));
		bookStore.add(new Book("ISB-04-05","Perl Programming","Head First"));
		bookStore.add(new Book("ISB-04-06","PHP Programming","Head First"));
	}
	
	@Override
	public int getTotalNumberOfBooks() {
		return bookStore.size();
	}

	@Override
	public List<Book> getListOfBooks() {
		return bookStore;
	}

	@Override
	public Book getBookByIndex(int index) {
		return bookStore.get(index);
	}

	@Override
	public boolean DeleteBook(Book book) {
		return bookStore.remove(book);
	}
}
