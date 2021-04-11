package com.rebecca.SpringBootCRUD.DAO;

import com.rebecca.SpringBootCRUD.Entity.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class BookDAO {

    @Autowired
    private BooksRepository repository;

    public Collection<Books> getAllBooks(){
        return repository.findAll();
    }

    public Books create(Books books){
        return repository.insert(books);
    }

    public Books insert(Books books) {
        return repository.insert(books);
    }
}
