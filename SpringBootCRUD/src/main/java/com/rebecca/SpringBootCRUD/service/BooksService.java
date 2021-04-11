package com.rebecca.SpringBootCRUD.service;

import com.rebecca.SpringBootCRUD.DAO.BooksRepository;
import com.rebecca.SpringBootCRUD.Entity.Books;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Service
public class BooksService
{
    @Autowired
    private BooksRepository booksRepository;

    //Insert
    public Books create(Books books) {
        return booksRepository.save(books);
    }

    //Retrieve
    @GetMapping("/books")
    public List<Books> getAllBooks(){
        return booksRepository.findAll();
    }

    //POST
    public String insert(Books books)
    {
        booksRepository.save(books);
        return "Data inserted";
    }

    //Update - PUT
    public Books update(ObjectId id, String title, String author){
        Books b = booksRepository.findAllById(id);
        b.setTitle(title);
        b.setAuthor(author);
        return booksRepository.save(b);
    }

    //Delete -
    public void delete(ObjectId id){
        booksRepository.deleteById(id);
    }


//    //insert
//    public List<Books> getAllBooks()
//    {
//        List<Books> books = new ArrayList<Books>();
//        booksRepository.findAll().forEach(books1 -> books.add(books1));
//        return books;
//    }

//    //Delete
//    public void delete(ObjectId id)
//    {
//        booksRepository.deleteById(id);
//    }
//
//    public void update(Books books, ObjectId id)
//    {
//        booksRepository.save(books);
//    }
}