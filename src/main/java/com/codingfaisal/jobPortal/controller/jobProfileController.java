package com.codingfaisal.jobPortal.controller;


import com.codingfaisal.jobPortal.model.jobProfile;
import com.codingfaisal.jobPortal.repository.jobProfileRepository;
import com.codingfaisal.jobPortal.repository.searchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class jobProfileController
{

    @Autowired
    jobProfileRepository repo;

    @Autowired
    searchRepository sRepo;

    @ApiIgnore
    @RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/allPosts")
    @CrossOrigin
    public List<jobProfile> getAllPosts()
    {
        return repo.findAll();
    }
    // posts/java
    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<jobProfile> search(@PathVariable String text)
    {
        return sRepo.findByText(text);
    }

    @PostMapping("/post")
    @CrossOrigin
    public jobProfile addPost(@RequestBody jobProfile post)
    {
        return repo.save(post);
    }

}