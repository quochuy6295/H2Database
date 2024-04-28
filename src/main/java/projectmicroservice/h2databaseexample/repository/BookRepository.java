package projectmicroservice.h2databaseexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectmicroservice.h2databaseexample.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
