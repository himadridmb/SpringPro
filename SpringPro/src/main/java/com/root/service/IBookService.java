package com.root.service;

import java.util.List;

import com.root.model.Book;

public interface IBookService {
	public int getTotalNumberOfBooks();
	public List<Book> getListOfBooks();
	public Book getBookByIndex(int index);
	public boolean DeleteBook(Book book);
}
