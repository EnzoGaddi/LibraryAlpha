package ie.atu.libraryalpha;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BooksRepository extends JpaRepository<Books, Long> {
    Optional<Books> findBytitle(String Title);
}
