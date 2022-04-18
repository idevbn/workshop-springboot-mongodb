package com.sbmongo.workshopmongo.resources;

import com.sbmongo.workshopmongo.domain.Post;
import com.sbmongo.workshopmongo.domain.User;
import com.sbmongo.workshopmongo.dto.UserDTO;
import com.sbmongo.workshopmongo.services.PostService;
import com.sbmongo.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService postService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = postService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
