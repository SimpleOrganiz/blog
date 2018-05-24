package pl.bartoszczeciba.blog.service;

import pl.bartoszczeciba.blog.domain.BlogPost;

import java.util.List;

public interface BlogPostService {

    List<BlogPost> getAllBlogPost();

    BlogPost getOneBlogPost(String title);

    void saveBlogPost(BlogPost blogPost);

    boolean deleteBlogPostById(String title);

    void updateBlogPost();
}
