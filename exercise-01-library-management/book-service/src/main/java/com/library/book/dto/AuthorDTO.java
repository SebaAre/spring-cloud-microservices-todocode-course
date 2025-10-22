package com.library.book.dto;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

public class AuthorDTO {
    
    private Long id;
    
    private String fullName;
    
    private LocalDate birthDate;
    
    private List<Long> bookIds;
    
}
