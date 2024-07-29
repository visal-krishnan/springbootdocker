package com.ust.springboot_docker_jenkins.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Dockercontroller {

    @GetMapping("/docker")
    public String dockerTest(){
        return "Docker is running";
    }

}
