package com.springmvc.demo.controller;

import com.springmvc.demo.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class RESTfulController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User testRequestBody(@RequestBody User user) {
        return user;
    }

    @RequestMapping(value = "/file", method = RequestMethod.POST)
    public User testFileUpload(MultipartFile file) {
        return new User(file.getOriginalFilename(), (int) (file.getSize() / 1024));
    }
}
