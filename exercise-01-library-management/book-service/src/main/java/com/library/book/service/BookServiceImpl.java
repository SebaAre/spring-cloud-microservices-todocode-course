package com.library.book.service;

import com.library.book.client.AuthorClient;
import com.library.book.dto.AuthorDTO;
import com.library.book.dto.BookWithAuthorsDTO;
import com.library.book.model.Book;
import com.library.book.repository.BookRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;
    
    @Autowired
    private AuthorClient authorClient;
    
    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book update(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
    
    public BookWithAuthorsDTO getBookWithAuthors(Long id) {
        Book book = bookRepository.findById(id).orElse(null);
    
        if (book == null) {
            return null;
        }
    
        List<AuthorDTO> authors = new ArrayList<>();
    
        if (book.getAuthorIds() != null) {
            for (Long authorId : book.getAuthorIds()) {
                AuthorDTO author = authorClient.getAuthorById(authorId);
                if (author != null) {
                    authors.add(author);
                }
            }
        }
    
        BookWithAuthorsDTO response = new BookWithAuthorsDTO();
        response.setId(book.getId());
        response.setIsbn(book.getIsbn());
        response.setTitle(book.getTitle());
        response.setYear(book.getYear());
        response.setDescription(book.getDescription());
        response.setAuthors(authors); 
    
        return response;
    }
    
}
