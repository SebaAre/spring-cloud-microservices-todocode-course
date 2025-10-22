package com.library.author.service;

import com.library.author.model.Author;
import java.util.List;


public interface AuthorService {
    
    List<Author> findAll();
    
    Author findById(Long id);
    
    Author save(Author author);
    
    Author update(Author author);
   
    void delete(Long id);
     
}
