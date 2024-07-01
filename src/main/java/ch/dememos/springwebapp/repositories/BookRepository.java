package ch.dememos.springwebapp.repositories;

import ch.dememos.springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
