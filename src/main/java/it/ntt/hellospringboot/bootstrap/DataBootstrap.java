package it.ntt.hellospringboot.bootstrap;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import it.ntt.hellospringboot.Repository.AuthorRespository;
import it.ntt.hellospringboot.Repository.BookRepository;
import it.ntt.hellospringboot.model.Author;
import it.ntt.hellospringboot.model.Book;

//Per dire che esiste a Spring Boot
@Component
public class DataBootstrap implements CommandLineRunner{

    //Final perch dev'essere quello e nond ev'essere cambiato il repository
    private final AuthorRespository authorRespository;
    private final BookRepository bookRepository;
    //Costruttore per assegnare il repository
    //Sarà spring boot a sapere che oggetto passare a ciò
   //non ho bisogno di @Autowired perchè ho un buon costruttore
    public DataBootstrap(AuthorRespository authorRespository, BookRepository bookRepository) {
        this.authorRespository = authorRespository;
        this.bookRepository= bookRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        //Il run viene eseguit all avvio per popolare la tabella

        Author a1 = new Author("Carlo","Carli");
        Book l1 = new Book("Primo Libro", "123-abc");
        l1.setAuthor(a1);

        //Per salvarlo nel mio database
        //L ordine è importante perchè l autore deve esistere prima
        //di libro perchè libro non può esistere senza authore!
        authorRespository.save(a1);
        bookRepository.save(l1);

        Book l2 = new Book("Secondo Libro", "324-abc");
        l2.setAuthor(a1);
        
        bookRepository.save(l2);

        Author a2 = new Author("Sara","Foletti");
        Book l3 = new Book("Primo Libro", "356-abc");
        l3.setAuthor(a2);

        authorRespository.save(a2);
        bookRepository.save(l3);
    }
    


}

