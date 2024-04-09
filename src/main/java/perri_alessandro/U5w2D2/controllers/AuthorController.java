package perri_alessandro.U5w2D2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import perri_alessandro.U5w2D2.entities.Author;
import perri_alessandro.U5w2D2.services.AuthorService;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService;


    // GET .../authors
    @GetMapping
    private List<Author> getAllBlogPost() {
        return this.authorService.getAuthorList();
    }

    // POST .../authors (+ body)
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // Status Code 201
    private Author saveAuthor(@RequestBody Author body) {
        return this.authorService.saveAuthor(body);
    }

    // GET .../authors/{authId}
    @GetMapping("/{authId}")
    private Author findBlogById(@PathVariable long authId) {
        return this.authorService.findById(authId);
    }

    // PUT .../authors/{authId} (+ body)
    @PutMapping("/{authId}")
    private Author findBlogByIdAndUpdate(@PathVariable long authId, @RequestBody Author body) {
        return this.authorService.findByIdAndUpdate(authId, body);
    }

    // DELETE .../authors/{authId}
    @DeleteMapping("/{authId}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // Status Code 204
    private void findByBlogIdAndDelete(@PathVariable long authId) {
        this.authorService.findByIdAndDelete(authId);
    }
}
