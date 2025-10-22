package com.library.book.client;

import com.library.book.dto.AuthorDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "author-service", url = "http://localhost:9001") 
public interface AuthorClient {
    
    @GetMapping("/authors/{id}")
    AuthorDTO getAuthorById(@PathVariable("id") Long id);
    
}
