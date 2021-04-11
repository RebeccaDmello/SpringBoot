package com.rebecca.SpringBootCRUD.DAO;

import com.rebecca.SpringBootCRUD.Entity.Books;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends MongoRepository<Books, Integer> {

    Books deleteById(ObjectId id);
    Books findAllById(ObjectId id);
}
