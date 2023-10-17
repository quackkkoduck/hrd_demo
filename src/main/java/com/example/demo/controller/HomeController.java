// package com.example.demo.controller;

// import java.util.ArrayList;
// import java.util.List;

// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

// import lombok.extern.slf4j.Slf4j;

// @Controller //Annotation
// @Slf4j
// public class HomeController {
//     @RequestMapping("/")
//     public String home(){
//         log.debug("debug");
//         log.warn("warn");
//         log.error("error");
//         System.out.println("prnt");
//         return "home"; //home.html 작성필요함
//     }
//     @RequestMapping("/home2")
//     public String home2(){
//         return "home"; //home.html 작성필요함 ,응답결과가 html
//     }
//     @RequestMapping("/home3")
//     @ResponseBody
//     public List<String> home3(){
//         List<String> list = new ArrayList<>(); 
//         list.add("A");
//         list.add("b");
//         list.add("c");
//         return list; //응답결과가 JSON 즉 []
//     }
// }
