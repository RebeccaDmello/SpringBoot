package com.rebecca.SpringBootCRUD.Entity;


import org.springframework.data.mongodb.core.mapping.Document;
import org.bson.types.ObjectId;

@Document(collection = "Book")
public class Books
{
    //Defining book id as primary key
    private ObjectId id;
    private String Title;
    private String Author;
    public ObjectId getBookid()
    {
        return id;
    }
    public String getTitle()
    {
        return Title;
    }
    public void setTitle(String Title)
    {
        this.Title = Title;
    }
    public String getAuthor()
    {
        return Author;
    }
    public void setAuthor(String Author)
    {
        this.Author = Author;
    }
}