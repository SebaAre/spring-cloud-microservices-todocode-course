package com.library.book.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookWithAuthorsDTO {
    
    private Long id;
    
    private String isbn;
    
    private String title;
    
    private Integer year;
    
    private String description;
    
    private List<AuthorDTO> authors;
    
}
