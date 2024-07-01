package ch.dememos.springwebapp.repositories;

import ch.dememos.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
