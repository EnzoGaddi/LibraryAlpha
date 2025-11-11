package ie.atu.libraryalpha;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private float Price;
    private String Title;
    private String Author;
    private String Genre;
}
