package perri_alessandro.U5w2D2.services;

import org.springframework.stereotype.Service;
import perri_alessandro.U5w2D2.entities.Author;
import perri_alessandro.U5w2D2.exceptions.NotFoundException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class AuthorService {
    private List<Author> authorList = new ArrayList<>();

    public List<Author> getAuthorList() {
        return this.authorList;
    }

    public Author saveAuthor(Author body) {
        this.authorList.add(body);
        return body;
    }

    public Author findById(int id) {
        Author trovato = null;
        for (Author aut : this.authorList) {
            if (aut.getId() == id) trovato = aut;
        }
        if (trovato == null) throw new NotFoundException(id);
        else return trovato;
    }

    public Author findByIdAndUpdate(int id, Author updatedAut) {
        Author trovato = null;
        for (Author aut : this.authorList) {
            if (aut.getId() == id) {
                trovato = aut;
                trovato.setNome(updatedAut.getNome());
                trovato.setCognome(updatedAut.getCognome());
                trovato.setMail(updatedAut.getMail());
                trovato.setImageUrl(updatedAut.getImageUrl());
            }
        }
        if (trovato == null) throw new NotFoundException(id);
        else return trovato;
    }

    public void findByIdAndDelete(int id) {
        Iterator<Author> iter = this.authorList.iterator();

        while (iter.hasNext()) {
            Author current = iter.next();
            if (current.getId() == id) {
                iter.remove();
            }
        }
    }

}
