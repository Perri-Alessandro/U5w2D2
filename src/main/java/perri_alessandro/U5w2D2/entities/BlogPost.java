package perri_alessandro.U5w2D2.entities;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BlogPost {
    private long id;
    private String category;
    private String titolo;
    private String cover;
    private String contenuto;
    private double minutiLettura;

}
