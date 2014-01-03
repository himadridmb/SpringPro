package com.root.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.root.service.BookService;
import com.root.service.IBookService;

@Controller
@RequestMapping(value="/book")
public class BookController {
	
	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	/*@Autowired
	IBookService bookService;*/
	
	@RequestMapping(value="/size")
	public String numberOfBooks(Model model)
	{
		logger.info("requesting for number of books");
		IBookService bookService = new BookService(); 
		model.addAttribute("numberOfBooks", bookService.getTotalNumberOfBooks());
		return "book";
	}
}
