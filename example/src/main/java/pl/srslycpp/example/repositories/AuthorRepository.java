package pl.srslycpp.example.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.srslycpp.example.pl.srslycpp.example.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
