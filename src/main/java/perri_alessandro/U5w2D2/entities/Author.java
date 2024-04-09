package perri_alessandro.U5w2D2.entities;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    private long id;
    private String nome;
    private String cognome;
    private String mail;
    private LocalDate dataNascita;
    private String imageUrl = "https://as1.ftcdn.net/v2/jpg/03/46/83/96/1000_F_346839683_6nAPzbhpSkIpb8pmAwufkC7c5eD7wYws.jpg";


}


