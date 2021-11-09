package it.ntt.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import it.ntt.hellospringboot.Repository.BookRepository;

@Controller
public class BookController {

    /*
    @RequestMapping("/books")
    public String getBooks() {
        return "books";
    }*/

    //Predniamo un riferimento del repository
    private final BookRepository bookRepository;
    public BookController (BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        // bookRepository.findAll() --> mi restitusice un oggetto iterabile
        
        return "books";
    }
}
