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
    @GetMapping("/{blogId}")
    private BlogPost findBlogById(@PathVariable long blogId) {
        return this.blogPostService.findById(blogId);
    }

    // PUT .../blogPost/{postId} (+ body)
    @PutMapping("/{blogId}")
    private BlogPost findBlogByIdAndUpdate(@PathVariable long blogId, @RequestBody BlogPost body) {
        return this.blogPostService.findByIdAndUpdate(blogId, body);
    }

    // DELETE .../blogPost/{postId}
    @DeleteMapping("/{blogId}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // Status Code 204
    private void findByBlogIdAndDelete(@PathVariable long blogId) {
        this.blogPostService.findByIdAndDelete(blogId);
    }

}
