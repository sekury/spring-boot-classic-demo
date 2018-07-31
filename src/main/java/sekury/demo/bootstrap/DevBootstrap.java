package sekury.demo.bootstrap;

import lombok.RequiredArgsConstructor;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import sekury.demo.model.Author;
import sekury.demo.model.Book;
import sekury.demo.repository.AuthorRepository;
import sekury.demo.repository.BookRepository;

@Component
@RequiredArgsConstructor
public class DevBootstrap {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @EventListener(value = ContextRefreshedEvent.class)
    private void initData() {
        Author a1 = new Author();
        a1.setFirstName("John");
        a1.setLastName("Doe");

        Book b1 = new Book();
        b1.setTitle("Peace & War");
        b1.setIsbn("123");
        b1.setPublisher("Greatest Hits Ever");

        a1.getBooks().add(b1);
        b1.getAuthors().add(a1);

        authorRepository.save(a1);
        bookRepository.save(b1);
    }
}
