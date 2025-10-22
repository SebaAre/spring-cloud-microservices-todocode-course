package com.library.book.service;

import com.library.book.model.Book;
import java.util.List;


public interface BookService {
    
    List<Book> findAll();
    
    Book findById(Long id);
    
    Book save(Book book);
    
    Book update(Book book);
    
    void delete(Long id);
      
}