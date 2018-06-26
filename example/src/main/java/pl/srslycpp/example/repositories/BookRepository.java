package pl.srslycpp.example.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.srslycpp.example.pl.srslycpp.example.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
