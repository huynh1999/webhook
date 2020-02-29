package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @GetMapping("/post")
    public String post(@RequestParam("hub.challenge") String challenge,@RequestParam("hub.verify_token")String token)
    {
        System.out.println(challenge);
        System.out.println(token);
        return challenge;
    }
    @PostMapping("/post")
    public String getPost(@RequestBody String body)
    {
        return body;
    }
}
