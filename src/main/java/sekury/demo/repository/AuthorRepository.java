package sekury.demo.repository;

import org.springframework.data.repository.CrudRepository;
import sekury.demo.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
