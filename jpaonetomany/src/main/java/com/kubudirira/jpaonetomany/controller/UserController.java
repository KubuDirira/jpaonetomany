package com.kubudirira.jpaonetomany.controller;



import com.kubudirira.jpaonetomany.model.Post;
import com.kubudirira.jpaonetomany.model.User;
import com.kubudirira.jpaonetomany.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/user")
@Slf4j
public class UserController {


    private final UserService userService;

    @GetMapping("/all")
    public List<User> findAllUsers(){
        return userService.findAll();
    }
    @PostMapping("/save")
    public void save(@RequestBody User user){
        userService.save(user);
    }
    @PostMapping("/assignPost/{user_id}")
    public void assignPassport(@RequestBody Post post, @PathVariable int user_id){

        User user = userService.findById(user_id).get();
        List<Post> posts = user.getPost();
        posts.add(post);
        user.setPost(posts);
        userService.save(user);
    }
    @GetMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        userService.deleteById(id);
    }

    @PostMapping("/updateUser/{user_id}")
    public void updateUser(@RequestBody User user, @PathVariable int user_id) {
        userService.update(user_id,user);
    }

    @PostMapping("/updatePost/{user_id}")
    public void updatePost(@RequestBody Post post, @PathVariable int user_id) {
        //COMPLETE THIS PART
    }



}
