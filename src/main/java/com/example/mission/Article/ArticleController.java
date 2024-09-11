package com.example.mission.Article;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/article")
@Controller
public class ArticleController {

    @GetMapping("/list")
    public String articleList (){
        return "article_list";
    }
}
