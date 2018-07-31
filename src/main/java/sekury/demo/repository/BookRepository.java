package sekury.demo.repository;

import org.springframework.data.repository.CrudRepository;
import sekury.demo.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
