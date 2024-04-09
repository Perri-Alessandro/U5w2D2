package perri_alessandro.U5w2D2.services;

import org.springframework.stereotype.Service;
import perri_alessandro.U5w2D2.entities.BlogPost;
import perri_alessandro.U5w2D2.exceptions.NotFoundException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class BlogPostService {
    private List<BlogPost> blogPostList = new ArrayList<>();

    public List<BlogPost> getBlogPostList() {
        return this.blogPostList;
    }

    public BlogPost saveBlogPost(BlogPost body) {
        Random rndm = new Random();
        body.setId(rndm.nextInt(1, 10000));
        this.blogPostList.add(body);
        return body;
    }

    public BlogPost findById(long id) {
        BlogPost trovato = null;
        for (BlogPost aut : this.blogPostList) {
            if (aut.getId() == id) trovato = aut;
        }
        if (trovato == null) throw new NotFoundException(id);
        else return trovato;
    }

    public BlogPost findByIdAndUpdate(long id, BlogPost updatedAut) {
        BlogPost trovato = null;
        for (BlogPost aut : this.blogPostList) {
            if (aut.getId() == id) {
                trovato = aut;
                trovato.setCategory(updatedAut.getCategory());
                trovato.setTitolo(updatedAut.getTitolo());
                trovato.setCover(updatedAut.getCover());
                trovato.setContenuto(updatedAut.getContenuto());
                trovato.setMinutiLettura(updatedAut.getMinutiLettura());
            }
        }
        if (trovato == null) throw new NotFoundException(id);
        else return trovato;
    }

    public void findByIdAndDelete(long id) {
        Iterator<BlogPost> iter = this.blogPostList.iterator();

        while (iter.hasNext()) {
            BlogPost current = iter.next();
            if (current.getId() == id) {
                iter.remove();
            }
        }
    }
}
