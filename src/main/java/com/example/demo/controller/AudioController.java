package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller //Annotation
@Slf4j
public class AudioController{
    @RequestMapping("/audio")
    public String home(){
        log.debug("debug");
        log.warn("warn");
        log.error("error");
        System.out.println("prnt");
        return "home"; //home.html 작성필요함
    }
}