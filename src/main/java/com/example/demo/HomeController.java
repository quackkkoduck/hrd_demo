package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller // Annotation 주석/부가설명 = coment
@Slf4j
public class HomeController {
    @RequestMapping("/")
    public String home( @RequestParam("pageNo") int pageNo ) { 
        System.out.println(pageNo);
        log.debug("debug");
        log.warn("warn");
        log.error("error");
        System.out.println("print");
        return "home"; // home.html 작성 해줘야 함
    }                  // 응답결과가 HTML

    @RequestMapping("/home2")
    public String home2() {
        return "home"; // home.html 작성 해줘야 함
    }                  // 응답결과가 HTML

    @RequestMapping("/home3")
    @ResponseBody
    public List<String> home3() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        return list; // 응답결과가 JSON [] 대괄호
    }
}