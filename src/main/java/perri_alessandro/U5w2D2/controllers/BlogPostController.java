package perri_alessandro.U5w2D2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import perri_alessandro.U5w2D2.entities.BlogPost;
import perri_alessandro.U5w2D2.services.BlogPostService;

import java.util.List;

@RestController
@RequestMapping("/blogPost")
public class BlogPostController {

    @Autowired
    private BlogPostService blogPostService;


    // GET .../blogPost
    @GetMapping
    private List<BlogPost> getAllBlogPost() {
        return this.blogPostService.getBlogPostList();
    }

    // POST .../blogPost (+ body)
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // Status Code 201
    private BlogPost saveBlogPost(@RequestBody BlogPost body) {
        return this.blogPostService.saveBlogPost(body);
    }

    // GET .../blogPost/{postId}
    @GetMapping("/{postId}")
    private BlogPost findBlogById(@PathVariable int blogId) {
        return this.blogPostService.findById(blogId);
    }

    // PUT .../blogPost/{postId} (+ body)
    @PutMapping("/{postId}")
    private BlogPost findBlogByIdAndUpdate(@PathVariable int postId, @RequestBody BlogPost body) {
        return this.blogPostService.findByIdAndUpdate(postId, body);
    }

    // DELETE .../blogPost/{postId}
    @DeleteMapping("/{postId}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // Status Code 204
    private void findByBlogIdAndDelete(@PathVariable int postId) {
        this.blogPostService.findByIdAndDelete(postId);
    }

}
