package com.stackroute.service;


/* Add annotation to declare this class as Service class.
 * Also it should implement BlogService Interface and override all the implemented methods.*/

import com.stackroute.domain.Blog;
import com.stackroute.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {

      @Autowired
      private BlogRepository repository;

    @Override
    public Blog saveBlog(Blog blog) {
        Optional<Blog> optionalBlog = repository.saveBlog(blog);
        return optionalBlog();
    }

    @Override
    public List<Blog> getAllBlogs()
    {
        return repository.getAllBlogs();
    }

    @Override
    public Blog getBlogById(int blogId)
    {
        Optional<Blog> blogById = repository.getBlogById(blogId);
        return  blogById();
    }
    @Override
    public void deleteBlog(int blogId) {

        repository.deleteBlog(blogId);
    }

   @Override
    public Blog updateBlog(Blog newBlog, Integer blogId)
    {
        return repository.updateBlog(newBlog, blogId);
    }
}
