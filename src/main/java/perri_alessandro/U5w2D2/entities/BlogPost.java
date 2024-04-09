package perri_alessandro.U5w2D2.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String category;
    private String titolo;
    private String cover;
    private String contenuto;
    private double minutiLettura;

    public BlogPost(String category, String titolo, String cover, String contenuto, double minutiLettura) {
        this.category = category;
        this.titolo = titolo;
        this.cover = cover;
        this.contenuto = contenuto;
        this.minutiLettura = minutiLettura;
    }


}
