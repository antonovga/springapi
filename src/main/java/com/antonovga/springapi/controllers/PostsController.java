package com.antonovga.springapi.controllers;

import com.antonovga.springapi.models.Post;
import com.antonovga.springapi.repos.PostRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {
    private PostRepo repo;

    public PostsController(PostRepo repo) {
        this.repo = repo;
    }

    @GetMapping("/posts")
    public Iterable<Post> index() {
        return repo.findAll();
    }
}
