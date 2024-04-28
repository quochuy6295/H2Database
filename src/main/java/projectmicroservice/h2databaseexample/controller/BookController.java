package projectmicroservice.h2databaseexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projectmicroservice.h2databaseexample.dto.BookDTO;
import projectmicroservice.h2databaseexample.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public void create(@RequestBody BookDTO dto) {
        bookService.create(dto);
    }

    @GetMapping
    public List<BookDTO> findAll() {
        return bookService.findAll();
    }
}
