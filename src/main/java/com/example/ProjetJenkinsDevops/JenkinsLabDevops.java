package com.example.ProjetJenkinsDevops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JenkinsLabDevops {
    @GetMapping("/testing")
    public String monMessage() {
        return "This Testing in Order to Deploy"
                + '\'' + "Jenkins Integration with Tomcat For Deployment"
                + '\'' + "Made it By NACIRI Abdelilah";
    }
}
