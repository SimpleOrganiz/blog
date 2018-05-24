package pl.bartoszczeciba.blog.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.bartoszczeciba.blog.domain.BlogPost;
import pl.bartoszczeciba.blog.service.BlogPostService;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@CrossOrigin(origins = "http://localhost:8081")
public class BlogPostController {

    @Autowired
    private BlogPostService blogPostService;

    @GetMapping
    public List<BlogPost> getAllBlogPost(){
        return blogPostService.getAllBlogPost();
    }

    @GetMapping("/{title}")
    public BlogPost getBlogPostById(@PathVariable String title){
        return blogPostService.getOneBlogPost(title);
    }

    @DeleteMapping("/{title}")
    public  boolean deleteBlogPost(@PathVariable String title){
        return blogPostService.deleteBlogPostById(title);
    }

    @PostMapping
    public void saveBlogPost(@RequestBody BlogPost blogPost){
        blogPostService.saveBlogPost(blogPost);
    }

    @PutMapping("/{title}")
    public void updateBlogPost(@PathVariable String title){
    }

}
