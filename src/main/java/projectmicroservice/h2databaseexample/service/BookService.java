package projectmicroservice.h2databaseexample.service;

import projectmicroservice.h2databaseexample.dto.BookDTO;

import java.util.List;

public interface BookService {

    void create(BookDTO dto);

    List<BookDTO> findAll();
}
