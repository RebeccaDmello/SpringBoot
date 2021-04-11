package com.rebecca.SpringBootCRUD.controller;

import com.rebecca.SpringBootCRUD.Entity.Books;
import com.rebecca.SpringBootCRUD.service.BooksService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class BooksController {

	@Autowired
	private BooksService booksService;


	//get all books [Select]
	@GetMapping("/books")
	public List<Books> getAllBooks(){
		return booksService.getAllBooks();
	}

	//Insert
	@PostMapping("/books")
    private void insert(@RequestBody Books books)
    {
        booksService.insert(books);
    }

	//Updates - PUT
	@PutMapping("/books/{id}")
	public void update(@PathVariable ObjectId id, @RequestBody Books books){
		booksService.update(id, books.getTitle(), books.getAuthor());
	}

	@DeleteMapping("/books/{id}")
	public void delete(@PathVariable(value="id") ObjectId id, @RequestBody Books books)
	{
		booksService.delete(id);
	}

}















