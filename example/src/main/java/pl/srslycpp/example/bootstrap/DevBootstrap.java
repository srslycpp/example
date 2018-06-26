package pl.srslycpp.example.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import pl.srslycpp.example.pl.srslycpp.example.model.Author;
import pl.srslycpp.example.pl.srslycpp.example.model.Book;
import pl.srslycpp.example.pl.srslycpp.example.model.Publisher;
import pl.srslycpp.example.repositories.AuthorRepository;
import pl.srslycpp.example.repositories.BookRepository;
import pl.srslycpp.example.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){
        Publisher ericsPub = new Publisher();
        ericsPub.setAddress("tatarska 2 ");
        ericsPub.setName("zdzichu");
        publisherRepository.save(ericsPub);

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "1234",ericsPub );
        eric.getBooks().add(ddd);
        //ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);


        Publisher rodsPub = new Publisher();
        rodsPub.setAddress("tatarska 3 ");
        rodsPub.setName("tomcio");
        publisherRepository.save(rodsPub);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE", "23456", rodsPub);
        rod.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        }
}
