package com.lee.controller;

import com.lee.entity.Post;
import com.lee.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.PrimitiveIterator;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lee
 * @since 2024-11-18
 */
@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private IPostService postService;

    @GetMapping("/list")
    public List<Post> getAllPost(){
        return postService.list();
    }

    @PostMapping("/addpost")
    public boolean createPost(@RequestBody Post post) {
        return postService.save(post);
    }

}
