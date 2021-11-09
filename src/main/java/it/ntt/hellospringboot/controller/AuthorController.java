package it.ntt.hellospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import it.ntt.hellospringboot.Repository.AuthorRespository;

@Controller
public class AuthorController {
 
    private final AuthorRespository authorRespository;

    //Costruttore della classe
    public AuthorController (AuthorRespository authorRespository){
        this.authorRespository=authorRespository;
    }

    @RequestMapping("/authors")
    public String getAuthor(Model model) {
        model.addAttribute("authors", authorRespository.findAll());
        // bookRepository.findAll() --> mi restitusice un oggetto iterabile
        
        return "authors";
    }

}
