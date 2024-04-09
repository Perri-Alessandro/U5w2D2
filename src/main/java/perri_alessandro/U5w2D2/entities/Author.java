package perri_alessandro.U5w2D2.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String cognome;
    private String mail;
    private LocalDate dataNascita;
    private String imageUrl = "https://as1.ftcdn.net/v2/jpg/03/46/83/96/1000_F_346839683_6nAPzbhpSkIpb8pmAwufkC7c5eD7wYws.jpg";

    public Author(String nome, String cognome, String mail, LocalDate dataNascita, String imageUrl) {
        this.nome = nome;
        this.cognome = cognome;
        this.mail = mail;
        this.dataNascita = dataNascita;
        this.imageUrl = imageUrl;
    }
    
}


