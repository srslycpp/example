package pl.srslycpp.example.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.srslycpp.example.pl.srslycpp.example.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
