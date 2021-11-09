package it.ntt.hellospringboot.model;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;



    private String name;
    private String surname;

    
    //Realzione che lega authore al libro ->In questo modo book si trasferoma 
    //automaticamente in bean
    @OneToMany(mappedBy = "author") 
    private Set<Book> bookSet = new HashSet<>();

    //Costruttore personalizzato
    public Author (String name, String surname) {
        this.name=name;
        this.surname=surname;
    }

    //Costruttore vuoto
    public Author () {}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setSurname(String surname) {
        this.surname=surname;
    }

   

    public Set<Book> getBookSet () {
        return this.bookSet;
    }

    public void setBookSet (Set<Book> bookSet) {
        this.bookSet = bookSet;
    }
}
