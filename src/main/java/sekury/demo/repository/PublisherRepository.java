package sekury.demo.repository;

import org.springframework.data.repository.CrudRepository;
import sekury.demo.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
