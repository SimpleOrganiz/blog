package pl.bartoszczeciba.blog.service;


import org.springframework.stereotype.Service;
import pl.bartoszczeciba.blog.domain.BlogPost;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogPostServiceImpl implements BlogPostService {
    private List<BlogPost> blogPostList = new ArrayList<>();

    public List<BlogPost> getAllBlogPost() {
        return blogPostList;

    }

    public BlogPost getOneBlogPost(String title) {
        return null;
    }

    public void saveBlogPost(BlogPost blogPost) {
        if(blogPost.getText() != null && blogPost.getTitle() != null )
        {
            blogPostList.add(blogPost);
        }
    }

    public boolean deleteBlogPostById(String title) {
        return true;
    }

    public void updateBlogPost(){}

    private void inicjalization(){

    }
}