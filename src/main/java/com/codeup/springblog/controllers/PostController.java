package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

// TODO: This controller should return strings for the following routes that describe what will ultimately be there.
@Controller
public class PostController {
    @GetMapping("/posts")
    public String postsIndex() {
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    public String postsById(@PathVariable int id) {
        return "view an individual post";
    }

    @GetMapping("/posts/create")
    public String postsGetCreate() {
        return "view the form for creating a post";
    }

    @PostMapping("/posts/create")
    public String postsCreate() {
        return "create a new post";
    }
}
