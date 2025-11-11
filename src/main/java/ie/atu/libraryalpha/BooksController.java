package ie.atu.libraryalpha;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksController {
    private final BooksRepository repo;

    public BooksController(BooksRepository repo) {
        this.repo = repo;
    }

    public Books create(Books b) {
        return repo.save(b);
    }

    public List<Books> findAll() {
        return repo.findAll();
    }

    public Books findBytitle(String ID) {
        return repo.findBytitle(ID)
                .orElseThrow(() -> new IllegalArgumentException("Book not found"));
    }

    public Books Update(Books b) {
        return repo.save(b);
    }
}
